package lr10.JSON_Parser;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Scanner;


public class Modification {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/lr10/JSON_Parser/Books.json")));
            JSONObject jsonObject = new JSONObject(content);

            JSONArray jsonArray = jsonObject.getJSONArray("books");

            String author = "Пушкин";

            // Используем Stream API для поиска
            jsonArray.toList().stream()
                    .filter(book -> book instanceof JSONObject)
                    .map(book -> (JSONObject) book)
                    .filter(book -> author.equals(book.getString("author")))
                    .forEach(book -> {
                        System.out.println("\nТекущий элемент: book");
                        System.out.println("Название книги: " + book.getString("title"));
                        System.out.println("Автор: " + book.getString("author"));
                        System.out.println("Год издания: " + book.getInt("year"));
                    });

            // 3. Создаем новую книгу (JSONObject)
            JSONObject newBook = new JSONObject();
            Scanner in = new Scanner(System.in);
            System.out.println("Введите название книги: ");
            newBook.put("title", in.nextLine());
            System.out.println("Введите имя автора: ");
            newBook.put("author", in.nextLine());
            System.out.println("Введите год издания книги: ");
            newBook.put("year", in.nextLine());

            // 4. Добавляем книгу в массив
            jsonArray.put(newBook);

            // 5. Сохраняем изменения обратно в файл
            Files.write(Paths.get("src/lr10/JSON_Parser/Books.json"),
                    jsonObject.toString(4).getBytes());

            System.out.println("Книга успешно добавлена!");

            System.out.println("Введите название книги, которую хотите удалить: ");
            String title = in.nextLine();
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (title.equals(book.get("title"))) {
                    iterator.remove();
                }
            }
            Files.write(Paths.get("src/lr10/JSON_Parser/Books.json"),
                    jsonObject.toString(4).getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}