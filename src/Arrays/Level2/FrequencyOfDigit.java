package Arrays.Level2;
import java.util.*;
public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        int[] freq = new int[10];

        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " is repeated " + freq[i] + " times");
            }
        }
    }
}