package String.Level2;
import java.util.*;

public class TrimString {

    static String myTrim(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }

        String result = "";

        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }

        return result;
    }

    static boolean compare(String a, String b) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string with spaces: ");
        String s = sc.nextLine();

        String userTrim = myTrim(s);
        String builtInTrim = s.trim();

        System.out.println("User-defined trim: [" + userTrim + "]");
        System.out.println("Built-in trim: [" + builtInTrim + "]");

        System.out.println("Both are equal: " +
                compare(userTrim, builtInTrim));
    }
}