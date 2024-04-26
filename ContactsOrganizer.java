import java.util.Scanner;

class ContactsOrganizer {
    private static int counter = 1;

    public static void main(String[] args) {
        boolean mainProgramContinue = true;

        do {
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

    public static String generateContactId() {
        String contactId = String.format("C%04d", counter);
        counter++;
        return contactId;
    }

    private static void addContact(Scanner scan) {
        boolean subProgramContinue = true;
        boolean phoneNumberCorrect = true;
        do {
            System.out.println(generateContactId() + "\n=======\n");

            System.out.print("Name: ");
            String name = scan.nextLine();
            scan.nextLine();

            do {
                System.out.print("Phone Number: ");
                String input = scan.nextLine();
                if (input.length() > 10 || input.length() < 10) {
                    System.out.println("\n\tInvalid phone number...");

                    System.out.print("\nDo you want to enter phone number again (Y/N): ");
                    char option = scan.next().toUpperCase().charAt(0);
                    scan.nextLine();

                    if (option == 'Y') {
                        phoneNumberCorrect = true;

                    } else if (option == 'N') {
                        phoneNumberCorrect = false;
                        subProgramContinue = false;
                        main(null);
                    }
                } else {
                    phoneNumberCorrect = false;
                }
            } while (phoneNumberCorrect);

        } while (subProgramContinue);
    }
}