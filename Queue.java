public class Queue {
    int front;
    int rear;
    int maxSize;
    int queArr[];

    // Constructor
    Queue(int s) {
        maxSize = s;
        front = 0;
        rear = -1;
        queArr = new int[s];
    }

    Boolean isFull() {
        return (rear + 1 == maxSize);
    }

    // Enqueue values
    void enQueue(int x) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            rear++;
            queArr[rear] = x;
            System.out.println();
        }
    }

    // Check if queue empty
    Boolean isEmpty() {
        return (front > rear);
    }

    // Dequeue values
    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            front++;
        }
    }

    // print queue
    void printQueue() {
        for (int i = front; i < rear; i++) {
            System.out.println(queArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.enQueue(20);
        myQueue.enQueue(40);
        myQueue.enQueue(60);
        myQueue.enQueue(80);
        myQueue.enQueue(100);
        myQueue.enQueue(120);
        myQueue.printQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
    }
}
