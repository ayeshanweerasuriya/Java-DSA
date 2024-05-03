public class DifferentSearchAlgorithms {
    public static void main(String[] args) {
        int[] arr = new int[] { 12, 35, 47, 59, 62, 73, 81, 93, 111, 121 };

        int targetValue = arr[9];

        binarySearch(arr, targetValue);
        linearSearch(arr, targetValue);
        jumpSearch(arr, targetValue);
    }

    public static void binarySearch(int[] arr, int targetValue) {
        int low = 0;
        int high = arr.length - 1;

        int midIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            midIndex = (low + high) / 2;

            if (arr[midIndex] == targetValue) {
                break;
            } else {
                if (arr[midIndex] < targetValue) {
                    low = midIndex++;
                } else {
                    high = midIndex--;
                }
            }
        }
        System.out.println("Using Binary search: " + midIndex);
    }

    public static void linearSearch(int[] arr, int targetValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetValue) {
                System.out.println("Using Linear search: " + i);
                break;
            }
        }
    }

    public static void jumpSearch(int[] arr, int targetValue) {
        int arrayLength = arr.length;
        double jump = Math.sqrt(arrayLength);
        int jumpSize = (int) jump;

        for (int i = 0; i < arrayLength; i += jumpSize) {
            if (arr[i] == targetValue) {
                System.out.println("Using Jump search: " + i);
                break;
            } else if (arr[i] > targetValue) {
                for (int j = i - jumpSize; j < i; j++) {
                    if (j >= 0 && arr[j] == targetValue) {
                        System.out.println("Using Jump search: " + j);
                        break;
                    }
                }
            }
        }
    }
}