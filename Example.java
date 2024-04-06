import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {

        String[] words = {};

        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\ICET\\ICET.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                words = line.split(" ");

                for (String word : words) {

                    if (word.equalsIgnoreCase("vs")) {
                        continue;
                    } else {
                        System.out.println(word);
                    }
                }
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
