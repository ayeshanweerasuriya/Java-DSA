
import java.util.Scanner;

public class BillPrint {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                System.out.print(
                                "==================================================================================\n");
                System.out.println(" __          __  _                            _          _ __  __            _   ");
                System.out.println(
                                " \\ \\        / / | |                          | |        (_)  \\/  |          | |  ");
                System.out.println(
                                "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_ ");
                System.out.println(
                                "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _` | '__| __|");
                System.out.println(
                                "    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |_ ");
                System.out.println(
                                "     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|\n");
                System.out.print(
                                "==================================================================================\n");

                System.out.print("\nEnter Customer Phone Number - ");
                String number = scan.nextLine();

                System.out.print("\nEnter Customer Name         - ");
                String name = scan.nextLine();

                System.out.print(
                                "\n==================================================================================\n");

                System.out.print("\nBasmathi Qty(kg) - ");
                int basmathiQuantity = scan.nextInt();

                System.out.print("\nDhal Qty(kg)     - ");
                int dhalQuantity = scan.nextInt();

                System.out.print("\nSugar Qty(kg)    - ");
                int sugarQuantity = scan.nextInt();

                System.out.print("\nHighland Qty     - ");
                int highlandQuantity = scan.nextInt();

                System.out.print("\nYogurt Qty       - ");
                int yogurtQuantity = scan.nextInt();

                System.out.print("\nFlour Qty(kg)    - ");
                int flourQuantity = scan.nextInt();

                System.out.print("\nSoap Qty         - ");
                int soapQuantity = scan.nextInt();

                double basmathiPrice = 250.00;
                double dhalPrice = 180.00;
                double sugarPrice = 150.00;
                double highlandPrice = 1200.00;
                double yoghurtPrice = 50.00;
                double flourPrice = 120.00;
                double soapPrice = 160.00;

                System.out.print(
                                "\n==================================================================================\n");

                double basmathiTotalPrice = basmathiQuantity * basmathiPrice;
                double dhalTotalPrice = dhalQuantity * dhalPrice;
                double sugarTotalPrice = sugarQuantity * sugarPrice;
                double highlandTotalPrice = highlandQuantity * highlandPrice;
                double yogurtTotalPrice = yogurtQuantity * yoghurtPrice;
                double flourTotalPrice = flourQuantity * flourPrice;
                double soapTotalPrice = soapQuantity * soapPrice;

                double totalPrice = basmathiTotalPrice + dhalTotalPrice + sugarTotalPrice +
                                highlandTotalPrice
                                + yogurtTotalPrice + flourTotalPrice + soapTotalPrice;

                double discountPercentage = 0.1;
                double totalDiscount = totalPrice * discountPercentage;

                double finalPrice = totalPrice - totalDiscount;

                System.out.println("\n+---------------------------------------------------------------+");
                System.out.println("|\t\t _   __  __          _____ _______ \t\t|");
                System.out.println("|\t\t(_) |  \\/  |   /\\   |  __ \\__   __|\t\t|");
                System.out.println("|\t\t _  | \\  / |  /  \\  | |__) | | |   \t\t|");
                System.out.println("|\t\t| | | |\\/| | / /\\ \\ |  _  /  | |   \t\t|");
                System.out.println("|\t\t| | | |  | |/ ____ \\| | \\ \\  | |   \t\t|");
                System.out.println("|\t\t|_| |_|  |_/_/    \\_\\_|  \\_\\ |_|   \t\t|");
                System.out.println("|\t\t     225,Galle Road,Panadura.\t\t\t|");
                System.out.println("|\t\t\t\t\t\t\t\t|");
                System.out.println("+---------------------------------------------------------------+");
                System.out.printf("|\t\t\t# Tel  : %-15s                |%n", number);
                System.out.printf("|\t\t\t# Name : %-20s           |%n", name);
                System.out.println("+----------------+-------------+---------------+----------------+");
                System.out.println("|                |     Qty     |   unit price  |      Price     |");
                System.out.println("+----------------+-------------+---------------+----------------+");
                System.out.printf("| # Basmathi     |      %-2d     |       %-6.1f  |       %-6.1f   |\n",
                                basmathiQuantity, basmathiPrice, basmathiTotalPrice);
                System.out.println("|                |             |               |                |");
                System.out.printf("| # Dhal         |      %-2d     |       %-6.1f  |       %-6.1f   |\n", dhalQuantity,
                                dhalPrice, dhalTotalPrice);
                System.out.println("|                |             |               |                |");
                System.out.printf("| # Sugar        |      %-2d     |       %-6.1f  |       %-6.1f   |\n",
                                sugarQuantity, sugarPrice, sugarTotalPrice);
                System.out.println("|                |             |               |                |");
                System.out.printf("| # Highland     |      %-2d     |       %-6.1f  |       %-7.1f  |\n",
                                highlandQuantity, highlandPrice, highlandTotalPrice);
                System.out.println("|                |             |               |                |");
                System.out.printf("| # Yogurt       |      %-2d     |       %-6.1f  |       %-6.1f   |\n",
                                yogurtQuantity, yoghurtPrice, yogurtTotalPrice);
                System.out.println("|                |             |               |                |");
                System.out.printf("| # Flour        |      %-2d     |       %-6.1f  |       %-6.1f   |\n",
                                flourQuantity, flourPrice, flourTotalPrice);
                System.out.println("|                |             |               |                |");
                System.out.printf("| # Soap         |      %-2d     |       %-6.1f  |       %-6.1f   |\n", soapQuantity,
                                soapPrice, soapTotalPrice);
                System.out.println("|                |             |               |                |");
                System.out.println("+----------------+-------------+---------------+----------------+");
                System.out.printf("|                              |  Total        |       %-7.1f  |\n", totalPrice);
                System.out.println("|                              +---------------+----------------|");
                System.out.println("|                              |  discount(10%)|       " + totalDiscount + "    |");
                System.out.println("|                              +---------------+----------------|");
                System.out.printf("|                              |  Price        |       %-7.1f  |\n", finalPrice);
                System.out.println("+------------------------------+---------------+----------------+");

