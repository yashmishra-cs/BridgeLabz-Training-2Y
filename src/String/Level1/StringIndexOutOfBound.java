package String.Level1;
import java.util.*;
public class StringIndexOutOfBound {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<=s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
