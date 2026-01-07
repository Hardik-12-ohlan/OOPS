import java.util.Scanner;

public class CramersRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        System.out.print("Enter value of d: ");
        double d = sc.nextDouble();

        System.out.print("Enter value of e: ");
        double e = sc.nextDouble();

        System.out.print("Enter value of f: ");
        double f = sc.nextDouble();

        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);


        if (D == 0) {
            System.out.println("No unique solution exists (denominator is zero).");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            System.out.println("Value of x = " + x);
            System.out.println("Value of y = " + y);
        }

        sc.close();
    }
}