                System.out.print("\n\nEnter Customer given amount: ");
                double customerAmount = scan.nextDouble();

                scan.close();

                double change = customerAmount - finalPrice;

                System.out.println("\n\n+-----------------+------------------+");
                System.out.printf("|    Net Amount   |   %-10.1f     |\n", finalPrice);
                System.out.println("+-----------------+------------------+");
                System.out.printf("|    Cash         |   %-10.1f     |\n", customerAmount);
                System.out.println("+-----------------+------------------+");
                System.out.printf("|    Change       |   %-10.1f     |\n", change);
                System.out.println("+-----------------+------------------+");

                int fiveThousandCount = 0;
                int twoThousandCount = 0;
                int oneThousandCount = 0;
                int fiveHundredCount = 0;
                int oneHundredCount = 0;
                int fiftyCount = 0;
                int twentyCount = 0;
                int tenCount = 0;
                int fiveCount = 0;
                int twoCount = 0;
                int rupeeCount = 0;

                while (0 < change) {
                        if (change >= 5000) {
                                change -= 5000;
                                fiveThousandCount++;

                        } else if (change >= 2000) {
                                change -= 2000;
                                twoThousandCount++;

                        } else if (change >= 1000) {
                                change -= 1000;
                                oneThousandCount++;

                        } else if (change >= 500) {
                                change -= 500;
                                fiveHundredCount++;

                        } else if (change >= 100) {
                                change -= 100;
                                oneHundredCount++;

                        } else if (change >= 50) {
                                change -= 50;
                                fiftyCount++;

                        } else if (change >= 20) {
                                change -= 20;
                                twentyCount++;

                        } else if (change >= 10) {
                                change -= 10;
                                tenCount++;

                        } else if (change >= 5) {
                                change -= 5;
                                fiveCount++;

                        } else if (change >= 2) {
                                change -= 2;
                                twoCount++;

                        } else if (change >= 1) {
                                change -= 1;
                                rupeeCount++;
                        }
                }

                int noOfNotesCount = fiveThousandCount + twoThousandCount + oneThousandCount + fiveHundredCount
                                + oneHundredCount + fiftyCount + twentyCount;
                int noOfCoinCount = tenCount + fiveCount + twoCount + rupeeCount;

                System.out.println("\n\n+-----------------+--------------+");
                System.out.println("|      Value      |      No      |");
                System.out.println("+-----------------+--------------+");
                System.out.printf("|     Rs.5000     |      %-5d   |\n", fiveThousandCount);
                System.out.println("+-----------------+--------------+");
                System.out.printf("|     Rs.2000     |      %-5d   |\n", twoThousandCount);
                System.out.println("+-----------------+--------------+");
                System.out.printf("|     Rs.1000     |      %-5d   |\n", oneThousandCount);
                System.out.println("+-----------------+--------------+");
                System.out.printf("|     Rs.500      |      %-5d   |\n", fiveHundredCount);
                System.out.println("+-----------------+--------------+");
                System.out.printf("|     Rs.100      |      %-5d   |\n", oneHundredCount);
                System.out.println("+-----------------+--------------+");
                System.out.printf("|     Rs.50       |      %-5d   |\n", fiftyCount);
                System.out.println("+-----------------+--------------+");
                System.out.printf("|     Rs.20       |      %-5d   |\n", twentyCount);
                System.out.println("+-----------------+--------------+");
                System.out.printf("|     Rs.10       |      %-5d   |\n", tenCount);
                System.out.println("+-----------------+--------------+");
                System.out.printf("|     Rs.5        |      %-5d   |\n", fiveCount);
                System.out.println("+-----------------+--------------+");
                System.out.printf("|     Rs.2        |      %-5d   |\n", twoCount);
                System.out.println("+-----------------+--------------+");
                System.out.printf("|     Rs.1        |      %-5d   |\n", rupeeCount);
                System.out.println("+-----------------+--------------+");
                System.out.printf("|   No of Notes   |      %-5d   |\n", noOfNotesCount);
                System.out.println("+-----------------+--------------+");
                System.out.printf("|   No of Coint   |      %-5d   |\n", noOfCoinCount);
                System.out.println("+-----------------+--------------+");

                System.out.println("\n\n+------------------------------------+");
                System.out.println("    THANK YOU FOR SHOPPING WITH US    ");
                System.out.println("+------------------------------------+");
        }

}