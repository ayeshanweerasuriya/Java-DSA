import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

public class Example {
    public static void main(String[] args) {
        Random random = new Random(100);

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        // Sort the array
        Arrays.sort(array);

        // int i = 0;
        // for (int num : array) {
        // LocalTime currentTime = LocalTime.now();
        // System.out.println("Current time: " + currentTime);

        // System.out.print(i + ". :\t");
        // System.out.println(num);
        // i++;
        // }

        jumpSearch(array, 50);
    }

    public static void jumpSearch(int[] arr, int targetValue) {
        int arrayLength = arr.length;
        double jump = Math.sqrt(arrayLength);
        int jumpSize = (int) jump;

        LocalTime startTime = LocalTime.now();
        System.out.println("Jump search started at: " + startTime);

        for (int i = 0; i < arrayLength; i += jumpSize) {
            if (arr[i] == targetValue) {
                System.out.println("Using Jump search: " + i);
                LocalTime endTime = LocalTime.now();
                System.out.println("Jump search ended at: " + endTime);
                return;
            } else if (arr[i] > targetValue) {
                for (int j = i - jumpSize; j < i; j++) {
                    if (j >= 0 && arr[j] == targetValue) {
                        System.out.println("Using Jump search: " + j);
                        LocalTime endTime = LocalTime.now();
                        System.out.println("Jump search ended at: " + endTime);
                        return;
                    }
                }
                break;
            }
        }
        System.out.println("Target value not found using Jump search.");
    }
}
