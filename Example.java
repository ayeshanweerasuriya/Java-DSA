import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coordinates of the first point (xA)    : ");
        double xA = scanner.nextDouble();
        System.out.print("Enter the coordinates of the first point (yA)    : ");
        double yA = scanner.nextDouble();

        System.out.print("Enter the coordinates of the second point (xB)   : ");
        double xB = scanner.nextDouble();
        System.out.print("Enter the coordinates of the second point (yB)   : ");
        double yB = scanner.nextDouble();

        System.out.print("Enter the ratio (xC) in which the line is divided: ");
        double xC = scanner.nextDouble();
        System.out.print("Enter the ratio (yC) in which the line is divided: ");
        double yC = scanner.nextDouble();

        calculateDividedPoint(xA, yA, xB, yB, xC, yC);

        scanner.close();
    }

    public static void calculateDividedPoint(double xA, double yA, double xB, double yB, double xC, double yC) {
        double x = (xC * xB + yC * xA) / (xC + yC);
        double y = (xC * yB + yC * yA) / (xC + yC);

        System.out.print("\nCoordinates of the point where the line divides  : (" + x + ", " + y + ")");
    }
}
