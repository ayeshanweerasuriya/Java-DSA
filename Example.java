import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scan.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\n" + input + " is a palindrome.");
        } else {
            System.out.println("\n" + input + " is not a palindrome.");
        }

        scan.close();
    }
}
