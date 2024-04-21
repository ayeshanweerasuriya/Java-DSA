import java.util.*;

class Example {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] ar = new int[10];

        // ---------------------Input------------------------
        for (int i = 0; i < 10; i++) {
            System.out.print("Input number " + (i + 1) + " : ");
            ar[i] = input.nextInt();
        }

        // ----------------------find total----------------------
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += ar[i];
        }

        // ----------------------find maximum-------------------
        int min = ar[0];
        for (int i = 0; i < 10; i++) {
            if (min > ar[i]) {
                min = ar[i];
            }
        }

        System.out.println("Total   : " + total);
        System.out.println("Maximum : " + min);
    }
}
