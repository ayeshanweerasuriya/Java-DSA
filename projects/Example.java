package projects;

import java.time.LocalTime;

class Example {
    public static void main(String[] args) {
        int[] array = { 2, 10, 5, 30, 50, 1, 5, 3, 6, 8 };

        // insertionSort(array);
        selectionSort(array);

        for (int e : array) {
            System.out.print(e + " ");
        }
    }

    // insertion sort
    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

}