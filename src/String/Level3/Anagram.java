package String.Level3;
import java.util.*;
public class Anagram {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        if(s.length()!=t.length()){
            System.out.println("Not anagram");
        }
        else {
            Arrays.sort(s1);
            Arrays.sort(t1);
            if (Arrays.equals(s1, t1)) {
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not anagram");
            }
        }
    }
}