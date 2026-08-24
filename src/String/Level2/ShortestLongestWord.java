package String.Level2;
import java.util.*;

public class ShortestLongestWord {

    static String[] findWords(String s) {
        return s.split(" ");
    }

    static int[] findShortestLongest(String[] words) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() < words[shortest].length()) {
                shortest = i;
            }

            if (words[i].length() > words[longest].length()) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        String[] words = findWords(s);

        int[] result = findShortestLongest(words);

        System.out.println("Shortest word: " + words[result[0]]);
        System.out.println("Longest word: " + words[result[1]]);
    }
}