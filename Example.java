import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input monthly interest: ");
        double monthlyInterestRate = scan.nextDouble();
        scan.close();

        double depositAmount = calDeposit(monthlyInterestRate);
        System.out.println("\nYou should deposit: Rs." + depositAmount);
    }

    public static double calDeposit(double monthlyInterestRate) {
        double monthlyRate = 0.20 / 12.0;
        double deposit = monthlyInterestRate / (Math.pow(1 + monthlyRate, 12) - 1);
        return deposit;
    }
}