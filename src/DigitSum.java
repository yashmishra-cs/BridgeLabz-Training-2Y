import java.util.Scanner;
public class DigitSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        while(n>0){
            int a = n%10;
            s+=a;
            n=n/10;
        }
        System.out.println(s);
    }
}
