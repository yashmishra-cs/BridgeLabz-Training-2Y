import java.util.Scanner;
public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int h = 1;
        // HCF
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                h = i;
            }
        }

        // LCM
        int l = Math.max(a, b);
        while (true) {
            if (l % a == 0 && l % b == 0) {
                break;
            }
            l++;
        }
        System.out.println("HCF = " + h);
        System.out.println("LCM = " + l);

    }
}