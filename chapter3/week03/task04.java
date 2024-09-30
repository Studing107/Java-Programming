import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        double S, G;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        S = sc.nextDouble(); G = sc.nextDouble();
        double g = S * G * 0.01;
        double sum = S + g;
        System.out.println("The gratuity is " + g + " and total is " + sum);
    }
}
