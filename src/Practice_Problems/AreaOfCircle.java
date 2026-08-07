package Practice_Problems;
import java.util.*;
public class AreaOfCircle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area = " + area);
    }
}
