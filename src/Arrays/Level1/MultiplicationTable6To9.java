package Arrays.Level1;
import java.util.*;
public class MultiplicationTable6To9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=6&&n<=9){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
        }
    }
}
