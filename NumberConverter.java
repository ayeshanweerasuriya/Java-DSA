import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char choice = 'Y';
        char secondChoice = 'Y';

        do {
            System.out.println("\t\t\t\t\t __   ______             __           ");
            System.out.println("\t\t\t\t\t|  \\ /      \\           |  \\          ");
            System.out.println("\t\t\t\t\t \\$$|  $$$$$$\\  ______  | $$  _______ ");
            System.out.println("\t\t\t\t\t|  \\| $$   \\$$ |      \\ | $$ /       \\");
            System.out.println("\t\t\t\t\t| $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
            System.out.println("\t\t\t\t\t| $$| $$   __  /      $$| $$| $$      ");
            System.out.println("\t\t\t\t\t| $$| $$__/  \\|  $$$$$$$| $$| $$_____ ");
            System.out.println("\t\t\t\t\t| $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
            System.out.println("\t\t\t\t\t \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$");
            System.out.println("");
            System.out.println(
                    "  _   _                       _                        _____                                         _                 ");
            System.out.println(
                    " | \\ | |                     | |                      / ____|                                       | |                ");
            System.out.println(
                    " |  \\| |  _   _   _ __ ___   | |__     ___   _ __    | |        ___    _ __   __   __   ___   _ __  | |_    ___   _ __ ");
            System.out.println(
                    " | . ` | | | | | | '_ ` _ \\  | '_ \\   / _ \\ | '__|   | |       / _ \\  | '_ \\  \\ \\ / /  / _ \\ | '__| | __|  / _ \\ | '__|");
            System.out.println(
                    " | |\\  | | |_| | | | | | | | | |_) | |  __/ | |      | |____  | (_) | | | | |  \\ V /  |  __/ | |    | |_  |  __/ | |   ");
            System.out.println(
                    " |_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|       \\_____|  \\___/  |_| |_|   \\_/    \\___| |_|     \\__|  \\___| |_|   ");
            System.out.println(
                    "                                                                                                                       ");
            System.out.println(
                    "========================================================================================================================");

            System.out.println("\n\n\t[01] Decimal Converter");
            System.out.println("\t[02] Binary Converter");
            System.out.println("\t[03] Octal Converter");
            System.out.println("\t[04] Hexadecimal Converter");
            System.out.println("\t[05] Roman Number Converter");

            System.out.print("\nEnter Option -> ");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    do {
                        System.out.println("\n\n+--------------------------------------------------------+");
                        System.out.println("|                    Decimal Converter                   |");
                        System.out.println("+--------------------------------------------------------+");

                        System.out.print("\nEnter an Decimal number: ");
                        int number = scan.nextInt();

                        if (number < 0) {
                            System.out.println("Invalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            secondChoice = scan.next().charAt(0);

                        } else {
                            // Convert decimal to binary, octal, and hexadecimal
                            String binaryNumber = Integer.toBinaryString(number);
                            String octalNumber = Integer.toOctalString(number);
                            String hexadecimalNumber = Integer.toHexString(number);

                            System.out.println("\n\tBinary number: " + binaryNumber);
                            System.out.println("\tOctal number: " + octalNumber);
                            System.out.println("\tHexadecimal number: " + hexadecimalNumber);

                            System.out.print("\nDo you want to go to homepage (Y/N) -> ");
                            secondChoice = scan.next().charAt(0);
                            if (secondChoice == 'Y' || secondChoice == 'y') {
                                secondChoice = 'N';
                            } else if (secondChoice == 'n' || secondChoice == 'N') {
                                secondChoice = 'Y';
                            }
                        }

                    } while (secondChoice == 'Y' || secondChoice == 'y');
                    break;

                case 2:
                    do {
                        System.out.println("\n\n+--------------------------------------------------------+");
                        System.out.println("|                     Binary Converter                   |");
                        System.out.println("+--------------------------------------------------------+");

                        System.out.print("\nEnter an Binary number: ");
                        String binaryStr = scan.nextLine();

                        boolean isValidBinary = true;
                        for (int i = 0; i < binaryStr.length(); i++) {
                            char digit = binaryStr.charAt(i);
                            if (digit != '0' && digit != '1') {
                                isValidBinary = false;
                                break;
                            }
                        }

                        if (isValidBinary) {
                            int decimal = 0;
                            int base = 1;
                            for (int i = binaryStr.length() - 1; i >= 0; i--) {
                                int digit = binaryStr.charAt(i) - '0';
                                decimal += digit * base;
                                base *= 2;
                            }
                            System.out.println("Decimal number: " + decimal);
                            System.out.println("Octal number: " + Integer.toOctalString(decimal));
                            System.out.println("Hexadecimal number: " + Integer.toHexString(decimal).toUpperCase());

                            System.out.print("\nDo you want to go to homepage (Y/N) -> ");
                            secondChoice = scan.next().charAt(0);
                            if (secondChoice == 'Y' || secondChoice == 'y') {
                                secondChoice = 'N';
                            } else if (secondChoice == 'n' || secondChoice == 'N') {
                                secondChoice = 'Y';
                            }

                        } else {
                            System.out.println("\tInvalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            secondChoice = scan.next().charAt(0);
                        }

                    } while (secondChoice == 'Y' || secondChoice == 'y');
                    break;
                case 3:
                case 4:
                case 5:

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice == 'Y');
    }
}
