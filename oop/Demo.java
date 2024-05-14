class Rectangle {
    private float length = 1;
    private float width = 1;

    public float getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public float getArea() {
        return this.length * this.width;
    }

    public float getLength() {
        return this.length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setLength(float length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Invalid Input");
        }
    }

    public void setWidth(float width) {
        if (length > 0.0 && length < 20.0) {
            this.width = width;
        } else {
            System.out.println("Invalid Input");
        }
    }
}

class Demo {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
    }
}
