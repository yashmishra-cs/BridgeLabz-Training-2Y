package Practice_Problems;
import java.util.*;
public class AvgOf3No {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double avg = (a+b+c)/3;
        System.out.println("Average: "+avg);
    }
}
