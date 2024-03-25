import java.util.Scanner;

public class SalarySystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|                            SALARY INFORMATION SYSTEM                            |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("\n\t[1] Calculate Income Tax");
        System.out.println("\t[2] Calculate Annual Bonus");
        System.out.println("\t[3] Calculate Loan Amount");
        System.out.print("\nEnter an option to continue > ");
        int option = scan.nextInt();

        if (option == 1) {

            System.out.println("\n-----------------------------------------------------------------------------------");
            System.out.println("|                              Calculate Income Tax                               |");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.print("\nInput Employee name   - ");
            String e_name = scan.nextLine();
            scan.nextLine();

            System.out.print("Input Employee salary - ");
            double salary = scan.nextDouble();
            scan.nextLine();

            double tax = 0;

            if (salary > 100000) {
                double taxableAmount = salary - 100000;
                if (taxableAmount <= 41667) {
                    tax = taxableAmount * 0.06;
                } else if (taxableAmount <= 83334) {
                    tax = 41667 * 0.06 + (taxableAmount - 41667) * 0.12;
                } else if (taxableAmount <= 125001) {
                    tax = 41667 * 0.06 + 41667 * 0.12 + (taxableAmount - 83334) * 0.18;
                } else if (taxableAmount <= 166668) {
                    tax = 41667 * 0.06 + 41667 * 0.12 + 41667 * 0.18 + (taxableAmount - 125001) * 0.24;
                } else if (taxableAmount <= 208334) {
                    tax = 41667 * 0.06 + 41667 * 0.12 + 41667 * 0.18 + 41667 * 0.24 + (taxableAmount - 166668) * 0.30;
                } else {
                    tax = 41667 * 0.06 + 41667 * 0.12 + 41667 * 0.18 + 41667 * 0.24 + 41667 * 0.30
                            + (taxableAmount - 208334) * 0.36;
                }
            }

            System.out.print("\nYou have to pay Income Tax per month: " + Math.round(tax));

        } else if (option == 2) {
            System.out.println("\n-----------------------------------------------------------------------------------");
            System.out.println("|                              Calculate Annual Bonus                             |");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.print("\nInput Employee name   - ");
            String e_name = scan.nextLine();
            scan.nextLine();

            System.out.print("Input Employee salary - ");
            double salary = scan.nextDouble();
            scan.nextLine();

            double annual_bonus = 0;

            if (salary < 100000) {
                annual_bonus = 5000;

            } else if (salary >= 100000 && salary <= 199999) {
                annual_bonus = salary * 0.1;

            } else if (salary >= 200000 && salary <= 299999) {
                annual_bonus = salary * 0.15;

            } else if (salary >= 300000 && salary <= 399999) {
                annual_bonus = salary * 0.2;

            } else if (salary >= 400000) {
                annual_bonus = salary * 0.35;
            }

            System.out.println("\nAnnual Bonus: " + annual_bonus);

        } else if (option == 3) {
            System.out.println("\n-----------------------------------------------------------------------------------");
            System.out.println("|                              Calculate Loan Amount                              |");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.print("\nInput Employee name   - ");
            String e_name = scan.nextLine();
            scan.nextLine();

            System.out.print("Input Employee salary - ");
            double salary = scan.nextDouble();
            scan.nextLine();

            if (salary > 50000) {
                System.out.print("Enter number of years - ");
                int years = scan.nextInt();
                scan.nextLine();

                double loan_amount = 0;

                int n = years * 12;
                double r = 0.15;

                loan_amount = 1 - (1 / (1 + Math.pow((r / 12), n))) / (r / 12);
                System.out.println("You can get loan ammount: " + loan_amount);

            } else {
                System.out.println("You cannot get a loan because your salary is less than Rs.50 000...");
            }

        }
    }
}
