import java.util.Scanner;

public class Me {
    private static final String password = "Ayeshan20";
    private static int passwordAttempts = 0;

    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String userInput = scanner.nextLine();

        if (userInput.equals(password)) {
            displayDetails();
        } else {
            passwordAttempts++;
            if (passwordAttempts < 3) {
                System.out.print("Incorrect password. Do you want to continue (Yes/No)? ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("Yes")) {
                    checkPassword();
                } else {
                    System.out.println("Program ended.");
                }
            } else {
                System.out.println("You've exceeded the maximum number of password attempts. Program ended.");
            }
        }
        scanner.close();
    }

    public static void displayDetails() {
        System.out.println("\n------Welcome! Here are my details------\n");
        System.out.println("Name: Ayeshan Weerasuriya");
        System.out.println("Age: 23");
    }

    public static void main(String[] args) {
        // Starting Point for the Program
        checkPassword();
    }
}
