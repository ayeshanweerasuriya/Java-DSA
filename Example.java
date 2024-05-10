import java.util.Random;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Random random = new Random(100);
        Scanner scan = new Scanner(System.in);

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        int i = 0;
        for (int num : array) {
            System.out.println("index " + i + "\t" + num);
            i++;
        }

        System.out.print("Input the Target Value: ");
        int targetValue = scan.nextInt();
        scan.close();

        jumpSearch(array, targetValue);
    }

    public static void jumpSearch(int[] array, int targetValue) {
        int arrayLength = array.length;
        double squreRoot = Math.sqrt(arrayLength);
        int n = (int) squreRoot;

        System.out.println("\n---------------------------------------------\n");
        System.out.println("Array Length: " + arrayLength);
        for (int i = 0; i < array.length; i += n) {
            if (array[i] == targetValue) {
                System.out.println("Target value at index: " + i);
                break;
            }

            if (array[i] > targetValue) {
                for (int j = i; i >= n; j--) {
                    if (array[j] == targetValue) {
                        System.out.println("Target value at index: " + i);
                        break;
                    }
                }
            }
        }

        System.out.println("Target value is not in the array.");
    }
}