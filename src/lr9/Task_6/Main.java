package lr9.Task_6;
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Яблоко");
        map.put(2, "Груша");
        map.put(3, "Апельсин");
        map.put(4, "Банан");
        map.put(5, "Киви");
        map.put(6, "Мандарин");
        map.put(7, "Ананас");
        map.put(8, "Виноград");
        map.put(9, "Клубника");
        map.put(10, "Арбуз");
        // Ключи > 5
        System.out.println("Ключи > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
        // Ключ = 0
        if (map.containsKey(0)) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getKey() == 0) {
                    if (sb.length() > 0) sb.append(", ");
                    sb.append(entry.getValue());
                }
            }
            System.out.println("Ключ 0: " + sb.toString());
        } else {
            System.out.println("Ключ 0 отсутствует");
        }
        // Произведение ключей с длиной строки > 5
        int product = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
            }
        }
        System.out.println("Произведение: " + product);
    }
}
/*Заполнить HashMap 10 объектами <Integer, String>. Найти строки у которых ключ> 5.
Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина строки>5.*/
