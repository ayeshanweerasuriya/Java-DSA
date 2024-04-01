import java.util.Scanner;

public class NConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean mainProgramContinue = true;
        boolean subProgramContinue = true;

        do {
            System.out.println("[01] Decimal Converter");
            System.out.println("[02] Binary Converter");
            System.out.println("[03] Octal Converter");
            System.out.println("[04] Hexadecimal Converter");
            System.out.println("[05] Roman Number Converter");

            System.out.println("\nEnter Option: ");
            int option = scan.nextInt();

            if (option < 1 || option > 5) {
                System.out.println("Invalid option! Choose the correct one.");
            } else {
                switch (option) {
                    case 1:
                        do {
                            System.out.print("\nEnter an Decimal number: ");
                            int decimalNumber = scan.nextInt();

                            if (decimalNumber < 0) {
                                System.out.println("Invalid input...");

                                System.out.println("Continue Sub Program (1 or 2): ");
                                int isCont = scan.nextInt();

                                if (isCont == 1) {
                                    subProgramContinue = true;
                                } else if (isCont == 2) {
                                    subProgramContinue = false;
                                }
                            } else {
                                // Convert decimal to binary, octal, and hexadecimal
                                String binaryNumber = Integer.toBinaryString(decimalNumber);
                                String octalNumber = Integer.toOctalString(decimalNumber);
                                String hexadecimalNumber = Integer.toHexString(decimalNumber);

                                System.out.println("\n\tBinary number: " + binaryNumber);
                                System.out.println("\tOctal number: " + octalNumber);
                                System.out.println("\tHexadecimal number: " + hexadecimalNumber);

                                System.out.println("Continue Sub Program (1 or 2): ");
                                int isCont = scan.nextInt();

                                if (isCont == 1) {
                                    subProgramContinue = true;
                                } else if (isCont == 2) {
                                    subProgramContinue = false;
                                }
                            }
                        } while (subProgramContinue);
                        break;

                    case 2:
                        do {
                            System.out.print("\nEnter a binary number: ");
                            String binaryString = scan.next(); // Use scan.next() to read the binary input

                            // Check if the input is a valid binary number
                            boolean isValidBinary = true;
                            for (char digit : binaryString.toCharArray()) {
                                if (digit != '0' && digit != '1') {
                                    isValidBinary = false;
                                    break;
                                }
                            }

                            if (!isValidBinary) {
                                System.out.println("Invalid input...");

                                System.out.println("Continue Sub Program (1 or 2): ");
                                int isCont = scan.nextInt();

                                if (isCont == 1) {
                                    subProgramContinue = true;
                                } else if (isCont == 2) {
                                    subProgramContinue = false;
                                }
                            } else {
                                // Convert binary to decimal
                                int decimal = 0;
                                for (int i = binaryString.length() - 1, j = 0; i >= 0; i--, j++) {
                                    int digit = binaryString.charAt(i) - '0';
                                    decimal += digit * Math.pow(2, j);
                                }
                                System.out.println("Decimal number: " + decimal);

                                // Convert binary to octal
                                int octal = Integer.parseInt(Integer.toOctalString(decimal));
                                System.out.println("Octal number: " + octal);

                                // Convert binary to hexadecimal
                                String hexadecimal = Integer.toHexString(decimal);
                                System.out.println("Hexadecimal number: " + hexadecimal.toUpperCase());

                                System.out.println("Continue Sub Program (1 or 2): ");
                                int isCont = scan.nextInt();

                                if (isCont == 1) {
                                    subProgramContinue = true;
                                } else if (isCont == 2) {
                                    subProgramContinue = false;
                                }
                            }

                        } while (subProgramContinue);
                        break;

                    case 3:
                        do {
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
                                System.out.println("Invalid input...");

                                System.out.println("Continue Sub Program (1 or 2): ");
                                int isCont = scan.nextInt();
                                scan.nextLine();

                                if (isCont == 1) {
                                    subProgramContinue = true;
                                } else if (isCont == 2) {
                                    subProgramContinue = false;
                                }

                            } else {
                                // Convert octal to decimal
                                int decimal = Integer.parseInt(octalString, 8);
                                System.out.println("Decimal number: " + decimal);

                                // Convert decimal to binary
                                String binary = Integer.toBinaryString(decimal);
                                System.out.println("Binary number: " + binary);

                                // Convert decimal to hexadecimal
                                String hexadecimal = Integer.toHexString(decimal);
                                System.out.println("Hexadecimal number: " + hexadecimal.toUpperCase());

                                System.out.println("Continue Sub Program (1 or 2): ");
                                int isCont = scan.nextInt();
                                scan.nextLine();

                                if (isCont == 1) {
                                    subProgramContinue = true;
                                } else if (isCont == 2) {
                                    subProgramContinue = false;
                                }
                            }

                        } while (subProgramContinue);
                        break;
                    case 4:
                        do {
                            System.out.print("\nEnter a hexadecimal number: ");
                            String hexString = scan.next().toUpperCase(); // Convert input to uppercase

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

                                System.out.println("Continue Sub Program (1 or 2): ");
                                int isCont = scan.nextInt();
                                scan.nextLine();

                                if (isCont == 1) {
                                    subProgramContinue = true;
                                } else if (isCont == 2) {
                                    subProgramContinue = false;
                                }

                            } else {
                                int decimal = Integer.parseInt(hexString, 16);
                                System.out.println("Decimal number: " + decimal);

                                // Convert decimal to binary
                                String binary = Integer.toBinaryString(decimal);
                                System.out.println("Binary number: " + binary);

                                // Convert decimal to octal
                                String octal = Integer.toOctalString(decimal);
                                System.out.println("Octal number: " + octal);

                                System.out.println("Continue Sub Program (1 or 2): ");
                                int isCont = scan.nextInt();
                                scan.nextLine();

                                if (isCont == 1) {
                                    subProgramContinue = true;
                                } else if (isCont == 2) {
                                    subProgramContinue = false;
                                }
                            }

                        } while (subProgramContinue);
                        break;
                    case 5:
                        do {
                            System.out.println("[01] Decimal Number to Roman Number Converter");
                            System.out.println("[02] Roman Number to Decimal Number Converter");

                            System.out.println("\nEnter Option: ");
                            int selectOption = scan.nextInt();
                            scan.nextLine(); // Consume newline character

                            if (selectOption < 1 || selectOption > 2) {
                                System.out.println("Invalid Option. Please select correct option.");
                            } else {
                                switch (selectOption) {
                                    case 1:
                                        do {
                                            System.out.print("Enter a decimal number: ");
                                            int decimal = scan.nextInt();

                                            if (decimal < 1 || decimal > 3999) {
                                                System.out.println("Invalid input. Enter a number between 1 and 3999.");
                                            }

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

                                            System.out.println("Roman numeral: " + roman);

                                        } while (subProgramContinue);
                                        break;

                                    case 2:
                                        do {
                                            System.out.print("Enter a Roman numeral: ");
                                            String roman = scan.next().toUpperCase();

                                            int decimal = 0;
                                            int prevValue = 0;

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
                                                        System.out.println("Invalid Roman numeral.");
                                                        return;
                                                }

                                                if (value < prevValue) {
                                                    decimal -= value;
                                                } else {
                                                    decimal += value;
                                                }

                                                prevValue = value;
                                            }

                                            System.out.println("Decimal number: " + decimal);

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