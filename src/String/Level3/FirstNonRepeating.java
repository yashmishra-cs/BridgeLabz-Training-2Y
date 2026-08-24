package String.Level3;
import java.util.Scanner;

public class FirstNonRepeating {

    static char findFirstNonRepeating(String s) {

        int[] frequency = new int[256];

        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char result = findFirstNonRepeating(s);

        if (result == '\0')
            System.out.println("No non-repeating character");
        else
            System.out.println("First non-repeating character: " + result);
    }
}