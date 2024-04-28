import java.util.*;

class Example {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input no of students : ");
        final int N = input.nextInt();

        System.out.print("Input no of subjects : ");
        final int S = input.nextInt();

        int[][] marks = new int[N][S];
        int[] stTot = new int[N];

        Random r = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < S; j++) {
                marks[i][j] = r.nextInt(101);
            }
        }

        // Find student total marks

        System.out.print("StNo\t");
        for (int j = 0; j < S; j++) {
            System.out.print("Sub" + (j + 1) + "\t");
        }
        System.out.println("Tot\tMax\tMin\tAvg\tGrade\tRank");
        for (int i = 0; i < N; i++) {
            System.out.print(1000 + i + "\t");
            for (int j = 0; j < S; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println(stTot[i]);
        }
    }
}
