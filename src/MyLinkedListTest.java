public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);


        ll.add(4,9);
        ll.add(5,1);
        ll.printList();
    }
}