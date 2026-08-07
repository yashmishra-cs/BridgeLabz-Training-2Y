package Practice_Problems;
import java.util.*;
public class VolumeOfCylinder {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume = " + volume);
    }
}
