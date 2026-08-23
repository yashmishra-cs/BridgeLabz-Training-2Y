package Arrays.Level2;
import java.util.*;
public class AgeAndHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//a,b,c ages of Amar, Akbar, Anthony
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();//d,e,f heights of Amar, Akbar, Anthony
        int e = sc.nextInt();
        int f = sc.nextInt();
//Youngest
        if (a < b && a < c) {
            System.out.println("Amar is youngest");
        } else if (b < a && b < c) {
            System.out.println("Akbar is youngest");
        } else if (c < a && c < b) {
            System.out.println("Anthony is youngest");
        }
//Tallest
        if (d > e && d > f) {
            System.out.println("Amar is tallest");
        } else if (e > d && e > f) {
            System.out.println("Akbar is tallest");
        } else if (f > e && f > d) {
            System.out.println("Anthony is tallest");
        }
    }
}