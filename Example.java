import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number of Employees: ");
        int numOfEmployees = scan.nextInt();

        int fiveThousandCount = 0;
        int twoThousandCount = 0;
        int oneThousandCount = 0;
        int fiveHundredCount = 0;
        int twoHundredCount = 0;
        int oneHundredCount = 0;
        int fiftyCount = 0;
        int twentyCount = 0;
        int tenCount = 0;
        int fiveCount = 0;
        int twoCount = 0;
        int rupeeCount = 0;

        System.out.println("\n=================================\n");

        for (int i = 0; i < numOfEmployees; i++) {
            System.out.print("Input salary " + (i + 1) + ": ");
            int salary = scan.nextInt();

            while (salary >= 5000) {
                salary -= 5000;
                fiveThousandCount++;
            }

            while (salary >= 2000) {
                salary -= 2000;
                twoThousandCount++;
            }

            while (salary >= 1000) {
                salary -= 1000;
                oneThousandCount++;
            }

            while (salary >= 500) {
                salary -= 500;
                fiveHundredCount++;
            }

            while (salary >= 200) {
                salary -= 200;
                twoHundredCount++;
            }

            while (salary >= 100) {
                salary -= 100;
                oneHundredCount++;
            }

            while (salary >= 50) {
                salary -= 50;
                fiftyCount++;
            }

            while (salary >= 20) {
                salary -= 20;
                twentyCount++;
            }

            while (salary >= 10) {
                salary -= 10;
                tenCount++;
            }

            while (salary >= 5) {
                salary -= 5;
                fiveCount++;
            }

            while (salary >= 2) {
                salary -= 2;
                twoCount++;
            }

            while (salary >= 1) {
                salary -= 1;
                rupeeCount++;
            }
        }

        System.out.println("\n=================================\n");

        scan.close();

        System.out.println("R5000 notes : " + fiveThousandCount);
        System.out.println("R2000 notes : " + twoThousandCount);
        System.out.println("R1000 notes : " + oneThousandCount);
        System.out.println("R500 notes  : " + fiveHundredCount);
        System.out.println("R200 notes  : " + twoHundredCount);
        System.out.println("R100 notes  : " + oneHundredCount);
        System.out.println("R50 notes   : " + fiftyCount);
        System.out.println("R20 notes   : " + twentyCount);
        System.out.println("R10 coins   : " + tenCount);
        System.out.println("R5 coins    : " + fiveCount);
        System.out.println("R2 coins    : " + twoCount);
        System.out.println("R1 Coins    : " + rupeeCount);

    }
}