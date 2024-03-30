import java.util.Scanner;

class Example {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first_number = scan.nextInt();
        System.out.print("Enter the second number : ");
        int second_number = scan.nextInt();
        System.out.print("Enter the operator (+,-,*,/,%,^) : ");
        String operator = scan.next();
        scan.close();
        double result = 0;
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")
                || operator.equals("%") || operator.equals("^")) {
            if (operator.equals("+")) {
                result = first_number + second_number;
            } else if (operator.equals("-")) {
                result = first_number - second_number;
            } else if (operator.equals("*")) {
                result = first_number * second_number;
            } else if (operator.equals("/")) {
                result = (double) first_number / second_number;
            } else if (operator.equals("%")) {
                result = first_number % second_number;
            } else if (operator.equals("^")) {
                result = (double) Math.pow(first_number, second_number);
            }
        } else {
            System.out.print("\nPlease input correct operator");
            System.exit(0);
        }
        System.out.print("\nResult: " + first_number + " " + operator + " " + second_number
                + " = " + result);
    }
}