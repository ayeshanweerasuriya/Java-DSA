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
        if (length > 0.0f && length < 20.0f) {
            this.length = length;
        } else {
            System.out.println("Invalid Length Input");
        }
    }

    public void setWidth(float width) {
        if (width > 0.0f && width < 20.0f) {
            this.width = width;
        } else {
            System.out.println("Invalid Width Input");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.setLength(10.0f);
        rect.setWidth(5.0f);
        rect.setLength(25.0f);
        rect.setWidth(0.0f);

        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Area: " + rect.getArea());
    }
}
