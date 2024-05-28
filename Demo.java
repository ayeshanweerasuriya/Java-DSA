class PriorityQueue {
    private int[] array;
    private int nextIndex;

    public PriorityQueue() {
        array = new int[2];
        nextIndex = 0;
    }

    public void enQueue(int value) {
        if (array.length <= nextIndex) {
            extendArray();
        }

        array[nextIndex++] = value;
    }

    public void extendArray() {
        int[] tempArray = new int[nextIndex * 2];

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }

        array = tempArray;
    }

    public void sortArray() {
        int highestValue = array[0];
        for (int i = 0; i < nextIndex; i++) {
            if (array[i] > highestValue) {
                highestValue = array[i];
            }
        }
    }

    public void printQueue() {
        System.out.print("[");
        for (int i = 0; i < nextIndex; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b]");
    }
}

class Demo {
    public static void main(String args[]) {
        PriorityQueue pq = new PriorityQueue();
        pq.enQueue(12);
        pq.enQueue(90);
        pq.enQueue(16);
        pq.enQueue(45);
        pq.enQueue(96);
        pq.enQueue(23);
        pq.printQueue(); // [96, 16, 12, 90, 45, 23]
        // pq.deQueue();
        // pq.printQueue(); // [90, 16, 23, 45, 12]
        // pq.deQueue();
        // pq.printQueue(); // [45, 16, 23, 12]
    }
}