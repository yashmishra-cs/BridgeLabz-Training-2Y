package Arrays.Level1;
import java.util.*;
public class Factors {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n/2;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
