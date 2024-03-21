import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type the amount of bytes: ");
        int bytes = scan.nextInt();
        scan.close();

        double kilobytes = bytes / 1024.0;
        double megabytes = kilobytes / 1024.0;
        double gigabytes = megabytes / 1024.0;

        System.out.println("\nSize in Kilobytes (KB): " + kilobytes + " kb");
        System.out.println("Size in Megabytes (MB): " + megabytes + " mb");
        System.out.println("Size in Gigabytes (GB): " + gigabytes + " gb");

        }
}