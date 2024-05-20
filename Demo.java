class Registry {
    private int[] array;
    private int nextIndex;

    public Registry(int capacity) {
        array = new int[capacity];
        nextIndex = 0;
    }

    public void add(int value) {
        array[nextIndex++] = value;
    }

    public void add(int index, int value) {
        int[] tempArray = new int[nextIndex + 1];
        for (int i = 0; i < index; i++) {
            tempArray[i] = array[i];
        }

        tempArray[index] = value;

        for (int i = index; i < nextIndex; i++) {
            tempArray[i + 1] = array[i];
        }

        nextIndex++;
        array = tempArray;
    }

    public void add(int[] newArray) {
        int[] tempArray = new int[nextIndex + newArray.length];
        for (int i = 0; i < nextIndex; i++) {
            tempArray[i] = array[i];
        }

        for (int i = 0; i < newArray.length; i++) {
            tempArray[i + nextIndex] = newArray[i];
        }

        array = tempArray;
        nextIndex += newArray.length;
    }

    public void add(int index, int[] newArray) {
        int[] tempArray = new int[nextIndex + newArray.length];

        for (int i = 0; i < index; i++) {
            tempArray[i] = array[i];
        }

        for (int i = 0; i < newArray.length; i++) {
            tempArray[i + index] = newArray[i];
        }

        for (int i = index; i < nextIndex; i++) {
            tempArray[i + newArray.length] = array[i];
        }

        array = tempArray;
        nextIndex += newArray.length;
    }

    public void remove(int index) {
        int[] tempArray = new int[nextIndex - 1];

        for (int i = 0; i < index; i++) {
            tempArray[i] = array[i];
        }

        for (int i = index; i < tempArray.length; i++) {
            tempArray[i] = array[i + 1];
        }

        array = tempArray;
        nextIndex--;
    }

    public void printRegistry() {
        System.out.print("[");
        for (int i = 0; i < nextIndex; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public void remove() {
        int[] tempArray = new int[nextIndex - 1];
        for (int i = 1; i < nextIndex; i++) {
            tempArray[i - 1] = array[i];
        }
        nextIndex--;
        array = tempArray;
    }

    public void remove(int startIndex, int endIndex) {
        int numElementsToRemove = endIndex - startIndex;

        int[] tempArray = new int[nextIndex - numElementsToRemove];

        for (int i = 0; i < startIndex; i++) {
            tempArray[i] = array[i];
        }

        for (int i = endIndex; i < nextIndex; i++) {
            tempArray[i - numElementsToRemove] = array[i];
        }

        array = tempArray;
        nextIndex -= numElementsToRemove;
    }

}

class Demo {
    public static void main(String args[]) {
        Registry reg = new Registry(100); //
        reg.add(10);
        reg.add(20);
        reg.add(30);
        reg.add(40);
        reg.printRegistry(); // [10,20,30,40]
        reg.remove(); // remove the first element
        reg.printRegistry(); // [20,30,40]
        reg.add(1, 25);// add(int index, int data)
        reg.printRegistry(); // [20,25,30,40]
        reg.add(new int[] { 100, 200, 300, 400 }); // add(int[] data)
        reg.printRegistry(); // [20,25,30,40,100,200,300,400]
        reg.remove(1); // remove(int index)
        reg.printRegistry(); // [20,30,40,100,200,300,400]
        reg.add(3, new int[] { 1, 2, 3 }); // add(int index, int[] data)
        reg.printRegistry(); // [20,30,40,1,2,3,100,200,300,400]
        reg.remove(3, 6); // remove(int startIndex, int endIndex-1)
        reg.printRegistry(); // [20,30,40,100,200,300,400]
    }
}