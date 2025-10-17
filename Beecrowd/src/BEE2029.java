import java.util.Locale;
import java.util.Scanner;

public class BEE2029 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;

        while (sc.hasNext()) {
            double V = sc.nextDouble();
            double D = sc.nextDouble();

            double r = D / 2.0;
            double areaBoca = PI * r * r;
            double altura = V / areaBoca;

            System.out.printf("ALTURA = %.2f\n", altura);
            System.out.printf("AREA = %.2f\n", areaBoca);
        }

        sc.close();
    }
}
