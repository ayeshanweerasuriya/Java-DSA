class MyClass {
    /* * Insert Code Here Line 10 */
    int x;
    int y;

    MyClass(int i, int j) {
        x = 100;
        y = 200;
    }

    void printValues() {
        System.out.println("Values : " + x + ", " + y);
    }
}

class Demo {
    public static void main(String[] args) {
        MyClass c = new MyClass(100, 200);
        c.printValues();
    }
}