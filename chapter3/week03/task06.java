import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = sc.nextDouble();

        System.out.print("Enter the miles per gallon:  ");
        double Efficiency = sc.nextDouble();

        System.out.print("Enter the price per gallon: ");
        double PerGallon = sc.nextDouble();

        double sum = (distance / Efficiency) * PerGallon;
        System.out.printf("The cost of the trip is: $%.2f\n", sum);
    }
}
