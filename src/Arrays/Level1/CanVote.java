package Arrays.Level1;
import java.util.*;
public class CanVote {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=18){
                System.out.println("Eligible Voter");
            }
            else{
                System.out.println("Not a eligible voter");
            }
        }
    }
}
