import LinkedList.LinkedList;

public class Stack<T> {

    private LinkedList<T>list;

    public Stack() {
        list = new LinkedList<>();
    }

    private void push(T data){
         
        list.insertAt(0, data);
    
    }
     private void display(){
        list.display();
   }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); 
     
       
        stack.push(56);
        stack.push(30); 
        stack.push(70);

        stack.display() ; 

        

    }
}
