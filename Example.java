import java.util.Scanner;

class Example {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value for R (0-255): ");
        int r = scan.nextInt();

        System.out.print("Enter the value for G (0-255): ");
        int g = scan.nextInt();

        System.out.print("Enter the value for B (0-255): ");
        int b = scan.nextInt();

        scan.close();

        double w = Math.max(r / 255.0, Math.max(g / 255.0, b / 255.0));
        double c = (w - (r / 255.0)) / w;
        double m = (w - (g / 255.0)) / w;
        double y = (w - (b / 255.0)) / w;
        double k = 1 - w;

        System.out.println("CMYK values:");
        System.out.printf("C: %.2f\n", c);
        System.out.printf("M: %.2f\n", m);
        System.out.printf("Y: %.2f\n", y);
        System.out.printf("K: %.2f\n", k);
    }
}
