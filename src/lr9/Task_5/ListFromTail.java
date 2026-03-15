package lr9.Task_5;
public class ListFromTail {
    public static void main(String[] args) {
        System.out.println("Создание списка с хвоста:");
        // Создание узлов с хвоста
        Node node3 = new Node(3, null); // Хвост списка
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        Node node0 = new Node(0, node1); // Голова списка
        // Вывод списка
        Node ref = node0;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
    }
}
