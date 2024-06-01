
import java.util.Random;

public class TableCreateMultiArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {

                int randomNumber = random.nextInt(11);
                arr[i][j] = randomNumber;
            }
        }

        System.out.print("\t");
        for (int i = 0; i < arr[2].length; i++) {
            System.out.print(i + 1 + "\t");
        }

        System.out.println("\n");

        int[] total = new int[arr[2].length];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + "\t");
            for (int j = 0; j < arr[2].length; j++) {
                System.out.print(arr[i][j] + "\t");
                total[j] += arr[i][j];
            }
            System.out.println();
        }

        System.out.print("\nT:\t");
        for (int i = 0; i < total.length; i++) {
            System.out.print(total[i] + "\t");
        }

        System.out.print("\nA:\t");
        for (int i = 0; i < total.length; i++) {
            double avg = (double) total[i] / arr[2].length;
            System.out.print(avg + "\t");
        }

    }
}
