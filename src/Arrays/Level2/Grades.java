package Arrays.Level2;
import java.util.*;
public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//physics
        int b = sc.nextInt();//chemistry
        int c = sc.nextInt();//maths
        double d = (a + b + c) / 3;//avg marks & percentage(if total marks is 300)
        if (d >= 80) {
            System.out.println("Average marks : " + d);
            System.out.println("Grade A");
            System.out.println("Level 4, above agency-normalised standards");
        }
        if (d >= 70 && d < 80) {
            System.out.println("Average marks : " + d);
            System.out.println("Grade B");
            System.out.println("Level 3, at agency-normalised standards");
        }
        if (d >= 60 && d < 70) {
            System.out.println("Average marks : " + d);
            System.out.println("Grade C");
            System.out.println("Level 2, below, but approaching agency-normalised standards");
        }
        if (d >= 50 && d < 60) {
            System.out.println("Average marks : " + d);
            System.out.println("Grade D");
            System.out.println("Level 1, well below agency-normalised standards");
        }
        if (d >= 40 && d < 50) {
            System.out.println("Average marks : " + d);
            System.out.println("Grade E");
            System.out.println("Level 1-, too below agency-normalised standards");
        }
        if (d < 40) {
            System.out.println("Average marks : " + d);
            System.out.println("Grade R");
            System.out.println("Remedial standards");
        }
    }
}