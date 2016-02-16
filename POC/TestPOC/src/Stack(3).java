class Stackk {
	Node top;
	int size;

	public Stackk() {top=null; size=0;}

	public int pop() {
	    if(top!=null) {
	        int item = top.getData();
	        top = top.next;
	        size--;
	        return item;
	    }
	    return -1;
	}

	public void push(int data) {
	    Node t = new Node(data);
	    t.next = this.top;
	    this.top = t;
	    size++;
	}

	public boolean isEmpty() {
	    return size<=0 ;
	}

	public int size() {
	    return size;
	}

	public int peek() {
	    return top.getData();
	}

	public void printStack() {
	    Node n = this.top;
	    int pos = this.size();
	    while(pos>0) {
	        System.out.println("Position: " + pos + " Element: " + n.getData());
	        n = n.next;
	       
	        pos--;
	    }
	}
}

public class Stack{
public static void main(String[] args) {
    Stackk s = new Stackk();
    s.push(9);s.push(2);s.push(7);s.push(3);s.push(6);s.push(4);s.push(5);
    System.out.println("Size is: " + s.size());
    int size=s.size();
    s.printStack();
    /*for (int i=0; i<size; i++) {
        System.out.print(s.pop()+ " ");
    }*/
    System.out.println();
}
}







class Node{
	private int data;
	Node next;
	Node(int data){
		this.setData(data);
		next=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}