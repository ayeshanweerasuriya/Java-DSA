package oop;

class Box {
    int length = 12;
    int width = 5;
    int height = 3;

    Box() {
        length = 1;
        width = 2;
        height = 3;
    }

    Box(int length, int width, int height) {

    }
}

class Demo {
    public static void main(String args[]) {
        Box b1 = new Box();
        System.out.println("length : " + b1.length); // 1
        System.out.println("width  : " + b1.width); // 2
        System.out.println("height : " + b1.height); // 3
        System.out.println();

        Box b2 = new Box(0, 0, 0);
        System.out.println("length : " + b2.length); //
        System.out.println("width  : " + b2.width); //
        System.out.println("height : " + b2.height); //
    }
}
