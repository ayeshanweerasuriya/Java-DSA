import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the tax-inclusive price in dollars: ");
        double taxInclusivePrice = scan.nextDouble();
        scan.close();

        double actualPrice = taxInclusivePrice / 1.10;
        double salesTax = taxInclusivePrice - actualPrice;

        System.out.printf("Actual Price is: $%.2f%n", actualPrice);
        System.out.printf("Sales Tax is: $%.2f%n", salesTax);

    }
}