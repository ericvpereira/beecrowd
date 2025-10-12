import java.util.Scanner;

public class BEE1178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] X = new double[100];
        X[0] = sc.nextDouble();

        for (int i = 1; i < X.length; i++) {
            X[i] = X[i - 1] / 2;
        }

        for (int i = 0; i < X.length; i++) {
            System.out.printf("N[%d] = %.4f%n", i, X[i]);
        }

        sc.close();
    }
}
