package lr10.HTML_Parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;

public class Modification {
    public static void main(String[] args) {
        Document doc = null;

        // Обработка ошибок с переподключением
        for (int attempt = 1; attempt <= 3; attempt++) {
            try {
                if (attempt == 1) {
                    doc = Jsoup.connect("http://urfu.ru/news/?type=2").get();
                    break;
                } else {
                    System.out.println("Подключение... попытка " + attempt);
                    doc = Jsoup.connect("http://urfu.ru/news/?type=2").get();
                    break;
                }
            } catch (IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
                if (attempt == 3) {
                    System.out.println("Не удалось подключиться.");
                    return;
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {}
            }
        }

        // Парсинг и запись в файл
        try {
            Elements items = doc.select("item");
            FileWriter writer = new FileWriter("src/lr10/HTML_Parser/News.txt", true);

            int count = 0;
            for (org.jsoup.nodes.Element item : items) {
                if (count >= 10) break;

                String title = item.select("title").text();
                String pubDate = item.select("pubDate").text();

                System.out.println("Тема: " + title);
                System.out.println("Дата: " + pubDate + "\n");

                writer.write("Тема: " + title + "\n");
                writer.write("Дата: " + pubDate + "\n\n");

                count++;
                }

            writer.close();
            System.out.println("Новости сохранены в news.txt");

            if (count == 0) {
                System.out.println("Новости не найдены.");
            }

        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }

    }
}
