import java.util.*;
public class LowerToUpper {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";
        for(int i=0;i<s.length()-1;i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                c = (char)(c-32);
            }
            r+=c;
        }
        System.out.println(r);
    }
}
