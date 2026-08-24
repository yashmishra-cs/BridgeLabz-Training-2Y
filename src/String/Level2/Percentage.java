package String.Level2;
import java.util.*;

public class Percentage {

    static int[][] generateMarks(int n) {

        Random r = new Random();

        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {

            marks[i][0] = 10 + r.nextInt(91);
            marks[i][1] = 10 + r.nextInt(91);
            marks[i][2] = 10 + r.nextInt(91);
        }

        return marks;
    }

    static double[][] calculate(int[][] marks) {

        double[][] result = new double[marks.length][4];

        for (int i = 0; i < marks.length; i++) {

            double total =
                    marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3;

            double percentage =
                    (total / 300) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    static String getGrade(double percentage) {

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    static void display(int[][] marks, double[][] result) {

        System.out.println(
                "Physics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < marks.length; i++) {

            String grade = getGrade(result[i][2]);

            System.out.println(
                    marks[i][0] + "\t" +
                            marks[i][1] + "\t\t" +
                            marks[i][2] + "\t" +
                            (int)result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "%\t\t" +
                            grade);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);

        double[][] result = calculate(marks);

        display(marks, result);
    }
}