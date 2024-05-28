import java.util.*;

class Queue {
    private Node front;

    public void enQueue(int data) {
        Node n1 = new Node(data);
        if (front == null) {
            front = n1;
        } else {
            Node temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n1;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        Node temp = front;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void printQueue() {
        System.out.print("[");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println(isEmpty() ? "empty]" : "\b\b]");
    }

    public void deQueue() {
        front = front.next;
    }

    public void clear() {
        front = null;
    }

    public int peek() {
        return isEmpty() ? -1 : front.data;
    }

    public int search(int data) {
        Node temp = front;
        int index = -1;
        while (temp != null) {
            index++;
            if (temp.data == data) {
                return index;
            }
            temp = temp.next;
        }
        return index;
    }

    public int[] toArray() {
        int[] tempDataArray = new int[size()];
        Node temp = front;
        for (int i = 0; i < tempDataArray.length; i++) {
            tempDataArray[i] = temp.data;
            temp = temp.next;
        }
        return tempDataArray;
    }

    public int poll() {
        if (isEmpty()) {
            return -1;
        }
        int data = front.data;
        deQueue();
        return data;
    }

    class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }
    }
}

class Demo {
    public static void main(String args[]) {
        Queue q1 = new Queue();
        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        q1.enQueue(50);
        q1.printQueue();// [10,20,30,40,50]

        q1.deQueue();
        q1.printQueue();// [20,30,40,50]

    }
}
