import LinkedList.LinkedList;
import LinkedList.Node;

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
   private void pop(){
       list.removeFrom(0);        
     return ;
   }
   private T peek(){

     return list.topElement() ;
   }

   private int size(){
     
    return list.size() ;
   }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); 
     
       
        stack.push(56);
        stack.push(30); 
        stack.push(70);

   
         while(stack.size()>0){
             
            int top = stack.peek() ;
            stack.pop() ; 
            System.out.print(top + " ");
         }

    }
}
