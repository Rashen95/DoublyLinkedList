public class Main {
    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        DoublyLinkedList.Node n1 = new DoublyLinkedList.Node();
        DoublyLinkedList.Node n2 = new DoublyLinkedList.Node();
        DoublyLinkedList.Node n3 = new DoublyLinkedList.Node();
        DoublyLinkedList.Node n4 = new DoublyLinkedList.Node();
        DoublyLinkedList.Node n5 = new DoublyLinkedList.Node();
        DoublyLinkedList.Node n6 = new DoublyLinkedList.Node();
        n1.value = 5;
        n2.value = 3;
        n3.value = 1;
        n4.value = 8;
        n5.value = 7;
        n6.value = 6;
        d.addLastNode(n1);
        d.addLastNode(n2);
        d.addLastNode(n3);
        d.addLastNode(n4);
        d.addLastNode(n5);
        d.addLastNode(n6);
        System.out.println("Двусвязный список:");
        d.printer();
        d.revert();
        System.out.println("\nПеревернутый двусвязный список:");
        d.printer();
    }
}