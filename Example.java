import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scan.nextInt();

        boolean isRunning = true;
        while (isRunning) {
            System.out.print("Enter the operator  (+,-,*,/,%,^): ");
            char operator = scan.next().charAt(0);

            switch (operator) {
                case '+':
                    addition(firstNumber, secondNumber);
                    isRunning = false;
                    break;
                case '-':
                    subtraction(firstNumber, secondNumber);
                    isRunning = false;
                    break;
                case '*':
                    multiplication(firstNumber, secondNumber);
                    isRunning = false;
                    break;
                case '/':
                    dividend(firstNumber, secondNumber);
                    isRunning = false;
                    break;
                case '%':
                    remainder(firstNumber, secondNumber);
                    isRunning = false;
                    break;
                case '^':
                    power(firstNumber, secondNumber);
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid operand. Please try again\n");
                    break;
            }
        }
        scan.close();
    }

    public static void addition(int firstNumber, int secondNumber) {
        System.out.println("\nResult: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
    }

    public static void subtraction(int firstNumber, int secondNumber) {
        System.out.println("\nResult: " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
    }

    public static void multiplication(int firstNumber, int secondNumber) {
        System.out.println("\nResult: " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
    }

    public static void dividend(int firstNumber, int secondNumber) {
        System.out.println("\nResult: " + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
    }

    public static void remainder(int firstNumber, int secondNumber) {
        System.out.println("\nResult: " + firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
    }

    public static void power(int firstNumber, int secondNumber) {
        System.out.println(
                "\nResult: " + firstNumber + " ^ " + secondNumber + " = " + Math.pow(firstNumber, secondNumber));
    }
}