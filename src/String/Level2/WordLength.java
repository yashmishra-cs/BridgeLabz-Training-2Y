package String.Level2;
import java.util.*;

public class Q3_WordLength {

    static String[][] wordLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        String[] words = s.split(" ");

        String[][] result = wordLength(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" +
                    Integer.parseInt(result[i][1]));
        }
    }
}