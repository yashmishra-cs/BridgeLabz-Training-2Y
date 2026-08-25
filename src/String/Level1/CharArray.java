package String.Level1;
import java.util.*;
public class CharArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            System.out.println(arr[i]);
        }
    }
}
