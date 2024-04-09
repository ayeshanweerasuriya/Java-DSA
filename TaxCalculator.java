import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.print("\033\143");
            System.out.println("\t\t\t\t\t\t __   ______   ________  ________ ");
            System.out.println("\t\t\t\t\t\t|  \\ /      \\ |        \\|        \\");
            System.out.println("\t\t\t\t\t\t \\$$|  $$$$$$\\| $$$$$$$$ \\$$$$$$$$");
            System.out.println("\t\t\t\t\t\t|  \\| $$   \\$$| $$__       | $$   ");
            System.out.println("\t\t\t\t\t\t| $$| $$      | $$  \\      | $$   ");
            System.out.println("\t\t\t\t\t\t| $$| $$   __ | $$$$$      | $$   ");
            System.out.println("\t\t\t\t\t\t| $$| $$__/  \\| $$_____    | $$   ");
            System.out.println("\t\t\t\t\t\t| $$ \\$$    $$| $$     \\   | $$   ");
            System.out.println("\t\t\t\t\t\t \\$$  \\$$$$$$  \\$$$$$$$$    \\$$   \n");
            System.out.println("  _______             __   __     _____              _         _____   _    _   _                   _______    ____    _____  ");
            System.out.println(" |__   __|     /\\     \\ \\ / /    / ____|     /\\     | |       / ____| | |  | | | |          /\\     |__   __|  / __ \\  |  __ \\ ");
            System.out.println("    | |       /  \\     \\ V /    | |         /  \\    | |      | |      | |  | | | |         /  \\       | |    | |  | | | |__) |");
            System.out.println("    | |      / /\\ \\     > <     | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\      | |    | |  | | |  _  / ");
            System.out.println("    | |     / ____ \\   / . \\    | |____   / ____ \\  | |____  | |____  | |__| | | |____   / ____ \\     | |    | |__| | | | \\ \\ ");
            System.out.println("    |_|    /_/    \\_\\ /_/ \\_\\    \\_____| /_/    \\_\\ |______|  \\_____|  \\____/  |______| /_/    \\_\\    |_|     \\____/  |_|  \\_\\\n\n");    
            System.out.println("======================================================================================================================================");
            System.out.println("\n\n\t[1] Withholding Tax");
            System.out.println("\n\t[2] Payable Tax");
            System.out.println("\n\t[3] Income Tax");
            System.out.println("\n\t[4] Social Security Contribution Levy (SSCL) Tax");
            System.out.println("\n\t[5] Leasing payment");
            System.out.println("\n\t[6] Exit\n\n");
            System.out.print("Enter an option to continue -> ");
            int option;

            if (scan.hasNextInt()) {
                option = scan.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("\033\143");
                        withholdingTax(scan);
                        break;
                    case 2:
                        payableTax(scan);
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.print("\033\143");
                        System.out.println("\n*" + option + " not an option. Please Try again\n");
                        break;
                }
            } else {
                System.out.print("\033\143");
                System.out.println("\n*Option cannot be a string. Please Try again.\n");
                scan.next();
            }
        }
    }

    private static void payableTax(Scanner scan) {
        boolean subContinueLoop = true;
        do {
            System.out.print("\033\143");
            System.out.println("+---------------------------------------------------------------------------+");
            System.out.println("|                               Withholding Tax                             |");
            System.out.println("+---------------------------------------------------------------------------+");

            System.out.println("\nEnter your Employee Payment per month : ");
            int empPayment = scan.nextInt();
            // System.out.println("\nYou have to pay Payable Tax per month : ");

            if (empPayment < 0) {
                System.out.println("\tInvalid input...");
    
                System.out.print("\n\nDo you want to enter the correct value again (Y/N) : ");
                char isCont = scan.next().toUpperCase().charAt(0);
    
                if (isCont == 'Y') {
                    subContinueLoop = true;
                    System.out.print("\033\143");
                } else if (isCont == 'N') {
                    subContinueLoop = false;
                    main(null);
                }
    
            } else {
                if (empPayment <= 100000) {
                    System.out.println("\n\tYou don't have to pay Payable Tax...");
                } else {
                    
                }

            System.out.print("\n\n\nDo you want to calculate another Dividend Tax (Y/N) : ");
            char isCont = scan.next().toUpperCase().charAt(0);

                if (isCont == 'Y') {
                    subContinueLoop = true;
                    System.out.print("\033\143");
                } else if (isCont == 'N') {
                    subContinueLoop = false;
                    main(null);
                }
            }

        } while (subContinueLoop);
    }

    public static void withholdingTax(Scanner scan) {
        boolean subContinueLoop = true;
        while (subContinueLoop) {  
            System.out.println("+---------------------------------------------------------------------------+");
            System.out.println("|                               Withholding Tax                             |");
            System.out.println("+---------------------------------------------------------------------------+");
            System.out.println("\n\t[1] Rent Tax");
            System.out.println("\n\t[2] Bank Interest Tax");
            System.out.println("\n\t[3] Dividend Tax");
            System.out.println("\n\t[4] Exit");
            System.out.print("\n\nEnter an option to continue -> ");
            int option;

            if (scan.hasNextInt()) {
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("\033\143");
                        rentTax(scan);
                        break;
                    case 2:
                        bankInterestTax(scan);
                        break;
                    case 3:
                        dividendTax(scan);
                        break;
                    case 4:
                        subContinueLoop = false;
                        System.out.print("\033\143");
                        break;
                
                    default:
                        System.out.print("\033\143");
                        System.out.println("\n*" + option + " not an option. Please Try again.\n");
                        break;
                }

            } else {
                System.out.print("\033\143");
                System.out.println("\n*Option cannot be a string. Please Try again.\n");
                scan.next();
            }
        }
    }

    private static void dividendTax(Scanner scan) {
        boolean secondSubContinueLoop = true;
       do {
        System.out.print("\033\143");
        System.out.println("+---------------------------------------------------------------+");
        System.out.println("|                          Dividend TAX                         |");
        System.out.println("+---------------------------------------------------------------+\n");
        System.out.print("Enter your total dividend per year    : ");
        int divided = scan.nextInt();
        
        if (divided < 0) {
            System.out.println("\tInvalid input...");

            System.out.print("\n\nDo you want to enter the correct value again (Y/N) : ");
            char isCont = scan.next().toUpperCase().charAt(0);

            if (isCont == 'Y') {
                secondSubContinueLoop = true;
                System.out.print("\033\143");
            } else if (isCont == 'N') {
                secondSubContinueLoop = false;
                main(null);
            }

        } else {
            if (divided <= 100000) {
                System.out.println("\n\tYou don't have to pay Dividend Tax...");
            } else {
                double dividedTax = (divided - 100000) * 0.14;
                System.out.printf("\nYou have to pay divided tax per year  : %.2f", dividedTax);
            }

            System.out.print("\n\n\nDo you want to calculate another Dividend Tax (Y/N) : ");
            char isCont = scan.next().toUpperCase().charAt(0);

            if (isCont == 'Y') {
                secondSubContinueLoop = true;
                System.out.print("\033\143");
            } else if (isCont == 'N') {
                secondSubContinueLoop = false;
                main(null);
            }
        }

       } while (secondSubContinueLoop);
    }

    private static void bankInterestTax(Scanner scan) {
        boolean secondSubContinueLoop = true;
        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------------+");
            System.out.println("|                          BANK INTEREST TAX                         |");
            System.out.println("+--------------------------------------------------------------------+\n");
            System.out.print("Enter your bank interest per year          : ");
            int bankInterest = scan.nextInt();

            if (bankInterest <= 0) {
                System.out.println("\tInvalid input...");

                System.out.print("\n\nDo you want to enter the correct value again (Y/N) : ");
                char isCont = scan.next().toUpperCase().charAt(0);

                if (isCont == 'Y') {
                    secondSubContinueLoop = true;
                    System.out.print("\033\143");
                } else if (isCont == 'N') {
                    secondSubContinueLoop = false;
                    main(null);
                }
            } else {
                double bankInterestTaxPerYear = bankInterest * 0.05;
                System.out.printf("\nYou have to pay Bank Interest Tax per year : %.2f", bankInterestTaxPerYear);

                System.out.print("\n\n\nDo you want to calculate another Bank Interest Tax (Y/N) : ");
                char isCont = scan.next().toUpperCase().charAt(0);

                if (isCont == 'Y') {
                    secondSubContinueLoop = true;
                    System.out.print("\033\143");
                } else if (isCont == 'N') {
                    secondSubContinueLoop = false;
                    main(null);
                }
            }

        } while (secondSubContinueLoop);
    }

    private static void rentTax(Scanner scan) {
        boolean secondSubContinueLoop = true;
        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------------+");
            System.out.println("|                               RENT TAX                             |");
            System.out.println("+--------------------------------------------------------------------+\n");
            System.out.print("Enter your rent          : ");
            int rentAmount;

            if (!scan.hasNextInt()) {
                if (scan.hasNext()) {
                    System.out.println("\n\tInvalid input...");
                    scan.next();
                } else {
                    System.out.println("\n\tInvalid input...");
                    scan.nextLine(); 
                }

                System.out.print("\n\nDo you want to enter the correct value again (Y/N) : ");
                char isCont = scan.next().toUpperCase().charAt(0);
                scan.nextLine();

                if (isCont == 'Y') {
                    System.out.print("\033\143");
                } else if (isCont == 'N') {
                    secondSubContinueLoop = false;
                    main(null);
                }

            } else if ((rentAmount = scan.nextInt()) <= 0) {
                System.out.println("\tInvalid input...");
                scan.nextLine();

                System.out.print("\n\nDo you want to enter the correct value again (Y/N) : ");
                char isCont = scan.next().toUpperCase().charAt(0);
                scan.nextLine();

                if (isCont == 'Y') {
                    System.out.print("\033\143");
                } else if (isCont == 'N') {
                    secondSubContinueLoop = false;
                    main(null);
                }
            } else {
                if (rentAmount > 100000) {
                    double rentTaxAmount = (rentAmount - 100000) * 0.10;
                    System.out.printf("\nYou have to pay Rent Tax : %.2f", rentTaxAmount);
                } else {
                    System.out.println("\n\tYou don't have to pay rent tax...");
                }

                System.out.print("\n\nDo you want to calculate another Rent Tax (Y/N) : ");
                char isCont = scan.next().toUpperCase().charAt(0);
                scan.nextLine();

                if (isCont == 'Y') {
                    System.out.print("\033\143");
                } else if (isCont == 'N') {
                    secondSubContinueLoop = false;
                    main(null);
                }

            }

        } while (secondSubContinueLoop);
    }
}