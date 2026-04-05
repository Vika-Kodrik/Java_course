package lr10.HTML_Parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class NewsParser {
    public static void main(String[] args) {
        try {
            // Используем RSS-ленту вместо главной страницы
            Document doc = Jsoup.connect("http://urfu.ru/news/?type=2").get();

            // В RSS элементы item содержат новости
            Elements items = doc.select("item");

            int count = 0;
            for (org.jsoup.nodes.Element item : items) {
                if (count >= 10) break;

                String title = item.select("title").text();
                String pubDate = item.select("pubDate").text();

                System.out.println("Тема: " + title);
                System.out.println("Дата: " + pubDate + "\n");
                count++;
            }

            if (count == 0) {
                System.out.println("Не удалось найти новости в RSS.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
