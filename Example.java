import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        int intNum1 = scan.nextInt();
        System.out.print("Enter the second integer number: ");
        int intNum2 = scan.nextInt();

        int intDiff = absoluteDifference(intNum1, intNum2);
        System.out.println("Absolute difference of two integers: " + intDiff);

        scan.close();
    }

    public static int absoluteDifference(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    public static double absoluteDifference(double num1, double num2) {
        return Math.abs(num1 - num2);
    }
}
