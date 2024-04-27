import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class COrganizer {
    private static int counter = 1;
    public static String[] contactIdArray = new String[0];
    public static String[] contactNameArray = new String[0];
    public static String[] phoneNumberArray = new String[0];
    public static String[] companyNameArray = new String[0];
    public static double[] salaryArray = new double[0];
    public static String[] birthDayArray = new String[0];

    public static void main(String[] args) {
        homepage();
    }

    private static void homepage() {
        Scanner scan = new Scanner(System.in);

        boolean mainProgramContinue = true;
        do {
            System.out.println("\n\t /$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$");
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
                    deleteContact(scan);
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

    private static void deleteContact(Scanner scan) {
        boolean subProgramContinue = true;
        int indexOfContact = -1;
        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("|                         Delete Contact                       |");
            System.out.println("+--------------------------------------------------------------+\n\n");
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
                System.out.println("No Contact found as " + search);

                System.out.print("Do you want to try new Search (Y/n): ");
                char option = scan.next().toUpperCase().charAt(0);

                if (option == 'Y') {
                    continue;
                } else {
                    subProgramContinue = false;
                    homepage();
                }

            } else {
                System.out.println("\n\n\tContact ID : " + contactIdArray[indexOfContact]);
                System.out.println("\tName : " + contactNameArray[indexOfContact]);
                System.out.println("\tPhone Number : " + phoneNumberArray[indexOfContact]);
                System.out.println("\tCompany Name : " + companyNameArray[indexOfContact]);
                System.out.println("\tSalary : " + salaryArray[indexOfContact]);
                System.out.println("\tB'Day (YYYY-MM-DD) : " + birthDayArray[indexOfContact]);

                System.out.print("\n\nDo you want to delete this contact (Y/N): ");
                char option = scan.next().toUpperCase().charAt(0);

                if (option == 'Y') {
                    removeContactByIndex(indexOfContact);
                    System.out.println("\n\tContact has been deleted successfully..\n");

                    System.out.print("Do you want to delete another Contact (Y/n): ");
                    char secondOption = scan.next().toUpperCase().charAt(0);

                    if (secondOption == 'Y') {
                        continue;
                    } else {
                        subProgramContinue = false;
                        homepage();
                    }

                } else if (option == 'N') {
                    homepage();
                }
            }
        } while (subProgramContinue);
    }

    // method to remove contact by index
    public static void removeContactByIndex(int index) {
        if (index >= 0 && index < contactIdArray.length) {
            if (contactIdArray.length == 1 && index == 0) {
                contactIdArray = new String[0];
                contactNameArray = new String[0];
                phoneNumberArray = new String[0];
                companyNameArray = new String[0];
                salaryArray = new double[0];
                birthDayArray = new String[0];
            } else {

                String[] tempContactId = new String[contactIdArray.length - 1];
                String[] tempContactName = new String[contactNameArray.length - 1];
                String[] tempPhoneNumber = new String[phoneNumberArray.length - 1];
                String[] tempCompanyName = new String[companyNameArray.length - 1];
                double[] tempSalary = new double[salaryArray.length - 1];
                String[] tempBirthDay = new String[birthDayArray.length - 1];

                System.arraycopy(contactIdArray, 0, tempContactId, 0, index);
                System.arraycopy(contactNameArray, 0, tempContactName, 0, index);
                System.arraycopy(phoneNumberArray, 0, tempPhoneNumber, 0, index);
                System.arraycopy(companyNameArray, 0, tempCompanyName, 0, index);
                System.arraycopy(salaryArray, 0, tempSalary, 0, index);
                System.arraycopy(birthDayArray, 0, tempBirthDay, 0, index);

                System.arraycopy(contactIdArray, index + 1, tempContactId, index, contactIdArray.length - index - 1);
                System.arraycopy(contactNameArray, index + 1, tempContactName, index,
                        contactNameArray.length - index - 1);
                System.arraycopy(phoneNumberArray, index + 1, tempPhoneNumber, index,
                        phoneNumberArray.length - index - 1);
                System.arraycopy(companyNameArray, index + 1, tempCompanyName, index,
                        companyNameArray.length - index - 1);
                System.arraycopy(salaryArray, index + 1, tempSalary, index, salaryArray.length - index - 1);
                System.arraycopy(birthDayArray, index + 1, tempBirthDay, index, birthDayArray.length - index - 1);

                contactIdArray = tempContactId;
                contactNameArray = tempContactName;
                phoneNumberArray = tempPhoneNumber;
                companyNameArray = tempCompanyName;
                salaryArray = tempSalary;
                birthDayArray = tempBirthDay;
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void updateContact(Scanner scan) {
        boolean subProgramContinue = true;
        boolean secondSubLoop = true;
        int indexOfContact = -1;
        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("|                         Update Contact                       |");
            System.out.println("+--------------------------------------------------------------+\n\n");
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
                    System.out.println("\n\t[01] Name");
                    System.out.println("\t[02] Phone Number");
                    System.out.println("\t[03] Company Name");
                    System.out.println("\t[04] Salary");

                    System.out.print("\n\nEnter an option to continue -> ");
                    int option = scan.nextInt();

                    switch (option) {
                        case 1:
                            updateName(indexOfContact);
                            break;
                        case 2:
                            updatePhoneNumber(indexOfContact);
                            break;
                        case 3:
                            updateCompany(indexOfContact);
                            break;
                        case 4:
                            updateSalary(indexOfContact);
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }

                } while (secondSubLoop);
            }

        } while (subProgramContinue);
    }

    public static void updateName(int indexOfContact) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            System.out.print("\033[1A"); // Move cursor up one line
            System.out.print("\033[2K"); // Clear current line
        }

        System.out.println("Update Name\n=============\n");
        System.out.print("Input new name - ");
        String newName = scan.nextLine();

        contactNameArray[indexOfContact] = newName;

        System.out.println("\n\tContact has been updated successfully..\n");

        System.out.print("Do you want to update another contace (Y/N): ");
        char option = scan.next().toUpperCase().charAt(0);

        if (option == 'Y') {
            System.out.print("\033\143");
            updateContact(scan);
        } else if (option == 'N') {
            homepage();
        }
    }

    public static void updateCompany(int indexOfContact) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            System.out.print("\033[1A"); // Move cursor up one line
            System.out.print("\033[2K"); // Clear current line
        }

        System.out.println("Update Company Name\n===================\n");
        System.out.print("Input new company name - ");
        String newCompanyName = scan.nextLine();

        companyNameArray[indexOfContact] = newCompanyName;

        System.out.println("\n\tContact has been updated successfully..\n");

        System.out.print("Do you want to update another contace (Y/N): ");
        char option = scan.next().toUpperCase().charAt(0);

        if (option == 'Y') {
            System.out.print("\033\143");
            updateContact(scan);
        } else if (option == 'N') {
            homepage();
        }
    }

    public static void updateSalary(int indexOfContact) {
        Scanner scan = new Scanner(System.in);
        boolean validateLoop = true;
        double salary = 0.0;

        for (int i = 0; i < 9; i++) {
            System.out.print("\033[1A"); // Move cursor up one line
            System.out.print("\033[2K"); // Clear current line
        }

        do {
            System.out.println("Update Salary\n================\n");
            System.out.print("Salary            : ");
            salary = scan.nextDouble();

            if (salary < 0) {
                System.out.println("\n\tInvalid salary...");

                System.out.print("\nDo you want to enter salary again (Y/N): ");
                char option = scan.next().toUpperCase().charAt(0);
                scan.nextLine();

                if (option == 'Y') {

                    // Found this code to clear lines in StackOverFlow
                    for (int i = 0; i < 5; i++) {
                        System.out.print("\033[1A"); // Move cursor up one line
                        System.out.print("\033[2K"); // Clear current line
                    }
                    continue;

                } else if (option == 'N') {
                    validateLoop = false;
                    homepage();
                }
            } else {
                validateLoop = false;
            }
        } while (validateLoop);
    }

    public static void updatePhoneNumber(int indexOfContact) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            System.out.print("\033[1A"); // Move cursor up one line
            System.out.print("\033[2K"); // Clear current line
        }

        String phoneNumber = null;
        boolean validateLoop = true;

        do {
            System.out.println("Update Phone Number\n====================\n");
            System.out.print("Phone Number      : ");
            phoneNumber = scan.nextLine();

            if (phoneNumber.charAt(0) != '0' || phoneNumber.length() > 10 || phoneNumber.length() < 10) {
                System.out.println("\n\tInvalid phone number...");

                System.out.print("\nDo you want to enter phone number again (Y/N): ");
                char option = scan.next().toUpperCase().charAt(0);
                scan.nextLine();

                if (option == 'Y') {
                    // Found this code to clear lines in StackOverFlow
                    for (int i = 0; i < 5; i++) {
                        System.out.print("\033[1A"); // Move cursor up one line
                        System.out.print("\033[2K"); // Clear current line
                    }
                    continue;

                } else if (option == 'N') {
                    validateLoop = false;
                    homepage();
                }
            } else {
                validateLoop = false;
            }
        } while (validateLoop);

        phoneNumberArray[indexOfContact] = phoneNumber;

        System.out.println("\n\tContact has been updated successfully..\n");

        System.out.print("Do you want to update another contace (Y/N): ");
        char option = scan.next().toUpperCase().charAt(0);

        if (option == 'Y') {
            System.out.print("\033\143");
            updateContact(scan);
        } else if (option == 'N') {
            homepage();
        }
    }

    private static void addContact(Scanner scan) {
        Scanner newScanner = new Scanner(System.in);
        boolean subProgramContinue = true;
        boolean validateLoop = true;
        boolean secondValidateLoop = true;
        boolean thirdValidateLoop = true;
        String contactId = generateContactId();
        String birthdayString = null;
        String phoneNumber = null;
        double salary = 0;

        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("|                    ADD Contact to the list                   |");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("\n\n" + contactId + "\n=======\n");

            String name = null;
            System.out.print("Name              : ");
            name = scan.nextLine();
            scan.nextLine();

            // Phone number validate code
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
                        homepage();
                    }
                } else {
                    validateLoop = false;
                }
            } while (validateLoop);

            System.out.print("Company name      : ");
            String companyName = scan.nextLine();

            do {
                System.out.print("Salary            : ");
                salary = scan.nextDouble();

                if (salary < 0) {
                    System.out.println("\n\tInvalid salary...");

                    System.out.print("\nDo you want to enter salary again (Y/N): ");
                    char option = scan.next().toUpperCase().charAt(0);
                    scan.nextLine();

                    if (option == 'Y') {

                        // Found this code to clear lines in StackOverFlow
                        for (int i = 0; i < 5; i++) {
                            System.out.print("\033[1A"); // Move cursor up one line
                            System.out.print("\033[2K"); // Clear current line
                        }
                    } else if (option == 'N') {
                        secondValidateLoop = false;
                        subProgramContinue = false;
                        homepage();
                    }
                } else {
                    secondValidateLoop = false;
                }

            } while (secondValidateLoop);

            do {
                System.out.print("B'Day (YYYY-MM-DD): ");
                birthdayString = newScanner.nextLine();

                if (!dataValidator(birthdayString)) {
                    System.out.println("\n\tInvalid birthday...");

                    System.out.print("\nDo you want to enter birthday again (Y/N): ");
                    char option = scan.next().toUpperCase().charAt(0);
                    scan.nextLine();

                    if (option == 'Y') {

                        // Found this code to clear lines in StackOverFlow
                        for (int i = 0; i < 5; i++) {
                            System.out.print("\033[1A"); // Move cursor up one line
                            System.out.print("\033[2K"); // Clear current line
                        }
                    } else if (option == 'N') {
                        thirdValidateLoop = false;
                        subProgramContinue = false;
                        homepage();
                    }

                } else {
                    thirdValidateLoop = false;
                }
            } while (thirdValidateLoop);

            extendArrays();

            contactNameArray[contactIdArray.length - 1] = name;
            contactIdArray[contactIdArray.length - 1] = contactId;
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
                homepage();
            }

        } while (subProgramContinue);

    }

    // method to extend arrays
    public static void extendArrays() {
        String[] tempContactId = new String[contactIdArray.length + 1];
        String[] tempContactName = new String[contactIdArray.length + 1];
        String[] tempPhoneNumber = new String[phoneNumberArray.length + 1];
        String[] tempCompanyName = new String[companyNameArray.length + 1];
        double[] tempSalary = new double[salaryArray.length + 1];
        String[] tempBirthDay = new String[birthDayArray.length + 1];

        for (int i = 0; i < contactIdArray.length; i++) {
            tempContactId[i] = contactIdArray[i];
            tempContactName[i] = contactNameArray[i];
            tempPhoneNumber[i] = phoneNumberArray[i];
            tempCompanyName[i] = companyNameArray[i];
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

    // method to generate contact id
    public static String generateContactId() {
        String contactId = String.format("C%04d", counter);
        counter++;
        return contactId;
    }

    // method to validate birthday method
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
