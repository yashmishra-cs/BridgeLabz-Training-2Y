package Practice_Problems;
import java.util.*;
public class PerimeterRectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter = " + perimeter);
    }
}
