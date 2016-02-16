// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

 class Solution {
        public static int solution() {
        	LinkedListL list=new LinkedListL();
        	return list.size();
    }
        public static void main(String[] args) {
        	LinkedListL list=new LinkedListL();
        	list.add(5);
        	list.add(6);
        	Solution.solution();
		}
}
class IntList{
    private int value;
    private IntList next;
   
    public IntList getNext() {
	return next;
}
public void setNext(IntList next) {
	this.next = next;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
    
    public IntList(int value){
        this.value=value;
    }
}
 

class LinkedListL{
        IntList head=null;;
        int size=0;
        
        public LinkedListL(){
            head=new IntList(1);
            size=0;
        }
  
    public void add(int data)
    {
       
    IntList temp = new IntList(data);
        IntList current = head;
        
        while (current.getNext() != null) {
            current = current.getNext();
        }
      
        current.setNext(temp);
        size++;
    }
    public int size(){
        return size;
    }
}
