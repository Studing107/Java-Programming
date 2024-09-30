import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        double w, h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        w = sc.nextDouble();
        System.out.print("Enter the height in inches: ");
        h = sc.nextDouble();

        double Wkilo = w * 0.45359237;
        double Hmet = h * 0.0254;

        double bmi = Wkilo / (Hmet * Hmet);

        System.out.printf("BMI is %.2f\n", bmi);
    }
}
