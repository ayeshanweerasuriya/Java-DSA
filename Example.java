import java.util.Scanner;

class Example {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the weight of the parcel (kg): ");
        double weight = scan.nextDouble();
        scan.close();

        double courier_charge = 0;

        if (weight <= 5) {
            courier_charge = 500;
            
        } else {
            double extra_Kg = weight - 5;
            courier_charge = 500 + extra_Kg * 100;
        }

        System.out.println("\nWeight of the parcel: " + weight + "kg");
        System.out.printf("Courier charge for the parcel: Rs.%.2f", courier_charge);
    }
}
