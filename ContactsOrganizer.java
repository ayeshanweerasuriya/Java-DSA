import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ContactsOrganizer {
    private static int counter = 0;
    public static String[] contactIdArray = new String[0];
    public static String[] contactNameArray = new String[0];
    public static String[] phoneNumberArray = new String[0];
    public static String[] companyNameArray = new String[0];
    public static String[] salaryArray = new String[0];
    public static String[] birthDayArray = new String[0];

    public static void main(String[] args) {
        homepage();
    }

    private static void homepage() {
        Scanner scan = new Scanner(System.in);

        boolean mainProgramContinue = true;
        do {
            System.out.print("\033\143");
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
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    listContact();
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

    // list contact
    private static void listContact() {
        Scanner scan = new Scanner(System.in);
        boolean subProgramContinue = true;
        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("|                          Sort Contact                        |");
            System.out.println("+--------------------------------------------------------------+\n\n");

            System.out.println("\t[01] Sorting by name\n");
            System.out.println("\t[02] Sorting by salary\n");
            System.out.println("\t[03] Sorting by birthday\n\n");

            System.out.print("Enter an option to continue -> ");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    listContactByName();
                    break;
                case 2:
                    listContactBySalary();
                    break;
                case 3:
                    listContactByBirthday();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }

        } while (subProgramContinue);
    }

    private static void listContactByBirthday() {
        Scanner scan = new Scanner(System.in);

        if (contactNameArray.length > 0) {
            clearLines(8);
            sortingArrayByBirthday();
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
            System.out.println(
                    "|   Contact ID  |        Name        |    Phone Number    |       Company      |       Salary       |      Birthday      |");
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
            for (int i = 0; i < contactNameArray.length; i++) {
                System.out.printf("|   %-12s|  %-18s|  %-18s|  %-18s|  %-18s|  %-18s|\n", contactIdArray[i],
                        contactNameArray[i], phoneNumberArray[i], companyNameArray[i], salaryArray[i],
                        birthDayArray[i]);
            }
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
        } else {
            System.out.println("\nThere is no data to show...");
        }

        goToHomePage(scan);
    }

    private static void listContactBySalary() {
        Scanner scan = new Scanner(System.in);

        if (contactNameArray.length > 0) {
            clearLines(8);
            sortingArrayBySalary();
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
            System.out.println(
                    "|   Contact ID  |        Name        |    Phone Number    |       Company      |       Salary       |      Birthday      |");
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
            for (int i = 0; i < contactNameArray.length; i++) {
                System.out.printf("|   %-12s|  %-18s|  %-18s|  %-18s|  %-18s|  %-18s|\n", contactIdArray[i],
                        contactNameArray[i], phoneNumberArray[i], companyNameArray[i], salaryArray[i],
                        birthDayArray[i]);
            }
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
        } else {
            System.out.println("\nThere is no data to show...");
        }

        goToHomePage(scan);
    }

    // swap values based on sort
    public static void swapValues(int i, int j) {
        String tempId = contactIdArray[i];
        String tempName = contactNameArray[i];
        String tempPhone = phoneNumberArray[i];
        String tempCompany = companyNameArray[i];
        String tempSalary = salaryArray[i];
        String tempBirthDay = birthDayArray[i];

        contactIdArray[i] = contactIdArray[j];
        contactNameArray[i] = contactNameArray[j];
        phoneNumberArray[i] = phoneNumberArray[j];
        companyNameArray[i] = companyNameArray[j];
        salaryArray[i] = salaryArray[j];
        birthDayArray[i] = birthDayArray[j];

        contactIdArray[j] = tempId;
        contactNameArray[j] = tempName;
        phoneNumberArray[j] = tempPhone;
        companyNameArray[j] = tempCompany;
        salaryArray[j] = tempSalary;
        birthDayArray[j] = tempBirthDay;
    }

    // sort by birthday
    private static void sortingArrayByBirthday() {
        for (int i = 0; i < birthDayArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < birthDayArray.length; j++) {
                String[] date1 = birthDayArray[minIndex].split("-");
                String[] date2 = birthDayArray[j].split("-");
                int year1 = Integer.parseInt(date1[0]);
                int month1 = Integer.parseInt(date1[1]);
                int day1 = Integer.parseInt(date1[2]);
                int year2 = Integer.parseInt(date2[0]);
                int month2 = Integer.parseInt(date2[1]);
                int day2 = Integer.parseInt(date2[2]);

                // Compare years first
                if (year2 < year1 || (year2 == year1 && month2 < month1)
                        || (year2 == year1 && month2 == month1 && day2 < day1)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swapValues(i, minIndex);
            }
        }
    }

    // sort by name
    private static void sortingArrayByName() {
        for (int i = 0; i < contactNameArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < contactNameArray.length; j++) {
                if (contactNameArray[j].compareToIgnoreCase(contactNameArray[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swapValues(i, minIndex);
            }
        }
    }

    // sort by salary
    private static void sortingArrayBySalary() {
        for (int i = 0; i < salaryArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < salaryArray.length; j++) {
                if (Integer.parseInt(salaryArray[j]) < Integer.parseInt(salaryArray[minIndex])) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swapValues(i, minIndex);
            }
        }
    }

    private static void listContactByName() {
        Scanner scan = new Scanner(System.in);
        if (contactNameArray.length > 0) {
            clearLines(8);
            sortingArrayByName();
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
            System.out.println(
                    "|   Contact ID  |        Name        |    Phone Number    |       Company      |       Salary       |      Birthday      |");
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
            for (int i = 0; i < contactNameArray.length; i++) {
                System.out.printf("|   %-12s|  %-18s|  %-18s|  %-18s|  %-18s|  %-18s|\n", contactIdArray[i],
                        contactNameArray[i], phoneNumberArray[i], companyNameArray[i], salaryArray[i],
                        birthDayArray[i]);
            }
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
        } else {
            System.out.println("\nThere is no data to show...");
        }

        goToHomePage(scan);
    }

    private static void goToHomePage(Scanner scan) {
        System.out.print("\n\nDo you want to go Home Page (Y/N): ");
        char option = scan.next().toUpperCase().charAt(0);

        if (option == 'Y') {
            homepage();
        } else {
            listContact();
        }
    }

    // success input handler
    public static void successHandle(int number, String typeOne, String typeTwo) {
        Scanner scan = new Scanner(System.in);

        if (typeOne != null) {
            System.out.println("\n\tContact has been " + typeOne + " successfully...");
        }

        System.out.print("\n\nDo you want to " + typeTwo + " another contact (Y/N): ");
        char option = scan.next().toUpperCase().charAt(0);

        if (option == 'Y') {
            System.out.print("\033\143");
            switch (number) {
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    deleteContact();
                case 4:
                    searchContact();
                default:
                    break;
            }
        } else if (option == 'N') {
            homepage();
        }
    }

    // search contact
    private static void searchContact() {
        Scanner scan = new Scanner(System.in);
        boolean subProgramContinue = true;
        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("|                         Search Contact                       |");
            System.out.println("+--------------------------------------------------------------+\n\n");
            System.out.print("Search Contact by Name or Phone Number: ");
            String search = scan.nextLine();

            int indexOfContact = -1;
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
                System.out.println("\n\tNo contact found for " + search + "...");
                successHandle(4, null, "search");

            } else {
                System.out.println("\n\n\tContact ID         : " + contactIdArray[indexOfContact]);
                System.out.println("\tName               : " + contactNameArray[indexOfContact]);
                System.out.println("\tPhone Number       : " + phoneNumberArray[indexOfContact]);
                System.out.println("\tCompany Name       : " + companyNameArray[indexOfContact]);
                System.out.println("\tSalary             : " + salaryArray[indexOfContact]);
                System.out.println("\tB'Day (YYYY-MM-DD) : " + birthDayArray[indexOfContact]);

                successHandle(4, null, "search");
            }
        } while (subProgramContinue);
    }

    // delete contact
    private static void deleteContact() {
        Scanner scan = new Scanner(System.in);
        boolean subProgramContinue = true;
        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("|                         Delete Contact                       |");
            System.out.println("+--------------------------------------------------------------+\n\n");
            System.out.print("Search Contact by Name or Phone Number: ");
            String search = scan.nextLine();

            int indexOfContact = -1;
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
                System.out.println("\n\tContact not found.");
                successHandle(3, null, "search");

            } else {
                System.out.println("\n\n\tContact ID         : " + contactIdArray[indexOfContact]);
                System.out.println("\tName               : " + contactNameArray[indexOfContact]);
                System.out.println("\tPhone Number       : " + phoneNumberArray[indexOfContact]);
                System.out.println("\tCompany Name       : " + companyNameArray[indexOfContact]);
                System.out.println("\tSalary             : " + salaryArray[indexOfContact]);
                System.out.println("\tB'Day (YYYY-MM-DD) : " + birthDayArray[indexOfContact]);

                System.out.print("\n\nDo you want to delete this contact (Y/N): ");
                char option = scan.next().toUpperCase().charAt(0);

                if (option == 'Y') {
                    contactIdArray = removeElement(contactIdArray, indexOfContact);
                    contactNameArray = removeElement(contactNameArray, indexOfContact);
                    phoneNumberArray = removeElement(phoneNumberArray, indexOfContact);
                    companyNameArray = removeElement(companyNameArray, indexOfContact);
                    salaryArray = removeElement(salaryArray, indexOfContact);
                    birthDayArray = removeElement(birthDayArray, indexOfContact);

                    successHandle(3, "deleted", "delete");
                } else {
                    homepage();
                }
            }

        } while (subProgramContinue);
    }

    // delete elements
    public static String[] removeElement(String[] array, int index) {
        String[] newArray = new String[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }

    // update contact
    private static void updateContact() {
        Scanner scan = new Scanner(System.in);
        boolean subProgramContinue = true;
        boolean secondSubLoop = true;

        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("|                         Update Contact                       |");
            System.out.println("+--------------------------------------------------------------+\n\n");
            System.out.print("Search Contact by Name or Phone Number: ");
            String search = scan.nextLine();

            int indexOfContact = -1;
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
                System.out.println("\n\tContact not found.");
                successHandle(2, null, "search");

            } else {
                System.out.println("\n\n\tContact ID         : " + contactIdArray[indexOfContact]);
                System.out.println("\tName               : " + contactNameArray[indexOfContact]);
                System.out.println("\tPhone Number       : " + phoneNumberArray[indexOfContact]);
                System.out.println("\tCompany Name       : " + companyNameArray[indexOfContact]);
                System.out.println("\tSalary             : " + salaryArray[indexOfContact]);
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
            scan.close();
        } while (subProgramContinue);
    }

    // clear lines
    public static void clearLines(int lines) {
        for (int i = 0; i < lines; i++) {
            System.out.print("\033[1A"); // Move cursor up one line
            System.out.print("\033[2K"); // Clear current line
        }
    }

    // update name
    public static void updateName(int indexOfContact) {
        Scanner scan = new Scanner(System.in);

        clearLines(9);

        System.out.println("Update Name\n=============\n");
        System.out.print("Input new name - ");
        String newName = scan.nextLine();

        contactNameArray[indexOfContact] = newName;

        successHandle(2, "updated", "update");
    }

    // update company
    public static void updateCompany(int indexOfContact) {
        Scanner scan = new Scanner(System.in);

        clearLines(9);
        System.out.println("Update Company Name\n====================\n");
        System.out.print("Input new company name - ");
        String newCompanyName = scan.nextLine();

        companyNameArray[indexOfContact] = newCompanyName;

        successHandle(2, "updated", "update");
    }

    // update salary
    public static void updateSalary(int indexOfContact) {
        Scanner scan = new Scanner(System.in);

        clearLines(9);

        boolean secondValidateLoop = true;
        System.out.println("Update Salary\n=================\n");
        do {
            System.out.print("Salary            : ");
            String salary = scan.nextLine();

            if (!salaryValidator(salary)) {
                invalidInputHandle("salary");
            } else {
                secondValidateLoop = false;
                salaryArray[indexOfContact] = salary;
            }

        } while (secondValidateLoop);

        successHandle(2, "updated", "update");
    }

    // update phone number
    public static void updatePhoneNumber(int indexOfContact) {
        Scanner scan = new Scanner(System.in);

        clearLines(9);

        boolean validateLoop = true;
        System.out.println("Update Phone Number\n=====================\n");
        do {
            System.out.print("Phone Number      : ");
            String phoneNumber = scan.nextLine();

            if (phoneNumber.charAt(0) != '0' || phoneNumber.length() > 10 || phoneNumber.length() < 10) {
                invalidInputHandle("phone number");
            } else {
                validateLoop = false;
                phoneNumberArray[indexOfContact] = phoneNumber;
            }
        } while (validateLoop);

        successHandle(2, "updated", "update");
    }

    // add contact
    private static void addContact() {
        Scanner scan = new Scanner(System.in);
        boolean subProgramContinue = true;
        String contactId = generateContactId();

        do {
            System.out.print("\033\143");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("|                    ADD Contact to the list                   |");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("\n\n" + contactId + "\n=======\n");

            System.out.print("Name              : ");
            String name = scan.nextLine();

            boolean validateLoop = true;
            String phoneNumber = null;
            do {
                System.out.print("Phone Number      : ");
                phoneNumber = scan.nextLine();

                if (phoneNumber.charAt(0) != '0' || phoneNumber.length() > 10 || phoneNumber.length() < 10) {
                    invalidInputHandle("phone number");
                } else {
                    validateLoop = false;
                }
            } while (validateLoop);

            System.out.print("Company name      : ");
            String companyName = scan.nextLine();

            boolean secondValidateLoop = true;
            String salary = null;
            do {
                System.out.print("Salary            : ");
                salary = scan.nextLine();

                if (!salaryValidator(salary)) {
                    invalidInputHandle("salary");
                } else {
                    secondValidateLoop = false;
                }
            } while (secondValidateLoop);

            boolean thirdValidateLoop = true;
            String birthday = null;
            do {
                System.out.print("B'Day (YYYY-MM-DD): ");
                birthday = scan.nextLine();

                if (!dataValidator(birthday)) {
                    invalidInputHandle("birthday");
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
            birthDayArray[birthDayArray.length - 1] = birthday;

            successHandle(1, "added", "add");

        } while (subProgramContinue);
    }

    // invalid input handler
    public static void invalidInputHandle(String valueType) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\tInvalid " + valueType + "...");

        System.out.print("\nDo you want to enter " + valueType + " again (Y/N): ");
        char option = scan.next().toUpperCase().charAt(0);
        scan.nextLine();

        if (option == 'Y') {
            for (int i = 0; i < 5; i++) {
                System.out.print("\033[1A");
                System.out.print("\033[2K");
            }
        } else if (option == 'N') {
            homepage();
        }
    }

    // salary validator
    public static boolean salaryValidator(String salary) {
        try {
            double salaryDouble = Double.parseDouble(salary);
            if (salaryDouble < 0) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }

        for (int i = 0; i < salary.length(); i++) {
            if (Character.isLetter(salary.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    // extend arrays
    public static void extendArrays() {
        String[] tempContactId = new String[contactIdArray.length + 1];
        String[] tempContactName = new String[contactIdArray.length + 1];
        String[] tempPhoneNumber = new String[phoneNumberArray.length + 1];
        String[] tempCompanyName = new String[companyNameArray.length + 1];
        String[] tempSalary = new String[salaryArray.length + 1];
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

    // generate contact id
    public static String generateContactId() {
        String initialString = "C000";
        counter++;
        String convertCounterToString = String.valueOf(counter);

        String idCon = initialString + convertCounterToString;

        if (idCon.length() == 6) {
            String initialString1 = "C00";
            return initialString1 + convertCounterToString;

        } else if (idCon.length() == 7) {
            String initialString2 = "C0";
            return initialString2 + convertCounterToString;

        } else if (idCon.length() == 8) {
            String initialString3 = "C";
            return initialString3 + convertCounterToString;

        } else {
            return idCon;
        }
    }

    // validate birthday
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
