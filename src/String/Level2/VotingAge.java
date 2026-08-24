package String.Level2;
import java.util.*;

public class VotingAge {

    static int[] generateAges(int n) {

        Random r = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = 10 + r.nextInt(20);
        }

        return ages;
    }

    static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18)
                result[i][1] = "true";
            else
                result[i][1] = "false";
        }

        return result;
    }

    static void display(String[][] result) {

        System.out.println("Age\tCan Vote");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" +
                    result[i][1]);
        }
    }

    public static void main(String[] args) {

        int[] ages = generateAges(10);

        String[][] result = checkVoting(ages);

        display(result);
    }
}