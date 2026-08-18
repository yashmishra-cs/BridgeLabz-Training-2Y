import java.util.Scanner;
public class VowelCount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int v = 0;
        int c = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='U'||ch=='I'){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println(v);
        System.out.println(c);
    }
}
