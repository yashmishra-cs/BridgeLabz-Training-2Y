package Arrays.Level2;
import java.util.*;
public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int largest = arr[n - 1];
        int secondLargest = Integer.MIN_VALUE;
        // Find second largest distinct element
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }
        System.out.println("Largest = " + largest);
        if(secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest does not exist");
        } else {
            System.out.println("Second Largest = " + secondLargest);
        }
    }
}
