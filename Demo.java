<<<<<<< HEAD
import java.util.*;
class Stack{
	private Node top;
	
	public void push(int data){
		Node n1=new Node(data);
		n1.next=top;
		top=n1;
	}
	public boolean isEmpty(){
		return top==null;
	}
	public int size(){
		Node temp=top;
		int count=0;
		while(temp!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}
	public void printStack(){
		System.out.print("[");
		Node temp=top;
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(isEmpty()? "empty]":"\b\b]");
	}
	public void pop(){
		top=top.next;
	}
	public void clear(){
		top=null;
	}
	public int peek(){
		return isEmpty() ? -1: top.data;
	}
	public int poll(){
		if(isEmpty()){
			return -1;
		}
		int data=top.data;
		pop();
		return data;
	}

    public int search(int value) {
        int index = 0;
        Node temp = top;
        if (temp == null) {
            return -1;
        }
        
        while (temp != null) {
			if (temp.data == value) {
				return index;
			} else {
				index++;
				temp = temp.next;
			}
        }

		return -1;
    }

	public int[] toArray() {
		Node temp = top;
		int[] array = new int[size()];

		if (temp != null) {
			for (int i = 0; i < size(); i++) {
				array[i] = temp.data;
				temp = temp.next;
			}
		}
		return array;
	}
	
	// node as a inner class
	class Node{
		private int data;
		private Node next;
		private Node(int data){
			this.data=data;
		}
	}
}
class Demo{
	public static void main(String args[]){
		Stack s1=new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.printStack(); //[50,40,30,20,10]
		System.out.println();
		
		int index=s1.search(20);
		System.out.println("Index of 20 : "+index); //3
		System.out.println();
		
		index=s1.search(99);
		System.out.println("Index of 99 : "+index); //-1
		System.out.println();
		
		int[] ar=s1.toArray();
		System.out.println(Arrays.toString(ar)); //[50,40,30,20,10]
	}
}
=======
class Stack {
    public void push(int value) {
        Node n1 = new Node(value);
        n1.next = n1;
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Demo {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
    }
}
>>>>>>> 623e2d1ed25842154beda4602b43b0461419e4eb
