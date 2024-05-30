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