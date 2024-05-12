package projects;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
            System.out.println(
                    "  _______             __   __     _____              _         _____   _    _   _                   _______    ____    _____  ");
            System.out.println(
                    " |__   __|     /\\     \\ \\ / /    / ____|     /\\     | |       / ____| | |  | | | |          /\\     |__   __|  / __ \\  |  __ \\ ");
            System.out.println(
                    "    | |       /  \\     \\ V /    | |         /  \\    | |      | |      | |  | | | |         /  \\       | |    | |  | | | |__) |");
            System.out.println(
                    "    | |      / /\\ \\     > <     | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\      | |    | |  | | |  _  / ");
            System.out.println(
                    "    | |     / ____ \\   / . \\    | |____   / ____ \\  | |____  | |____  | |__| | | |____   / ____ \\     | |    | |__| | | | \\ \\ ");
            System.out.println(
                    "    |_|    /_/    \\_\\ /_/ \\_\\    \\_____| /_/    \\_\\ |______|  \\_____|  \\____/  |______| /_/    \\_\\    |_|     \\____/  |_|  \\_\\\n\n");
            System.out.println(
                    "======================================================================================================================================");
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
                        System.out.print("\033\143");
                        payableTax(scan);
                        break;
                    case 3:
                        System.out.print("\033\143");
                        incomeTax(scan);
                        break;
                    case 4:
                        System.out.print("\033\143");
                        ssclTax(scan);
                        break;
                    case 5:
                        System.out.print("\033\143");
                        leasingPayment(scan);
                        break;
                    case 6:
                        System.out.print("\033\143");
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

    // WithHolding Tax method
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
                        System.out.print("\033\143");
                        bankInterestTax(scan);
                        break;
                    case 3:
                        System.out.print("\033\143");
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

    // leasing Payment Tax method
    public static void leasingPayment(Scanner scan) {
        boolean subContinueLoop = true;
        while (subContinueLoop) {
            System.out.println("+---------------------------------------------------------------------------+");
            System.out.println("|                              Leasing Payment                              |");
            System.out.println("+---------------------------------------------------------------------------+");
            System.out.println("\n\t[1] Calculate Monthly Installment");
            System.out.println("\n\t[2] Search Leasing Categary");
            System.out.println("\n\t[3] Find Leasing Ammount");
            System.out.println("\n\t[4] Exit");
            System.out.print("\n\nEnter an option to continue -> ");
            int option;

            if (scan.hasNextInt()) {
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("\033\143");
                        calculateMonthlyInstallment(scan);
                        break;
                    case 2:
                        System.out.print("\033\143");
                        searchLeasingCategory(scan);
                        break;
                    case 3:
                        System.out.print("\033\143");
                        findLeasingAmount(scan);
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

    // Find Leasing Amount Method
    private static void findLeasingAmount(Scanner scan) {
        boolean secondSubContinueLoop = true;
        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------------------+");
            System.out.println("|                            Find Leasing Amount                           |");
            System.out.println("+--------------------------------------------------------------------------+");

            System.out.print("\nEnter the monthly lease payment amount you can afford : ");
            int leaseAmount = scan.nextInt();

            if (leaseAmount <= 0) {
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
                int numberOfYears = 0;
                double annualInterestRate = 0;
                while (true) {
                    System.out.print("\nEnter number of year                                  : ");
                    numberOfYears = scan.nextInt();

                    if (numberOfYears > 5) {
                        System.out.println("\nInvalid input... The maximum number of the year is 5.\n");
                    } else if (numberOfYears <= 0) {
                        System.out.println(
                                "\nInvalid input... The minimun number of the year is 1 and maximum number of the year is 5.\n");
                    } else {
                        break;
                    }
                }

                while (true) {
                    System.out.print("\nEnter annual interest rate                            : ");
                    annualInterestRate = scan.nextDouble();

                    if (annualInterestRate <= 0) {
                        System.out.println("\nInvalid input...  The annual interest rate must be greater than 0%.\n");
                    } else {
                        break;
                    }
                }

                int numberOfMonths = numberOfYears * 12;
                double monthlyInterestRate = annualInterestRate / 12 / 100;
                double totalLeasingAmount = leaseAmount
                        * ((1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths)) / monthlyInterestRate);

                System.out.printf("\nYou can get Lease Amount                              : %.2f",
                        (double) Math.round(totalLeasingAmount));

                System.out.print("\n\n\nDo you want to calculate another Leasing Amount (Y/N) : ");
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

    // Search Leasing Ctegory Method
    private static void searchLeasingCategory(Scanner scan) {
        boolean secondSubContinueLoop = true;
        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------------------+");
            System.out.println("|                          Search Leasing Category                         |");
            System.out.println("+--------------------------------------------------------------------------+");

            System.out.print("\nEnter lease amount           : ");
            int leaseAmount = scan.nextInt();

            if (leaseAmount <= 0) {
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
                double annualInterestRate = 0;
                while (true) {
                    System.out.print("\nEnter annual interest rate   : ");
                    annualInterestRate = scan.nextDouble();

                    if (annualInterestRate <= 0) {
                        System.out.println("\nInvalid Input... The annual interest rate must be greater than 0%.");
                    } else {
                        break;
                    }
                }

                for (int i = 3; i <= 5; i++) {
                    double monthlyInterestRate = annualInterestRate / 12 / 100;
                    int numberOfMonths = i * 12;
                    double monthlyInstallment = leaseAmount * monthlyInterestRate
                            / (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths));

                    System.out.printf("\nYour Monthly Installment for " + i + " year leasing plan - %.2f",
                            monthlyInstallment);
                }

                System.out.print("\n\n\nDo you want to Search another Leasing Category (Y/N) : ");
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

    // Calculate Monthly Intallment Method
    private static void calculateMonthlyInstallment(Scanner scan) {
        boolean secondSubContinueLoop = true;
        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------------------+");
            System.out.println("|                         Calculate Leasing Payment                        |");
            System.out.println("+--------------------------------------------------------------------------+");

            System.out.print("\nEnter lease amount           : ");
            int leaseAmount = scan.nextInt();

            if (leaseAmount <= 0) {
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
                double annualInterestRate = 0.0;
                while (true) {
                    System.out.print("\nEnter annual interest rate   : ");
                    annualInterestRate = scan.nextDouble();

                    if (annualInterestRate <= 0) {
                        System.out.print(
                                "\n\tInvalid annual interest rate... The annual interest rate must be greater than 0%. \n");
                    } else {
                        break;
                    }
                }

                int numberOfYears = 0;
                while (true) {
                    System.out.print("\nEnter number of year         : ");
                    numberOfYears = scan.nextInt();

                    if (numberOfYears > 5 || numberOfYears <= 0) {
                        System.out.print("\n\tInvalid number of years... Enter the correct value again...\n");
                    } else {
                        break;
                    }
                }

                double monthlyInterestRate = annualInterestRate / 12 / 100;
                int numberOfMonths = numberOfYears * 12;
                double monthlyInstallment = leaseAmount * monthlyInterestRate
                        / (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths));

                System.out.printf("\nYour monthly Installment     : %.2f", monthlyInstallment);

                System.out.print("\n\n\nDo you want to calculate another Monthly Installment (Y/N) : ");
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

    // ssclTax calculation method
    private static void ssclTax(Scanner scan) {
        boolean subContinueLoop = true;
        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------------------+");
            System.out.println("|               Social Security Contribution Levy (SSCL) Tax               |");
            System.out.println("+--------------------------------------------------------------------------+");

            System.out.print("\nEnter value of Good or Service : ");
            int valueOfGorS = scan.nextInt();

            if (valueOfGorS <= 0) {
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
                double saleTax = valueOfGorS * 0.025;
                double valueAfterSaleTax = valueOfGorS + saleTax;

                double vat = valueAfterSaleTax * 0.15;
                double totalSSCLTax = saleTax + vat;

                System.out.printf("\nYou have to pay SSCL Tax       : %.2f", (double) Math.round(totalSSCLTax));

                System.out.print("\n\n\nDo you want to calculate another SSCL Tax (Y/N) : ");
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

    // Income Tax method
    private static void incomeTax(Scanner scan) {
        boolean subContinueLoop = true;
        double incomeTax = 0;
        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------------------+");
            System.out.println("|                                 INCOME TAX                               |");
            System.out.println("+--------------------------------------------------------------------------+");

            System.out.print("\nEnter your total income per year    : ");
            int incomePerYear = scan.nextInt();

            if (incomePerYear < 0) {
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
                if (incomePerYear <= 1200000) {
                    System.out.println("\n\tYou don't have to pay Income Tax...");

                } else {
                    double remainingIncome = incomePerYear - 1200000;

                    if (remainingIncome <= 500000) {
                        incomeTax = remainingIncome * 0.06;
                    } else if (remainingIncome <= 1000000) {
                        incomeTax = 500000 * 0.06 + (remainingIncome - 500000) * 0.12;
                    } else if (remainingIncome <= 1500000) {
                        incomeTax = 500000 * 0.06 + 500000 * 0.12 + (remainingIncome - 1000000) * 0.18;
                    } else if (remainingIncome <= 2000000) {
                        incomeTax = 500000 * 0.06 + 500000 * 0.12 + 500000 * 0.18 + (remainingIncome - 1500000) * 0.24;
                    } else if (remainingIncome <= 2500000) {
                        incomeTax = 500000 * 0.06 + 500000 * 0.12 + 500000 * 0.18 + 500000 * 0.24
                                + (remainingIncome - 2000000) * 0.30;
                    } else {
                        incomeTax = 500000 * 0.06 + 500000 * 0.12 + 500000 * 0.18 + 500000 * 0.24 + 500000 * 0.30
                                + (remainingIncome - 2500000) * 0.36;
                    }

                    System.out.printf("\nYou have to pay Income Tax per year : %.2f", incomeTax);

                }

                System.out.print("\n\n\nDo you want to calculate another Income Tax (Y/N) : ");
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

    // payable Tax Method
    private static void payableTax(Scanner scan) {
        boolean subContinueLoop = true;
        do {
            System.out.print("\033\143");
            System.out.println("+---------------------------------------------------------------------------+");
            System.out.println("|                                 PAYABLE TAX                               |");
            System.out.println("+---------------------------------------------------------------------------+");

            System.out.print("\nEnter your Employee Payment per month : ");
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
                double payableTax = 0;
                if (empPayment <= 100000) {
                    System.out.println("\n\tYou don't have to pay Payable Tax...");
                } else {

                    double remainingSalary = empPayment - 100000;

                    if (remainingSalary <= 41667) {
                        payableTax = remainingSalary * 0.06;
                    } else if (remainingSalary <= 83334) {
                        payableTax = 41667 * 0.06 + (remainingSalary - 41667) * 0.12;
                    } else if (remainingSalary <= 125001) {
                        payableTax = 41667 * 0.06 + 41667 * 0.12 + (remainingSalary - 83334) * 0.18;
                    } else if (remainingSalary <= 166667) {
                        payableTax = 41667 * 0.06 + 41667 * 0.12 + 41667 * 0.18 + (remainingSalary - 125001) * 0.24;
                    } else if (remainingSalary <= 208334) {
                        payableTax = 41667 * 0.06 + 41667 * 0.12 + 41667 * 0.18 + 41667 * 0.24
                                + (remainingSalary - 166667) * 0.30;
                    } else {
                        payableTax = 41667 * 0.06 + 41667 * 0.12 + 41667 * 0.18 + 41667 * 0.24 + 41667 * 0.30
                                + (remainingSalary - 208334) * 0.36;
                    }

                    System.out.printf("\nYou have to pay Payable Tax per month : %.2f",
                            (double) Math.round(payableTax));

                }

                System.out.print("\n\n\nDo you want to calculate another Payable Tax (Y/N) : ");
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

    // Dividend Tax Method
    private static void dividendTax(Scanner scan) {
        boolean secondSubContinueLoop = true;
        do {
            System.out.print("\033\143");
            System.out.println("+---------------------------------------------------------------+");
            System.out.println("|                          DIVIDENT TAX                         |");
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

    // Bank Interest Tax Method
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

    // Rent Tax Method
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
                System.out.println("\n\tInvalid input...");
                scan.nextLine();

                System.out.print("\n\n\nDo you want to enter the correct value again (Y/N) : ");
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

                System.out.print("\n\n\nDo you want to calculate another Rent Tax (Y/N) : ");
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