
package dtae_11_9_21;

class stacktest{
   int capacity = 10;
    int[] array =new int[capacity];
    
   int index=-1;
    void push(int item){
        if(index>capacity-1){
            System.out.println("index stock out");
        }
       index=index+1;
       array[index]=item;
        System.out.println(item);
    }
    int peek(){
        
        if(index<0){
            System.out.println("index stock underflow");
        }
        
        return array[index];
    }
    int pop(){
        if(index<0){
            System.out.println("index stock underflow");
        }
        
        
        index=index-1;
        int val=array[index];
        return val;
    }
}

public class Stack {
    public static void main(String[] args) {
        stacktest obj= new stacktest();
        obj.push(15);
        obj.push(25);
        obj.push(35);
        System.out.println();
        System.out.println(obj.peek());
        System.out.println(obj.pop());
    }
}
