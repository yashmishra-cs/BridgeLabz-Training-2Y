package String.Level3;
import java.util.*;
public class PallindromeString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = "";
        for(int i = s.length()-1;i>=0;i--){
            p+=s.charAt(i);
        }
        if(s.equals(p)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }
}