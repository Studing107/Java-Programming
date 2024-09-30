import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        final double p = 3.14;
        double l, r, S, V;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        r = sc.nextDouble();
        l = sc.nextDouble();
        S = r * r * p;
        v = S * l;
        System.out.println("The area is " + S);
        System.out.println("The volume is " + V);
    }
}
