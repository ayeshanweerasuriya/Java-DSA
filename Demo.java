class Box {
    private int length;
    private int width;
    private int height;

    public Box() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(int side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    public Box(Box other) {
        this.length = other.length;
        this.width = other.width;
        this.height = other.height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDimension(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setDimension(int side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    public void setDimension(Box other) {
        this.length = other.length;
        this.width = other.width;
        this.height = other.height;
    }

    public int getVolume() {
        return this.length * this.width * this.height;
    }

    public void printVolume() {
        System.out.println("Volume: " + getVolume());
    }

    public Box getCopy() {
        return new Box(this);
    }
}

class Demo {
    public static void main(String args[]) {
        Box b1 = new Box();
        b1.setLength(12);
        b1.setWidth(5);
        b1.setHeight(3);
        b1.printVolume();
        b1.setDimension(120, 50, 30);
        System.out.println("Volume " + b1.getVolume());
        Box b2 = new Box(4, 2, 3);
        b2.printVolume();
        Box b3 = new Box(b2);

        b3.printVolume();
        Box b4 = new Box(10);
        b4.printVolume();
        Box b5 = new Box();
        b5.setDimension(12);
        b5.printVolume();
        Box b6 = new Box();
        b6.printVolume();
        b6.setDimension(b1);
        b6.printVolume();
        Box b7 = b3.getCopy();
        b7.printVolume();
    }
}
