package String.Level2;
import java.util.*;

public class DisplayCharacterType {

    static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                return "Vowel";
            }

            return "Consonant";
        }

        return "Not a Letter";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("\nCharacter\tType");

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            System.out.println(ch + "\t\t" +
                    checkCharacter(ch));
        }
    }
}