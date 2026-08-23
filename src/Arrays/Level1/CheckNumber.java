package Arrays.Level1;
import java.util.*;
public class CheckNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                System.out.println("Positive");
            }
            else if(arr[i]<0){
                System.out.println("Negative");
            }
            else{
                System.out.println("Zero");
            }
        }
    }
}
