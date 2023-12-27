package LinkedList ;
public class LinkedList<T> {

    Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
        } else{
            Node<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display(){
        Node<T> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int size() {
        int count = 0;
        Node<T> temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void insertAt(int position, T data) {
        if(position < 0 || position > size()){
            System.out.println("Invalid Position");
            return;
        }
        Node<T> newNode = new Node<>(data);
        if(position == 0){
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> temp = head;
            for(int i = 0; i < position - 1; i++){
                    temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void removeFrom(int position) {
        if(isEmpty() || position < 0 || position >= size()){
            System.out.println("Invalid Position");
            return;
        }
        if(position == 0 ){
            head = head.next;
        } else {
            Node<T> temp = head;
            for(int i = 0; i < position - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public int find(T data) {
        Node<T> temp = head;
        int position = 0;
        while(temp != null){
            if(temp.data.equals(data)){
                return position;
            }
            temp = temp.next;
            position++;
        }
        return -1;
    }
    public T topElement(){
        return head.data ;
    }
}
