
import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean mainProgramContinue = true;
        boolean subProgramContinue = true;

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

            System.out.print("\n\nEnter Option -> ");
            int option = scan.nextInt();

            if (option < 1 || option > 5) {
                System.out.println("\nInvalid option! Choose the correct one.");
            } else {
                System.out.print("\033\143");
                switch (option) {
                    case 1:
                        do {
                            System.out.println("\n+--------------------------------------------------------+");
                            System.out.println("|                    Decimal Converter                   |");
                            System.out.println("+--------------------------------------------------------+");

                            System.out.print("\nEnter an Decimal number: ");
                            int decimalNumber = scan.nextInt();

                            if (decimalNumber < 0) {
                                System.out.println("\tInvalid input...");

                                System.out.print("\nDo you want to input number again (Y/N) -> ");
                                char isCont = scan.next().toUpperCase().charAt(0);

                                if (isCont == 'Y') {
                                    subProgramContinue = true;
                                    System.out.print("\033\143");
                                } else if (isCont == 'N') {
                                    subProgramContinue = false;
                                    System.out.print("\033\143");
                                }

                            } else {
                                // Convert decimal to binary, octal, and hexadecimal
                                String binaryNumber = Integer.toBinaryString(decimalNumber);
                                String octalNumber = Integer.toOctalString(decimalNumber);
                                String hexadecimalNumber = Integer.toHexString(decimalNumber);

                                System.out.println("\n\tBinary number: " + binaryNumber);
                                System.out.println("\tOctal number: " + octalNumber);
                                System.out.println("\tHexadecimal number: " + hexadecimalNumber);

                                System.out.print("\nDo you want to go to homepage (Y/N) -> ");
                                char isCont = scan.next().toUpperCase().charAt(0);

                                if (isCont == 'Y') {
                                    subProgramContinue = false;
                                    System.out.print("\033\143");
                                } else if (isCont == 'N') {
                                    subProgramContinue = true;
                                    System.out.print("\033\143");
                                }
                            }
                        } while (subProgramContinue);
                        break;

                    case 2:
                        do {
                            System.out.println("\n\n+--------------------------------------------------------+");
                            System.out.println("|                     Binary Converter                   |");
                            System.out.println("+--------------------------------------------------------+");

                            System.out.print("\nEnter a binary number: ");
                            String binaryString = scan.next();

                            // Check if the input is a valid binary number
                            boolean isValidBinary = true;
                            for (int i = 0; i < binaryString.length(); i++) {
                                char digit = binaryString.charAt(i);
                                if (digit != '0' && digit != '1') {
                                    isValidBinary = false;
                                    break;
                                }
                            }

                            if (!isValidBinary) {
                                System.out.println("\tInvalid input...");

                                System.out.print("\nDo you want to input number again (Y/N) -> ");
                                char isCont = scan.next().toUpperCase().charAt(0);

                                if (isCont == 'Y') {
                                    subProgramContinue = true;
                                    System.out.print("\033\143");
                                } else if (isCont == 'N') {
                                    subProgramContinue = false;
                                    System.out.print("\033\143");
                                }

                            } else {
                                // Convert binary to decimal
                                int decimal = 0;
                                int powerOfTwo = 1; // Starting from 2^0 = 1

                                for (int i = binaryString.length() - 1; i >= 0; i--) {
                                    char digit = binaryString.charAt(i);
                                    if (digit != '0' && digit != '1') {
                                        System.out.println("Invalid binary string.");
                                        break;
                                    }
                                    int digitValue = digit - '0';
                                    decimal += digitValue * powerOfTwo;
                                    powerOfTwo *= 2; // Multiply the power of two by 2 for each iteration
                                }

                                System.out.println("\n\tDecimal number: " + decimal);

                                // Convert binary to octal
                                int octal = Integer.parseInt(Integer.toOctalString(decimal));
                                System.out.println("\tOctal number: " + octal);

                                // Convert binary to hexadecimal
                                String hexadecimal = Integer.toHexString(decimal);
                                System.out.println("\tHexadecimal number: " + hexadecimal.toUpperCase());

                                System.out.print("\nDo you want to go to homepage (Y/N) -> ");
                                char isCont = scan.next().toUpperCase().charAt(0);

                                if (isCont == 'Y') {
                                    subProgramContinue = false;
                                    System.out.print("\033\143");
                                } else if (isCont == 'N') {
                                    subProgramContinue = true;
                                    System.out.print("\033\143");
                                }
                            }

                        } while (subProgramContinue);
                        break;

                    case 3:
                        do {
                            System.out.println("\n\n+--------------------------------------------------------+");
                            System.out.println("|                     Octal Converter                    |");
                            System.out.println("+--------------------------------------------------------+");

                            System.out.print("\nEnter an octal number: ");
                            String octalString = scan.next();

                            // Check if the input is a valid octal number
                            boolean isValidOctal = true;
                            for (int i = 0; i < octalString.length(); i++) {
                                char digit = octalString.charAt(i);
                                if (digit < '0' || digit > '7') {
                                    isValidOctal = false;
                                    break;
                                }
                            }

                            if (!isValidOctal) {
                                System.out.println("\tInvalid input...");

                                System.out.print("\nDo you want to input number again (Y/N) -> ");
                                char isCont = scan.next().toUpperCase().charAt(0);

                                if (isCont == 'Y') {
                                    subProgramContinue = true;
                                    System.out.print("\033\143");
                                } else if (isCont == 'N') {
                                    subProgramContinue = false;
                                    System.out.print("\033\143");
                                }

                            } else {
                                // Convert octal to decimal
                                int decimal = Integer.parseInt(octalString, 8);
                                System.out.println("\n\tDecimal number: " + decimal);

                                // Convert decimal to binary
                                String binary = Integer.toBinaryString(decimal);
                                System.out.println("\tBinary number: " + binary);

                                // Convert decimal to hexadecimal
                                String hexadecimal = Integer.toHexString(decimal);
                                System.out.println("\tHexadecimal number: " + hexadecimal.toUpperCase());

                                System.out.print("\nDo you want to go to homepage (Y/N) -> ");
                                char isCont = scan.next().toUpperCase().charAt(0);

                                if (isCont == 'Y') {
                                    subProgramContinue = false;
                                    System.out.print("\033\143");
                                } else if (isCont == 'N') {
                                    subProgramContinue = true;
                                    System.out.print("\033\143");
                                }
                            }

                        } while (subProgramContinue);
                        break;
                    case 4:
                        do {
                            System.out.println("\n\n+--------------------------------------------------------+");
                            System.out.println("|                 Hexadecimal Converter                  |");
                            System.out.println("+--------------------------------------------------------+");

                            System.out.print("\nEnter a hexadecimal number: ");
                            String hexString = scan.next().toUpperCase();

                            // Check if the input is empty or contains invalid hexadecimal characters
                            boolean isValidHex = true;
                            for (int i = 0; i < hexString.length(); i++) {
                                char digit = hexString.charAt(i);
                                if (!((digit >= '0' && digit <= '9') || (digit >= 'A' && digit <= 'F'))) {
                                    isValidHex = false;
                                    break;
                                }
                            }

                            if (!isValidHex || hexString.isEmpty()) {
                                System.out.println("Invalid input...");

                                System.out.print("\nDo you want to input number again (Y/N) -> ");
                                char isCont = scan.next().toUpperCase().charAt(0);

                                if (isCont == 'Y') {
                                    subProgramContinue = true;
                                    System.out.print("\033\143");
                                } else if (isCont == 'N') {
                                    subProgramContinue = false;
                                    System.out.print("\033\143");
                                }

                            } else {
                                int decimal = Integer.parseInt(hexString, 16);
                                System.out.println("\n\tDecimal number: " + decimal);

                                // Convert decimal to binary
                                String binary = Integer.toBinaryString(decimal);
                                System.out.println("\tBinary number: " + binary);

                                // Convert decimal to octal
                                String octal = Integer.toOctalString(decimal);
                                System.out.println("\tOctal number: " + octal);

                                System.out.print("\nDo you want to go to homepage (Y/N) -> ");
                                char isCont = scan.next().toUpperCase().charAt(0);

                                if (isCont == 'Y') {
                                    subProgramContinue = false;
                                    System.out.print("\033\143");
                                } else if (isCont == 'N') {
                                    subProgramContinue = true;
                                    System.out.print("\033\143");
                                }
                            }

                        } while (subProgramContinue);
                        break;
                    case 5:
                        do {
                            System.out.println("\n\n+--------------------------------------------------------+");
                            System.out.println("|                Roman Number Converter                  |");
                            System.out.println("+--------------------------------------------------------+");

                            System.out.println("\n\t[01] Decimal Number to Roman Number Converter");
                            System.out.println("\n\t[02] Roman Number to Decimal Number Converter");

                            System.out.print("\nEnter an Option -> ");
                            int selectOption = scan.nextInt();
                            scan.nextLine();

                            if (selectOption < 1 || selectOption > 2) {
                                System.out.println("Invalid Option. Please select correct option.");
                            } else {
                                System.out.print("\033\143");
                                switch (selectOption) {
                                    case 1:
                                        do {
                                            System.out.println(
                                                    "\n\n+------------------------------------------------------------------------+");
                                            System.out.println(
                                                    "|                Decimal Number to Roman Number Converter                |");
                                            System.out.println(
                                                    "+------------------------------------------------------------------------+");
                                            System.out.print("\nEnter a Decimal number: ");
                                            int decimal = scan.nextInt();

                                            if (decimal < 1 || decimal > 3999) {
                                                System.out.println("Invalid input...");

                                                System.out.print("\nDo you want to input number again (Y/N) -> ");
                                                char isCont = scan.next().toUpperCase().charAt(0);

                                                if (isCont == 'Y') {
                                                    subProgramContinue = true;
                                                    System.out.print("\033\143");
                                                } else if (isCont == 'N') {
                                                    subProgramContinue = false;
                                                    System.out.print("\033\143");
                                                }
                                            } else {
                                                String roman = "";
                                                while (decimal >= 1000) {
                                                    roman += "M";
                                                    decimal -= 1000;
                                                }
                                                if (decimal >= 900) {
                                                    roman += "CM";
                                                    decimal -= 900;
                                                }
                                                if (decimal >= 500) {
                                                    roman += "D";
                                                    decimal -= 500;
                                                }
                                                if (decimal >= 400) {
                                                    roman += "CD";
                                                    decimal -= 400;
                                                }
                                                while (decimal >= 100) {
                                                    roman += "C";
                                                    decimal -= 100;
                                                }
                                                if (decimal >= 90) {
                                                    roman += "XC";
                                                    decimal -= 90;
                                                }
                                                if (decimal >= 50) {
                                                    roman += "L";
                                                    decimal -= 50;
                                                }
                                                if (decimal >= 40) {
                                                    roman += "XL";
                                                    decimal -= 40;
                                                }
                                                while (decimal >= 10) {
                                                    roman += "X";
                                                    decimal -= 10;
                                                }
                                                if (decimal >= 9) {
                                                    roman += "IX";
                                                    decimal -= 9;
                                                }
                                                if (decimal >= 5) {
                                                    roman += "V";
                                                    decimal -= 5;
                                                }
                                                if (decimal >= 4) {
                                                    roman += "IV";
                                                    decimal -= 4;
                                                }
                                                while (decimal >= 1) {
                                                    roman += "I";
                                                    decimal -= 1;
                                                }

                                                System.out.println("\n\tRoman numeral: " + roman);

                                                System.out.print("\nDo you want to go to homepage (Y/N) -> ");
                                                char isCont = scan.next().toUpperCase().charAt(0);

                                                if (isCont == 'Y') {
                                                    subProgramContinue = false;
                                                    System.out.print("\033\143");
                                                } else if (isCont == 'N') {
                                                    subProgramContinue = true;
                                                    System.out.print("\033\143");
                                                }
                                            }

                                        } while (subProgramContinue);
                                        break;

                                    case 2:
                                        do {
                                            System.out.print("\033\143");
                                            System.out.println(
                                                    "\n\n+------------------------------------------------------------------------+");
                                            System.out.println(
                                                    "|                Roman Number to Decimal Number Converter                |");
                                            System.out.println(
                                                    "+------------------------------------------------------------------------+");
                                            System.out.print("\nEnter a Roman number: ");
                                            String roman = scan.next().toUpperCase();

                                            int decimal = 0;
                                            int prevValue = 0;
                                            boolean isValidRoman = true;

                                            for (int i = roman.length() - 1; i >= 0; i--) {
                                                char letter = roman.charAt(i);
                                                int value = 0;

                                                switch (letter) {
                                                    case 'I':
                                                        value = 1;
                                                        break;
                                                    case 'V':
                                                        value = 5;
                                                        break;
                                                    case 'X':
                                                        value = 10;
                                                        break;
                                                    case 'L':
                                                        value = 50;
                                                        break;
                                                    case 'C':
                                                        value = 100;
                                                        break;
                                                    case 'D':
                                                        value = 500;
                                                        break;
                                                    case 'M':
                                                        value = 1000;
                                                        break;
                                                    default:
                                                        System.out.println("\tInvalid input...");
                                                        isValidRoman = false;
                                                }

                                                if (!isValidRoman) {
                                                    System.out.print("\nDo you want to input number again (Y/N) -> ");
                                                    char isCont = scan.next().toUpperCase().charAt(0);

                                                    if (isCont == 'Y') {
                                                        subProgramContinue = true;
                                                        break;
                                                    } else if (isCont == 'N') {
                                                        subProgramContinue = false;
                                                        System.out.print("\033\143");
                                                        break;
                                                    }
                                                } else {
                                                    if (value < prevValue) {
                                                        decimal -= value;
                                                    } else {
                                                        decimal += value;
                                                    }

                                                    prevValue = value;
                                                }
                                            }

                                            if (isValidRoman) {
                                                System.out.println("\n\tDecimal number: " + decimal);

                                                System.out.print("\nDo you want to go to homepage (Y/N) -> ");
                                                char isCont = scan.next().toUpperCase().charAt(0);

                                                if (isCont == 'Y') {
                                                    subProgramContinue = false;
                                                    System.out.print("\033\143");
                                                } else if (isCont == 'N') {
                                                    subProgramContinue = true;
                                                    System.out.print("\033\143");
                                                }
                                            }

                                        } while (subProgramContinue);
                                        break;
                                }
                            }

                        } while (subProgramContinue);
                        break;

                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            }

        } while (mainProgramContinue);
        scan.close();
    }
}