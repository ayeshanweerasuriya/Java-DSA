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
            System.out.println("\t[2] Payable Tax");
            System.out.println("\t[3] Income Tax");
            System.out.println("\t[4] Social Security Contribution Levy (SSCL) Tax");
            System.out.println("\t[5] Leasing payment");
            System.out.println("\t[6] Exit\n\n");
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
                        break;
                    case 3:
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

    private static void rentTax(Scanner scan) {
        while (true) {
            System.out.println("+--------------------------------------------------------------------+");
            System.out.println("|                               Rent Tax                             |");
            System.out.println("+--------------------------------------------------------------------+\n");
            System.out.print("Enter your rent          : ");
            int rentAmount;

            if (scan.hasNextInt()) {
                rentAmount = scan.nextInt();
                    if (rentAmount > 100000) {
                        double rentTaxAmount = (rentAmount / 0.1) + rentAmount;
                        System.out.print("\tYou have to pay Rent Tax : " + rentTaxAmount);

                        System.out.print("\n\nDo you want to calculate another Rent Tax (Y/N):");
                        char option = scan.next().toLowerCase().charAt(0);

    
                    } else {
                            System.out.println("You don't have to pay Rent Tax...");

                            System.out.print("\n\nDo you want to calculate another Rent Tax (Y/N):");
                            char option = scan.next().toLowerCase().charAt(0);
                            
                            if (option == 'y') {
                                System.out.print("\033\143");
                                break;
                            }
        
                            if (option == 'n') {
                                main(null);
                            }
                    }

            } else {
                System.out.println("\n\tInvalid input...");
                scan.next();
                boolean wantToEnter = true;
                while (wantToEnter) {
                    System.out.print("\n\nDo you want to enter the correct value again (Y/N): ");
                    char option = scan.next().toLowerCase().charAt(0);
    
                    if (option == 'y') {
                        System.out.print("\033\143");
                        break;
                    }

                    if (option == 'n') {
                        main(null);
                    }
                }
            }
        }
    }
}
