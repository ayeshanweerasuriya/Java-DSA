class PriorityQueue {
    private int[] array;
    private int nextIndex;

    public PriorityQueue(int initialSize) {
        this.array = new int[initialSize];
        this.nextIndex = 0;
    }

    public void enQueue(int value) {
        this.array[nextIndex++] = value;
        bringMaxToFront();
    }

    public void deQueue() {

        for (int i = 1; i < nextIndex; i++) {
            array[i - 1] = array[i];
        }
        nextIndex--;
    }

    private void bringMaxToFront() {
        if (nextIndex <= 1) {
            return;
        }

        int maxIndex = 0;
        for (int i = 1; i < nextIndex; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        int maxValue = array[maxIndex];
        for (int i = maxIndex; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = maxValue;
    }

    public void printQueue() {
        System.out.print("[");
        for (int i = 0; i < nextIndex; i++) {
            System.out.print(array[i]);
            if (i < nextIndex - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

class Demo {
    public static void main(String args[]) {
        PriorityQueue pq = new PriorityQueue(10); // PriorityQueue(int initialSize)
        pq.enQueue(12);
        pq.enQueue(90);
        pq.enQueue(16);
        pq.enQueue(45);
        pq.enQueue(96);
        pq.enQueue(23);
        pq.printQueue(); // [96, 16, 12, 90, 45, 23]
        pq.deQueue();
        pq.printQueue(); // [90, 16, 23, 45, 12]
        pq.deQueue();
        pq.printQueue(); // [45, 16, 23, 12]
    }
}