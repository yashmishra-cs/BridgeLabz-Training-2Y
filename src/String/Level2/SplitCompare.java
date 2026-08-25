package String.Level2;
import java.util.*;

public class SplitCompare {

    static boolean compare(String[] a, String[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        String[] words = s.split(" ");

        System.out.println("\nWords:");
        for (String word : words) {
            System.out.println(word);
        }

        String[] builtIn = s.split(" ");

        System.out.println("\nBoth arrays are equal: "
                + compare(words, builtIn));
    }
}