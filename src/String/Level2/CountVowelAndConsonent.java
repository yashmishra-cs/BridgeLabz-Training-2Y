package String.Level2;
import java.util.*;
public class CountVowelAndConsonent {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s.toLowerCase();
        int v=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println("vowels: "+v);
        System.out.println("consonents: "+c);
    }
}
