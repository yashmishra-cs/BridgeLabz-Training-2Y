package Practice_Problems;
import java.util.*;
public class KilometersToMiles {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km*0.621371;
        System.out.println("Miles: "+miles);
    }
}
