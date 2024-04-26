import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class ContactsOrganizer {
    private static int counter = 1;
    public static String[] contactIdArray = new String[0];
    public static String[] contactNameArray = new String[0];
    public static String[] phoneNumberArray = new String[0];
    public static String[] companyNameArray = new String[0];
    public static double[] salaryArray = new double[0];
    public static String[] birthDayArray = new String[0];

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

            switch (option) {
                case 1:
                    addContact(scan);
                    break;
                case 2:
                    updateContact(scan);
                    break;
                case 3:
                    // deleteContact(scan);
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

        } while (mainProgramContinue);
    }

    // private static void deleteContact(Scanner scan) {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method
    // 'deleteContact'");
    // }

    private static void updateContact(Scanner scan) {
        boolean subProgramContinue = true;
        boolean secondSubLoop = true;
        int indexOfContact = -1;
        do {
            System.out.print("\033\143");
            System.out.print("Search Contact by Name or Phone Number: ");
            String search = scan.nextLine();
            scan.next();

            // name checking array
            for (int i = 0; i < contactNameArray.length; i++) {
                if (search.equals(contactNameArray[i])) {
                    indexOfContact = i;
                    break;
                }
            }

            if (indexOfContact == -1) {
                for (int i = 0; i < phoneNumberArray.length; i++) {
                    if (search.equals(phoneNumberArray[i])) {
                        indexOfContact = i;
                        break;
                    }
                }
            }

            if (indexOfContact == -1) {
                System.out.println("Contact not found.");
            } else {
                System.out.println("\n\n\tContact ID : " + contactIdArray[indexOfContact]);
                System.out.println("\tName : " + contactNameArray[indexOfContact]);
                System.out.println("\tPhone Number : " + phoneNumberArray[indexOfContact]);
                System.out.println("\tCompany Name : " + companyNameArray[indexOfContact]);
                System.out.println("\tSalary : " + salaryArray[indexOfContact]);
                System.out.println("\tB'Day (YYYY-MM-DD) : " + birthDayArray[indexOfContact]);

                System.out.println("\n\nWhat do you want to update...");

                do {
                    System.out.println("\n[01] Name");
                    System.out.println("[02] Phone Number");
                    System.out.println("[03] Company Name");
                    System.out.println("[04] Salary");

                    System.out.print("\n\nEnter an option to continue -> ");
                    int option = scan.nextInt();

                    switch (option) {
                        case 1:
                            for (int i = 0; i < 9; i++) {
                                System.out.print("\033[1A"); // Move cursor up one line
                                System.out.print("\033[2K"); // Clear current line
                            }
                            break;

                        default:
                            System.out.println("Invalid Input");
                            break;
                    }

                } while (secondSubLoop);
            }

        } while (subProgramContinue);
    }

    // Unique contact_id generator method
    public static String generateContactId() {
        String contactId = String.format("C%04d", counter);
        counter++;
        return contactId;
    }

    private static void addContact(Scanner scan) {
        Scanner newScanner = new Scanner(System.in);
        boolean subProgramContinue = true;
        boolean validateLoop = true;
        boolean secondValidateLoop = true;
        boolean thirdValidateLoop = true;

        String contactId = generateContactId();

        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("|                    ADD Contact to the list                   |");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("\n\n" + contactId + "\n=======\n");

            System.out.print("Name              : ");
            String name = scan.nextLine();
            scan.nextLine();

            // Phone number validate code
            String phoneNumber = null;
            do {
                System.out.print("Phone Number      : ");
                phoneNumber = scan.nextLine();

                if (phoneNumber.charAt(0) != '0' || phoneNumber.length() > 10 || phoneNumber.length() < 10) {
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

            double salary = 0;
            do {
                System.out.print("Salary            : ");
                salary = scan.nextDouble();

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

            String birthdayString = null;
            do {
                System.out.print("B'Day (YYYY-MM-DD): ");
                birthdayString = newScanner.nextLine();

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

            extendArrays();

            contactIdArray[contactIdArray.length - 1] = contactId;
            contactNameArray[contactNameArray.length - 1] = name;
            phoneNumberArray[phoneNumberArray.length - 1] = phoneNumber;
            companyNameArray[companyNameArray.length - 1] = companyName;
            salaryArray[salaryArray.length - 1] = salary;
            birthDayArray[birthDayArray.length - 1] = birthdayString;

            System.out.println("\n\tContact has been added successfully...");

            System.out.print("\n\nDo you want to add another contact (Y/N): ");
            char option = scan.next().toUpperCase().charAt(0);

            if (option == 'Y') {
                System.out.print("\033\143");
                continue;
            } else if (option == 'N') {
                subProgramContinue = false;
                main(null);
            }

        } while (subProgramContinue);
    }

    public static void extendArrays() {
        String[] tempContactId = new String[contactIdArray.length + 1];
        String[] tempContactName = new String[contactNameArray.length + 1];
        String[] tempPhoneNumber = new String[phoneNumberArray.length + 1];
        String[] tempCompanyName = new String[companyNameArray.length + 1];
        double[] tempSalary = new double[salaryArray.length + 1];
        String[] tempBirthDay = new String[birthDayArray.length + 1];

        for (int i = 0; i < contactNameArray.length; i++) {
            tempContactId[i] = contactIdArray[i];
            tempContactName[i] = contactNameArray[i];
            tempPhoneNumber[i] = phoneNumberArray[i];
            tempCompanyName[i] = phoneNumberArray[i];
            tempSalary[i] = salaryArray[i];
            tempBirthDay[i] = birthDayArray[i];
        }

        contactIdArray = tempContactId;
        contactNameArray = tempContactName;
        phoneNumberArray = tempPhoneNumber;
        companyNameArray = tempCompanyName;
        salaryArray = tempSalary;
        birthDayArray = tempBirthDay;
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