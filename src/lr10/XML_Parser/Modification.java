package lr10.XML_Parser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Modification {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            File inputFile = new File("src/lr10/XML_Parser/Books.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            // Настройка Transformer перед использованием
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            Element newBook= doc.createElement("book");
            doc.getDocumentElement().appendChild(newBook);

            Element newTitle = doc.createElement("title");
            System.out.println("Введите название книги");
            newTitle.appendChild(doc.createTextNode(in.nextLine()));
            newBook.appendChild(newTitle);

            Element newAuthor = doc.createElement("author");
            System.out.println("Введите автора книги");
            newAuthor.appendChild(doc.createTextNode(in.nextLine()));
            newBook.appendChild(newAuthor);

            Element newYear = doc.createElement("year");
            System.out.println("Введите год издания книги");
            newYear.appendChild(doc.createTextNode(in.nextLine()));
            newBook.appendChild(newYear);

            // Сохраняем изменения в файл
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lr10/XML_Parser/Books_result.xml"));
            transformer.transform(source, result);

            System.out.println("Книга успешно добавлена!");

            // Поиск книг Льва Толстого 1869 года (вариант с циклом)
            NodeList nodeList = doc.getElementsByTagName("book");
            List<Element> books = new ArrayList<>();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    NodeList authors = element.getElementsByTagName("author");
                    NodeList years = element.getElementsByTagName("year");

                    if (authors.getLength() > 0 && years.getLength() > 0) {
                        String author = authors.item(0).getTextContent();
                        String year = years.item(0).getTextContent();

                        if (author.equalsIgnoreCase("Л. Н. Толстой") && year.equals("1869")) {
                            books.add(element);
                        }
                    }
                }
            }

            System.out.println("Найдено книг Л. Н. Толстого 1869 года: " + books.size());

            // Вывод найденных книг
            for (Element book : books) {
                String title = book.getElementsByTagName("title").item(0).getTextContent();
                System.out.println(" - " + title);
            }

            // УДАЛЕНИЕ КНИГИ
            System.out.println("\nВведите название книги для удаления:");
            String titleToDelete = in.nextLine();

            NodeList allBooks = doc.getElementsByTagName("book");
            Element bookElement = null;

            for (int i = 0; i < allBooks.getLength(); i++) {
                Element book = (Element) allBooks.item(i);
                String currentTitle = book.getElementsByTagName("title").item(0).getTextContent();
                if (currentTitle.equalsIgnoreCase(titleToDelete)) {
                    bookElement = book;
                    break;
                }
            }

            if (bookElement != null) {
                Node parentNode = bookElement.getParentNode();
                parentNode.removeChild(bookElement);

                DOMSource source2 = new DOMSource(doc);
                StreamResult result2 = new StreamResult(new File("src/lr10/XML_Parser/Books_result.xml"));
                transformer.transform(source2, result2);

                System.out.println("Книга \"" + titleToDelete + "\" успешно удалена!");
            } else {
                System.out.println("Книга \"" + titleToDelete + "\" не найдена!");
            }

            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
