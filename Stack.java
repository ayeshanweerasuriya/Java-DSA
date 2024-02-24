public class Stack {
    int arr[];
    int top;
    int maxSize;

    Stack(int s) {
        arr = new int[s];
        maxSize = s;
        top = -1;
    }

    // If stack is full
    Boolean isFull() {
        return (top + 1 == maxSize);
    }

    // Push values
    void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = x;
            System.out.println("pushed: " + x);
            // System.out.println(top);
        }
    }

    // Stack is empty
    Boolean isEmpty() {
        return (top == -1);
    }

    // Pop values
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            System.out.println("Popped Item");
            // System.out.println(top);
        }
    }

    void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println("stack value: " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(10);
        myStack.push(20);
        myStack.printStack();
        myStack.push(30);
        myStack.push(40);
        myStack.printStack();
        myStack.pop();
        myStack.printStack();
        myStack.push(50);
        myStack.push(60);
        myStack.pop();
        myStack.pop();
        myStack.printStack();
    }
}
