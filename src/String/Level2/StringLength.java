package String.Level2;
import java.util.*;
public class StringLength {

    static int findLength(String s) {
        int count = 0;

        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next();

        System.out.println("Length without length(): " + findLength(s));
        System.out.println("Length using length(): " + s.length());
    }
}