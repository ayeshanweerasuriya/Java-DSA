import java.util.*;

class Example {
    public static void main(String args[]) {
        int[][] marks = new int[10][4];// 10-->No of students,4-->No of subjects

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            // System.out.println("Input marks for students " + (i + 1) + "....");
            for (int j = 0; j < 4; j++) {
                // System.out.print("\tSubject " + (j + 1) + " : ");
                int randomNumber = random.nextInt(100);
                marks[i][j] = randomNumber;
            }
        }

        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
