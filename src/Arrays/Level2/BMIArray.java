package Arrays.Level2;
import java.util.*;
public class BMIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of people: ");
        int n = sc.nextInt();
        double[] weight = new double[n];   // kg
        double[] heightCm = new double[n]; // cm
        double[] bmi = new double[n];

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextDouble();
            heightCm[i] = sc.nextDouble();
            //enter weight then height for the same person simultaneously
        }
        // BMI calculation
        for (int i = 0; i < n; i++) {
            double heightM = heightCm[i] / 100;
            bmi[i] = weight[i] / (heightM * heightM);
            System.out.println("\nPerson " + (i + 1) + " BMI = " + bmi[i]);

            if (bmi[i] < 18.5) {
                System.out.println("Underweight");
            } else if (bmi[i] < 25) {
                System.out.println("Normal weight");
            } else if (bmi[i] < 30) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
        }
    }
}