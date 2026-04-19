package cource_work1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ProductInfo {
    String shopName;
    String title;
    String price;
    String availability;

    public ProductInfo(String shopName, String title, String price, String availability) {
        this.shopName = shopName;
        this.title = title;
        this.price = price;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s | Цена: %s | %s", shopName, title, price, availability);
    }
}

public class Parser {

    public static void main(String[] args) {

        // пока URL-заглушки
        List<String> urls = List.of(
                "https://shop1",
                "https://shop2"
        );

        List<ProductInfo> results = new ArrayList<>();

        for (String url : urls) {
            System.out.println("Обрабатываю: " + url);

            try {
                Document doc = downloadPage(url);

                ProductInfo product = parseByShopType(url, doc);

                if (product != null) {
                    results.add(product);
                } else {
                    System.out.println("ОШИБКА: Не удалось найти данные на странице");
                }

            } catch (IOException e) {
                System.err.println("ОШИБКА СЕТИ: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("НЕИЗВЕСТНАЯ ОШИБКА: " + e.getMessage());
            }
        }

        // Печатаем итоговый список
        if (results.isEmpty()) {
            System.out.println("Ничего не найдено.");
        } else {
            results.forEach(System.out::println);
        }
    }

    /*
     * Скачивает HTML страницу с User-Agent как у обычного браузера,
     * чтобы магазины не блокировали бота.
     */
    private static Document downloadPage(String url) throws IOException {
        return Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
                .timeout(10000) // 10 секунд ожидания
                .get();
    }

    /**
     * Заглушка: выбирает логику парсинга в зависимости от домена в URL.
     * В реальном проекте здесь будет if-else для каждого сайта.
     */
    private static ProductInfo parseByShopType(String url, Document doc) {
        // Пока сайты не определены, делаем вид, что у каждого сайта своя структура
        if (url.contains("bla-bla")) {
            return blabla(doc);
        } else if (url.contains("boo-boo")) {
            return boo(doc);
        } else {
            // Универсальная попытка найти хоть что-то (заглушка)
            return parseGenericStub(doc);
        }
    }

    // МЕТОДЫ ДЛЯ КОНКРЕТНЫХ МАГАЗИНОВ

    private static ProductInfo blabla(Document doc) {
        // В реальности тут будут селекторы типа: ".product-title", ".price-value" и т.д.
        Element titleElement = doc.selectFirst(".example1"); // ЗАГЛУШКА
        Element priceElement = doc.selectFirst(".example2"); // ЗАГЛУШКА
        Element stockElement = doc.selectFirst(".example3");  // ЗАГЛУШКА


        if (titleElement == null || priceElement == null) {
            return null;
        }

        String title = titleElement.text();
        String price = priceElement.text();
        String stock = stockElement != null ? stockElement.text() : "Наличие неизвестно";

        return new ProductInfo("blabla", title, price, stock);
    }

    private static ProductInfo boo(Document doc) {
        Element titleElement = doc.selectFirst("example1"); // ЗАГЛУШКА
        Element priceElement = doc.selectFirst("example2"); // ЗАГЛУШКА
        Element stockElement = doc.selectFirst("example3");   // ЗАГЛУШКА

        if (titleElement == null || priceElement == null) {
            return null;
        }

        String title = titleElement.text();
        String price = priceElement.text();
        String stock = stockElement != null ? "В наличии" : "Под заказ";

        return new ProductInfo("boo", title, price, stock);
    }

    /**
     * Универсальная попытка найти JSON-LD разметку (часто бывает в интернет-магазинах).
     * Пока просто пример, как можно вытащить данные без привязки к классам.
     */
    private static ProductInfo parseGenericStub(Document doc) {
        Elements scripts = doc.select("script[type=application/ld+json]");

        // Просто ищем упоминание цены в первом попавшемся скрипте (ОЧЕНЬ ГРУБО, но для примера сойдет)
        if (!scripts.isEmpty()) {
            String jsonText = scripts.first().html();
            if (jsonText.contains("\"price\"")) {
                // Это заглушка. В реальности здесь нужно парсить JSON библиотекой (Gson/Jackson)
                return new ProductInfo("Generic", "Товар (из JSON)", "1000 руб", "В наличии");
            }
        }

        // Если JSON нет, пробуем найти title страницы
        String title = doc.title();
        return new ProductInfo("Generic", title, "Цена не найдена", "Неизвестно");
    }
}
