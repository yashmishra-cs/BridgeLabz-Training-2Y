package Arrays.Level2;
import java.util.*;
public class GradesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = new int[students][3]; // 3 subjects
        double[] avg = new double[students];

        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }

        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += marks[i][j];
            }

            avg[i] = sum / 3.0;

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Average marks : " + avg[i]);

            if (avg[i] >= 80) {
                System.out.println("Grade A");
                System.out.println("Level 4, above agency-normalised standards");
            } else if (avg[i] >= 70) {
                System.out.println("Grade B");
                System.out.println("Level 3, at agency-normalised standards");
            } else if (avg[i] >= 60) {
                System.out.println("Grade C");
                System.out.println("Level 2, below, but approaching agency-normalised standards");
            } else if (avg[i] >= 50) {
                System.out.println("Grade D");
                System.out.println("Level 1, well below agency-normalised standards");
            } else if (avg[i] >= 40) {
                System.out.println("Grade E");
                System.out.println("Level 1-, too below agency-normalised standards");
            } else {
                System.out.println("Grade R");
                System.out.println("Remedial standards");
            }
        }
    }
}