package Arrays.Level1;
import java.util.*;
public class SumUntilZeroOrLess {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        int i = 0;
        while(arr[i]>0){
            sum+=arr[i];
            i++;
        }
        System.out.println(sum);
    }
}
