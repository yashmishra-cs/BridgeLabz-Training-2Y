package String.Level3;
import java.util.Scanner;

public class UniqueCharacters {

    static char[] findUnique(String s) {

        int n = s.length();
        char[] temp = new char[n];
        int count = 0;

        for (int i = 0; i < n; i++) {

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] result = findUnique(s);

        System.out.println("Unique characters:");

        for (char c : result) {
            System.out.print(c + " ");
        }
    }
}