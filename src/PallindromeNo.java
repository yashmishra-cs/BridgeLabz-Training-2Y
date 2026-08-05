import java.util.Scanner;
public class PallindromeNo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        int n = o;
        int c = 0;
        while(n>0){
            int a = n%10;
            c = c*10+a;
            n = n/10;
        }
        if(c==o){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a Pallindrome");
        }
    }
}
