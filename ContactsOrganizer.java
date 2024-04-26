import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class ContactsOrganizer {
    private static int counter = 1;

    public static void main(String[] args) {
        boolean mainProgramContinue = true;

        do {
            System.out.print("\033\143");
            Scanner scan = new Scanner(System.in);
            System.out.println("\t /$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$");
            System.out.println("\t|__/| $$_____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$");
            System.out.println("\t /$$| $$      | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$");
            System.out.println("\t| $$| $$$$$   | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$");
            System.out.println("\t| $$| $$__/   | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$");
            System.out.println("\t| $$| $$      | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$");
            System.out.println("\t| $$| $$      | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/");
            System.out.println("\t|__/|__/      |__/  |__/|______/|________/|__/  \\__/|_______/");
            System.out.println("\n");
            System.out.println(
                    "   _____            _             _          ____                        _              ");
            System.out.println(
                    "  / ____|          | |           | |        / __ \\                      (_)             ");
            System.out.println(
                    " | |     ___  _ __ | |_ __ _  ___| |_ ___  | |  | |_ __ __ _  __ _ _ __  _ _______ _ __ ");
            System.out.println(
                    " | |    / _ \\| '_ \\| __/ _` |/ __| __/ __| | |  | | '__/ _` |/ _` | '_ \\| |_  / _ \\ '__|");
            System.out
                    .println(
                            " | |___| (_) | | | | || (_| | (__| |_\\__ \\ | |__| | | | (_| | (_| | | | | |/ /  __/ |   ");
            System.out.println(
                    "  \\_____\\___/|_| |_|\\__\\__,_|\\___|\\__|___/  \\____/|_|  \\__, |\\__,_|_| |_|_/___\\___|_|   ");
            System.out.println(
                    "                                                        __/ |                           ");
            System.out.println(
                    "                                                       |___/                            ");
            System.out.println(
                    "\n==========================================================================================");

            System.out.println("\n\n\t[01] ADD Contacts\n");
            System.out.println("\t[02] UPDATE Contacts\n");
            System.out.println("\t[03] DELETE Contacts\n");
            System.out.println("\t[04] SEARCH Contacts\n");
            System.out.println("\t[05] LIST Contacts\n");
            System.out.println("\t[06] Exit");

            System.out.print("\n\nEnter an option to continue -> ");
            int option = scan.nextInt();

            if (option < 1 || option > 6) {
                System.out.println("\nInvalid option! Choose the correct one.\n");
            } else {
                switch (option) {
                    case 1:
                        addContact(scan);
                        break;

                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            }
        } while (mainProgramContinue);
    }

    // Unique contact_id generator method
    public static String generateContactId() {
        String contactId = String.format("C%04d", counter);
        counter++;
        return contactId;
    }

    private static void addContact(Scanner scan) {
        boolean subProgramContinue = true;
        boolean validateLoop = true;
        boolean secondValidateLoop = true;
        boolean thirdValidateLoop = true;

        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("|                    ADD Contact to the list                   |");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("\n\n" + generateContactId() + "\n=======\n");

            System.out.print("Name              : ");
            String name = scan.nextLine();
            scan.nextLine();

            // Phone number validate code
            do {
                System.out.print("Phone Number      : ");
                String input = scan.nextLine();
                if (input.charAt(0) != '0' || input.length() > 10 || input.length() < 10) {
                    System.out.println("\n\tInvalid phone number...");

                    System.out.print("\nDo you want to enter phone number again (Y/N): ");
                    char option = scan.next().toUpperCase().charAt(0);
                    scan.nextLine();

                    if (option == 'Y') {
                        validateLoop = true;

                        // Found this code to clear lines in StackOverFlow
                        for (int i = 0; i < 5; i++) {
                            System.out.print("\033[1A"); // Move cursor up one line
                            System.out.print("\033[2K"); // Clear current line
                        }
                    } else if (option == 'N') {
                        validateLoop = false;
                        subProgramContinue = false;
                        main(null);
                    }
                } else {
                    validateLoop = false;
                }
            } while (validateLoop);

            System.out.print("Company name      : ");
            String companyName = scan.nextLine();

            do {
                System.out.print("Salary            : ");
                double salary = scan.nextDouble();

                if (salary < 0) {
                    System.out.println("\n\tInvalid salary...");

                    System.out.print("\nDo you want to enter salary again (Y/N): ");
                    char option = scan.next().toUpperCase().charAt(0);
                    scan.nextLine();

                    if (option == 'Y') {
                        secondValidateLoop = true;

                        // Found this code to clear lines in StackOverFlow
                        for (int i = 0; i < 5; i++) {
                            System.out.print("\033[1A"); // Move cursor up one line
                            System.out.print("\033[2K"); // Clear current line
                        }
                    } else if (option == 'N') {
                        secondValidateLoop = false;
                        subProgramContinue = false;
                        main(null);
                    }
                } else {
                    secondValidateLoop = false;
                }

            } while (secondValidateLoop);

            Scanner newScanner = new Scanner(System.in);
            do {
                System.out.print("B'Day (YYYY-MM-DD): ");
                String birthdayString = newScanner.nextLine();

                if (!dataValidator(birthdayString)) {
                    System.out.println("\n\tInvalid birthday...");

                    System.out.print("\nDo you want to enter birthday again (Y/N): ");
                    char option = scan.next().toUpperCase().charAt(0);
                    scan.nextLine();

                    if (option == 'Y') {
                        thirdValidateLoop = true;

                        // Found this code to clear lines in StackOverFlow
                        for (int i = 0; i < 5; i++) {
                            System.out.print("\033[1A"); // Move cursor up one line
                            System.out.print("\033[2K"); // Clear current line
                        }
                    } else if (option == 'N') {
                        thirdValidateLoop = false;
                        subProgramContinue = false;
                        main(null);
                    }

                } else {
                    thirdValidateLoop = false;
                }
            } while (thirdValidateLoop);

            System.out.println("\n\tContact has been added successfully...");

            System.out.print("\n\nDo you want to add another contact (Y/N): ");
            char option = scan.next().toUpperCase().charAt(0);

            if (option == 'Y') {
                subProgramContinue = true;
                System.out.print("\033\143");
            } else if (option == 'N') {
                subProgramContinue = false;
                main(null);
            }

        } while (subProgramContinue);
    }

    // Birth date validation method
    private static boolean dataValidator(String birthdayString) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate birthday = LocalDate.parse(birthdayString, dateFormatter);

            LocalDate currentDate = LocalDate.now();

            return !birthday.isAfter(currentDate);
        } catch (Exception e) {
            return false;
        }
    }
}