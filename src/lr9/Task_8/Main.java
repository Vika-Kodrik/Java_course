package lr9.Task_8;
public class Main {
    private Node head;

    // Внутренний класс для узла списка
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Main() {
        head = null;
    }
    // МЕТОДЫ С ИСПОЛЬЗОВАНИЕМ ЦИКЛА
    // а) Ввод с головы (создание списка с головы)
    public void createHead(int[] values) {
        head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            Node newNode = new Node(values[i]);
            newNode.next = head;
            head = newNode;
        }
    }
    // б) Ввод с хвоста (создание списка с хвоста)
    public void createTail(int[] values) {
        head = null;
        if (values.length == 0) return;

        head = new Node(values[0]);
        Node current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
    }
    // в) Вывод списка в строку
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;

        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(" -> ");
            }
            current = current.next;
        }
        return result.length() > 0 ? result.toString() : "Список пуст";
    }
    // г) Добавление элемента в начало списка
    public void AddFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    // д) Добавление элемента в конец списка
    public void AddLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    // е) Вставка элемента по индексу
    public void Insert(int index, int data) {
        if (index < 0) {
            throw new IllegalArgumentException("Индекс не может быть отрицательным");
        }
        if (index == 0) {
            AddFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
            }
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    // ж) Удаление первого элемента
    public void RemoveFirst() {
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }
        head = head.next;
    }
    // з) Удаление последнего элемента
    public void RemoveLast() {
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    // и) Удаление элемента по индексу
    public void Remove(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Индекс не может быть отрицательным");
        }
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }
        if (index == 0) {
            RemoveFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null || current.next == null) {
                throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
            }
            current = current.next;
        }
        if (current.next == null) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
        }
        current.next = current.next.next;
    }
    // РЕКУРСИВНЫЕ МЕТОДЫ
    // к) Ввод с головы (рекурсивно)
    public void createHeadRec(int[] values) {
        head = createHeadRecHelper(values, values.length - 1);
    }
    private Node createHeadRecHelper(int[] values, int index) {
        if (index < 0) {
            return null;
        }
        Node newNode = new Node(values[index]);
        newNode.next = createHeadRecHelper(values, index - 1);
        return newNode;
    }
    // л) Ввод с хвоста (рекурсивно)
    public void createTailRec(int[] values) {
        head = createTailRecHelper(values, 0);
    }
    private Node createTailRecHelper(int[] values, int index) {
        if (index >= values.length) {
            return null;
        }
        Node newNode = new Node(values[index]);
        newNode.next = createTailRecHelper(values, index + 1);
        return newNode;
    }
    // м) Рекурсивный вывод в строку
    public String toStringRec() {
        if (head == null) {
            return "Список пуст";
        }
        return toStringRecHelper(head);
    }
    private String toStringRecHelper(Node current) {
        if (current == null) {
            return "";
        }
        if (current.next == null) {
            return String.valueOf(current.data);
        }
        return current.data + " -> " + toStringRecHelper(current.next);
    }

    public static void main(String[] args) {
        Main list = new Main();

        System.out.println("Демонстрация работы с циклами");
        // Создание списка с головы
        int[] values1 = {1, 2, 3, 4, 5};
        list.createHead(values1);
        System.out.println("createHead: " + list);

        // Создание списка с хвоста
        int[] values2 = {10, 20, 30, 40, 50};
        list.createTail(values2);
        System.out.println("createTail: " + list);

        // Добавление в начало
        list.AddFirst(5);
        System.out.println("AddFirst(5): " + list);

        // Добавление в конец
        list.AddLast(60);
        System.out.println("AddLast(60): " + list);

        // Вставка по индексу
        list.Insert(2, 25);
        System.out.println("Insert(2, 25): " + list);

        // Удаление первого
        list.RemoveFirst();
        System.out.println("RemoveFirst: " + list);

        // Удаление последнего
        list.RemoveLast();
        System.out.println("RemoveLast: " + list);

        // Удаление по индексу
        list.Remove(2);
        System.out.println("Remove(2): " + list);

        System.out.println("\nДемонстрация рекурсивных методов");

        Main listRec = new Main();

        // Рекурсивное создание с головы
        int[] values3 = {100, 200, 300, 400, 500};
        listRec.createHeadRec(values3);
        System.out.println("createHeadRec: " + listRec.toStringRec());

        // Рекурсивное создание с хвоста
        Main listRec2 = new Main();
        int[] values4 = {1, 2, 3, 4, 5};
        listRec2.createTailRec(values4);
        System.out.println("createTailRec: " + listRec2.toStringRec());
    }
}
