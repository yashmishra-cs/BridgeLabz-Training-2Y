package String.Level3;
import java.util.Scanner;

public class FrequencyUsingUnique {

    static char[] uniqueCharacters(String s) {

        char[] temp = new char[s.length()];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[count] = s.charAt(i);
                count++;
            }
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    static int frequency(String s, char ch) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] unique = uniqueCharacters(s);

        for (char ch : unique) {
            System.out.println(ch + " = " + frequency(s, ch));
        }
    }
}