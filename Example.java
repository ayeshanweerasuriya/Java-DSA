import java.util.Scanner;

class Example {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the month of birth (1-12): ");
        int month = scan.nextInt();
        System.out.print("Enter the day of birth (1-31): ");
        int day = scan.nextInt();
        scan.close();
        String sign = "";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            sign = "Capricornus";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            sign = "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            sign = "Pisces";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            sign = "Aries (Ram)";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            sign = "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) {
            sign = "Gemini";
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) {
            sign = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            sign = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            sign = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 23)) {
            sign = "Libra";
        } else if ((month == 10 && day >= 24) || (month == 11 && day <= 21)) {
            sign = "Scorpius";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            sign = "Sagittarius";
        } else {
            System.out.println("Invalid date of birth");
            System.exit(0);
        }
        System.out.println("Your astrological sign is: " + sign);
    }
}