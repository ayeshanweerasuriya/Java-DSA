
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Contact {
    private String id;
    private String name;
    private String phoneNumber;
    private String companyName;
    private String salary;
    private String birthday;

    public Contact(String id, String name, String phoneNumber, String companyName, String salary, String birthday) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
        this.salary = salary;
        this.birthday = birthday;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String getSalary() {
        return this.salary;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setBirthDay(String birthDay) {
        this.birthday = birthDay;
    }
}

public class ContactsOrganizer {
    private static int counter = 0;

    public static Contact[] contactArray = new Contact[0];

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

            Contact contact = new Contact(contactId, name, phoneNumber, companyName, salary, birthday);

            contactArray[contactArray.length - 1] = contact;

            successHandle(1, "added", "add");

        } while (subProgramContinue);
    }

    // extend arrays
    public static void extendArrays() {

        Contact[] tempContactArray = new Contact[contactArray.length + 1];

        for (int i = 0; i < contactArray.length; i++) {
            tempContactArray[i] = contactArray[i];
        }

        contactArray = tempContactArray;
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
            for (int i = 0; i < contactArray.length; i++) {
                if (search.equals(contactArray[i].getName())) {
                    indexOfContact = i;
                    break;
                }
            }

            if (indexOfContact == -1) {
                for (int i = 0; i < contactArray.length; i++) {
                    if (search.equals(contactArray[i].getPhoneNumber())) {
                        indexOfContact = i;
                        break;
                    }
                }
            }

            if (indexOfContact == -1) {
                System.out.println("\n\tNo contact found for " + search + "...");
                successHandle(4, null, "search");

            } else {

                System.out.println("\n\n\tContact ID         : " + contactArray[indexOfContact].getId());
                System.out.println("\tName               : " + contactArray[indexOfContact].getName());
                System.out.println("\tPhone Number       : " + contactArray[indexOfContact].getPhoneNumber());
                System.out.println("\tCompany Name       : " + contactArray[indexOfContact].getCompanyName());
                System.out.println("\tSalary             : " + contactArray[indexOfContact].getSalary());
                System.out.println("\tB'Day (YYYY-MM-DD) : " + contactArray[indexOfContact].getBirthday());

                successHandle(4, null, "search");
            }
        } while (subProgramContinue);
    }

    // list contact
    private static void listContact() {
        Scanner scan = new Scanner(System.in);
        boolean subProgramContinue = true;
        do {
            System.out.print("\033\143");
            System.out.println("\t\t\t+--------------------------------------------------------------+");
            System.out.println("\t\t\t|                          Sort Contact                        |");
            System.out.println("\t\t\t+--------------------------------------------------------------+\n\n");

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

    private static void listContactByName() {
        Scanner scan = new Scanner(System.in);
        if (contactArray.length > 0) {
            clearLines(8);
            sortingArrayByName();
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
            System.out.println(
                    "|   Contact ID  |        Name        |    Phone Number    |       Company      |       Salary       |      Birthday      |");
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
            for (int i = 0; i < contactArray.length; i++) {
                System.out.printf("|   %-12s|  %-18s|  %-18s|  %-18s|  %-18s|  %-18s|\n", contactArray[i].getId(),
                        contactArray[i].getName(), contactArray[i].getPhoneNumber(), contactArray[i].getCompanyName(),
                        contactArray[i].getSalary(),
                        contactArray[i].getBirthday());
            }
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
        } else {
            System.out.println("\nThere is no data to show...");
        }

        goToHomePage(scan);
    }

    // sort by name
    private static void sortingArrayByName() {
        for (int i = 0; i < contactArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < contactArray.length; j++) {
                if (contactArray[j].getName().compareToIgnoreCase(contactArray[minIndex].getName()) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swapValues(i, minIndex);
            }
        }
    }

    private static void listContactBySalary() {
        Scanner scan = new Scanner(System.in);

        if (contactArray.length > 0) {
            clearLines(8);
            sortingArrayBySalary();
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
            System.out.println(
                    "|   Contact ID  |        Name        |    Phone Number    |       Company      |       Salary       |      Birthday      |");
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
            for (int i = 0; i < contactArray.length; i++) {
                System.out.printf("|   %-12s|  %-18s|  %-18s|  %-18s|  %-18s|  %-18s|\n", contactArray[i].getId(),
                        contactArray[i].getName(), contactArray[i].getPhoneNumber(), contactArray[i].getCompanyName(),
                        contactArray[i].getSalary(),
                        contactArray[i].getBirthday());
            }
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
        } else {
            System.out.println("\nThere is no data to show...");
        }

        goToHomePage(scan);
    }

    // sort by salary
    private static void sortingArrayBySalary() {
        for (int i = 0; i < contactArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < contactArray.length; j++) {
                if (Integer.parseInt(contactArray[j].getSalary()) < Integer
                        .parseInt(contactArray[minIndex].getSalary())) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swapValues(i, minIndex);
            }
        }
    }

    private static void listContactByBirthday() {
        Scanner scan = new Scanner(System.in);

        if (contactArray.length > 0) {
            clearLines(8);
            sortingArrayByBirthday();
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
            System.out.println(
                    "|   Contact ID  |        Name        |    Phone Number    |       Company      |       Salary       |      Birthday      |");
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
            for (int i = 0; i < contactArray.length; i++) {
                System.out.printf("|   %-12s|  %-18s|  %-18s|  %-18s|  %-18s|  %-18s|\n", contactArray[i].getId(),
                        contactArray[i].getName(), contactArray[i].getPhoneNumber(), contactArray[i].getCompanyName(),
                        contactArray[i].getSalary(),
                        contactArray[i].getBirthday());
            }
            System.out.println(
                    "+------------------------------------------------------------------------------------------------------------------------+");
        } else {
            System.out.println("\nThere is no data to show...");
        }

        goToHomePage(scan);
    }

    // sort by birthday
    private static void sortingArrayByBirthday() {
        for (int i = 0; i < contactArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < contactArray.length; j++) {
                String[] date1 = contactArray[minIndex].getBirthday().split("-");
                String[] date2 = contactArray[j].getBirthday().split("-");
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

    // swap values based on sort
    public static void swapValues(int i, int j) {

        Contact tempContactArray = contactArray[i];

        contactArray[i] = contactArray[j];

        contactArray[j] = tempContactArray;
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
            for (int i = 0; i < contactArray.length; i++) {
                if (search.equals(contactArray[i].getName())) {
                    indexOfContact = i;
                    break;
                }
            }

            if (indexOfContact == -1) {
                for (int i = 0; i < contactArray.length; i++) {
                    if (search.equals(contactArray[i].getPhoneNumber())) {
                        indexOfContact = i;
                        break;
                    }
                }
            }

            if (indexOfContact == -1) {
                System.out.println("\n\tContact not found.");
                successHandle(3, null, "search");

            } else {

                System.out.println("\n\n\tContact ID         : " + contactArray[indexOfContact].getId());
                System.out.println("\tName               : " + contactArray[indexOfContact].getName());
                System.out.println("\tPhone Number       : " + contactArray[indexOfContact].getPhoneNumber());
                System.out.println("\tCompany Name       : " + contactArray[indexOfContact].getCompanyName());
                System.out.println("\tSalary             : " + contactArray[indexOfContact].getSalary());
                System.out.println("\tB'Day (YYYY-MM-DD) : " + contactArray[indexOfContact].getBirthday());

                System.out.print("\n\nDo you want to delete this contact (Y/N): ");
                char option = scan.next().toUpperCase().charAt(0);

                if (option == 'Y') {

                    contactArray = removeElement(indexOfContact);

                    successHandle(3, "deleted", "delete");
                } else {
                    homepage();
                }
            }

        } while (subProgramContinue);
    }

    // delete elements
    public static Contact[] removeElement(int index) {
        if (index < 0 || index >= contactArray.length) {
            throw new IndexOutOfBoundsException("Index out of range.");
        }

        Contact[] newContactArray = new Contact[contactArray.length - 1];

        for (int i = 0, j = 0; i < contactArray.length; i++) {
            if (i != index) {
                newContactArray[j++] = contactArray[i];
            }
        }

        return newContactArray;
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
            for (int i = 0; i < contactArray.length; i++) {
                if (search.equals(contactArray[i].getName())) {
                    indexOfContact = i;
                    break;
                }
            }

            if (indexOfContact == -1) {
                for (int i = 0; i < contactArray.length; i++) {
                    if (search.equals(contactArray[i].getPhoneNumber())) {
                        indexOfContact = i;
                        break;
                    }
                }
            }

            if (indexOfContact == -1) {
                System.out.println("\n\tContact not found.");
                successHandle(2, null, "search");

            } else {

                System.out.println("\n\n\tContact ID         : " + contactArray[indexOfContact].getId());
                System.out.println("\tName               : " + contactArray[indexOfContact].getName());
                System.out.println("\tPhone Number       : " + contactArray[indexOfContact].getPhoneNumber());
                System.out.println("\tCompany Name       : " + contactArray[indexOfContact].getCompanyName());
                System.out.println("\tSalary             : " + contactArray[indexOfContact].getSalary());
                System.out.println("\tB'Day (YYYY-MM-DD) : " + contactArray[indexOfContact].getBirthday());

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

        contactArray[indexOfContact].setName(newName);

        successHandle(2, "updated", "update");
    }

    // update company
    public static void updateCompany(int indexOfContact) {
        Scanner scan = new Scanner(System.in);

        clearLines(9);
        System.out.println("Update Company Name\n====================\n");
        System.out.print("Input new company name - ");
        String newCompanyName = scan.nextLine();

        contactArray[indexOfContact].setCompanyName(newCompanyName);

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
                contactArray[indexOfContact].setSalary(salary);
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
                contactArray[indexOfContact].setPhoneNumber(phoneNumber);
            }
        } while (validateLoop);

        successHandle(2, "updated", "update");
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
