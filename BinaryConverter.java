import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input binary number
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Check if the input is a valid binary number
        boolean isValidBinary = true;
        for (char digit : binaryString.toCharArray()) {
            if (digit != '0' && digit != '1') {
                isValidBinary = false;
                break;
            }
        }

        if (!isValidBinary) {
            System.out.println("Invalid binary number.");
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
        }

        scanner.close();
    }
}
