import java.util.*;
class List{
	private Node start;
	
	public void add(int index, int data){
		Node n1 = new Node(data);
		int localIndex = 0;
		if (isEmpty()) {
			start = n1;
			localIndex++;
		} else {
			Node temp = start;
			while (temp.next != null) {
				if (localIndex == index) {
					temp.next = n1;
				}
				localIndex++;
			}
		}
	}
	public int get(int index){
		return -1;
	}
	public void remove(int index){
	}	
	public void add(int data){
		Node n1=new Node(data);
		if(start==null){
			start=n1;
		}else{
			Node temp=start;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=n1;
		}
	}
	public boolean isEmpty(){
		return start==null;
	}
	public int size(){
		Node temp=start;
		int count=0;
		while(temp!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}
	public void printList(){
		System.out.print("[");
		Node temp=start;
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(isEmpty()? "empty]":"\b\b]");
	}

	public void clear(){
		start=null;
	}

	public int search(int data){
		Node temp=start;
		int index=-1;
		while(temp!=null){
			index++;
			if(temp.data==data){
				return index;
			}
			temp=temp.next;
		}
		return index;
	}
	public int[] toArray(){
		int[] tempDataArray=new int[size()];
		Node temp=start;
		for (int i = 0; i < tempDataArray.length; i++){
			tempDataArray[i]=temp.data;
			temp=temp.next;
		}
		return tempDataArray;
	}
	class Node{
		private int data;
		private Node next;
		Node(int data){
			this.data=data;
		}
	}
}
class Demo{
	public static void main(String args[]){
		List list1=new List();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.printList(); //[10,20,30,40,50];
		
		list1.add(2,222);
		list1.printList(); //[10,20,222,30,40,50];
		
		list1.add(0,9);
		list1.printList(); //[9,10,20,222,30,40,50];
		
		list1.add(list1.size()-1, 60);
		list1.printList(); //[9,10,20,222,30,40,50,60];
		
		list1.remove(list1.size()-1);
		list1.printList(); //[9,10,20,222,30,40,50];
		
		list1.remove(0);
		list1.printList(); //[10,20,222,30,40,50];
		
		list1.remove(2);
		list1.printList(); //[10,20,30,40,50];
	}
}
