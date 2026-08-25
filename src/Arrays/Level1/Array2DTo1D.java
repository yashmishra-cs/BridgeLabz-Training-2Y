package Arrays.Level1;
import java.util.*;
public class Array2DTo1D {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int n=a*b;
        int[] arr1 = new int[n];
        int index = 0;
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                arr1[index] = arr[i][j];
                index++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
