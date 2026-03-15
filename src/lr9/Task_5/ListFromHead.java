package lr9.Task_5;
public class ListFromHead {
    public static void main(String[] args) {
        System.out.println("Создание списка с головы:");
        // Создание узлов
        Node node0 = new Node(0, null); // Голова списка
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        // Связывание с головы
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        // Вывод списка
        Node ref = node0;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
    }
}
