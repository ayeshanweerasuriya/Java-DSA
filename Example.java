import java.util.*;

class Example {
    public static void sort(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
                System.out.println(Arrays.toString(ar));
                try {
                    Thread.sleep(500);
                } catch (Exception ex) {
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] ar = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
        System.out.println(Arrays.toString(ar));// [100,90,80,70,60,50,40,30,20,10]

        sort(ar);
        System.out.println(Arrays.toString(ar));// [10,20,30,40,50,60,70,80,90,100]
    }
}
