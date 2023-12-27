package LinkedList ; 

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        System.out.println("Is list Empty: " +integerLinkedList.isEmpty()); 
 
         // creating manually linked list of 3 size
        Node<Integer> head = new Node <>(56) ; 
        head.next = new Node<Integer>(30) ;
        head.next.next = new Node<Integer>(70) ; 
       
           // using function 
        integerLinkedList.add(56);
        integerLinkedList.add(30);
        integerLinkedList.add(70);

        integerLinkedList.display();

        System.out.println("Is list Empty: " +integerLinkedList.isEmpty());

        System.out.println("Size of linked List: " +integerLinkedList.size());
        integerLinkedList.add(5);
        integerLinkedList.display();
        System.out.println("Size of linked List: " +integerLinkedList.size());

        integerLinkedList.insertAt(3,4);
        integerLinkedList.display();

        integerLinkedList.removeFrom(3);
        integerLinkedList.display();

         int position = integerLinkedList.find(11);
        System.out.println("Position of Element: " +position);
    }
}
