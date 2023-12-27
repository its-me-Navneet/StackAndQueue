import LinkedList.LinkedList;

public class Queue<T> {

    private LinkedList<T>list;

    public Queue() {
        list = new LinkedList<>();
    }

    private void enqueu(T data){
         
        list.insertAt(list.size() ,data);
    
    }
    void display(){
        list.display();
    }

   private int size(){
     
    return list.size() ;
   }


    public static void main(String[] args) {
        Queue<Integer> Queue = new Queue<>();
     
       
        Queue.enqueu(56);
        Queue.enqueu(30); 
        Queue.enqueu(70);
        
        Queue.display();
   
     

    }
}
