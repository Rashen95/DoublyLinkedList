public class DoublyLinkedList {
    Node head;
    Node tail;

    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }

    public void addLastNode(Node input) {
        if (head == null) {
            head = input;
        } else {
            tail.next = input;
            input.previous = tail;
        }
        tail = input;
    }

    public void printer() {
        Node currentNode = head;
        if (currentNode != null) {
            while (currentNode != null) {
                System.out.printf("%d ", currentNode.value);
                currentNode = currentNode.next;
            }
        } else {
            System.out.print("Список пуст");
        }
    }

    public static class Node {
        int value;
        Node next;
        Node previous;
    }
}