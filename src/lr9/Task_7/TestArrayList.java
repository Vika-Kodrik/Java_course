package lr9.Task_7;
import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static int findLastPerson(int n) {
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }
        int index = 0;

        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index); // index уже указывает на следующего после удаленного
        }
        return people.getFirst();
    }
    public static void main(String[] args) {
        int n = 100000;

        long startTime = System.nanoTime();
        int result = findLastPerson(n);
        long endTime = System.nanoTime();

        System.out.println("Результат: " + result);
        System.out.println("Время выполнения: " + (endTime - startTime) / 1_000_000.0 + " мс");
    }
}

