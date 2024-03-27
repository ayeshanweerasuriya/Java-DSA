import java.util.Scanner;

class Example {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of copies: ");
        int copies_amount = scan.nextInt();
        scan.close();

        double price_per_copy = 0;

        if (copies_amount >= 0 && copies_amount <= 99) {
            price_per_copy = 30.00;

        } else if (copies_amount >= 100 && copies_amount <= 499) {
            price_per_copy = 28.00;

        } else if (copies_amount >= 500 && copies_amount <= 799) {
            price_per_copy = 27.00;

        } else if (copies_amount >= 800 && copies_amount <= 1000) {
            price_per_copy = 26.00;

        } else {
            price_per_copy = 25.00;
        }

        System.out.printf("\nTotal price: %.2f", (copies_amount * price_per_copy));
    }
}
