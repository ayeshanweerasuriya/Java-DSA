import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Example {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        // System.out.print("Input a String: ");
        // String sentence = scan.nextLine();
        // scan.close();

        ArrayList<String> words = new ArrayList<>(Arrays.asList("James", "Mason", "Lucky"));

        String[] numbers = new String[3];

        // String[] word2 = { "Ayeshan", "James", "Mason" };

        // Measure time for enhanced for loop
        long startTime1 = System.nanoTime();

        for (String word : words) {
            System.out.println(word);
        }

        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("Duration of enhanced for loop: " + duration1 + " nanoseconds");

        // Measure time for standard for loop
        long startTime2 = System.nanoTime();

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println("Duration of standard for loop: " + duration2 + " nanoseconds");
    }
}
