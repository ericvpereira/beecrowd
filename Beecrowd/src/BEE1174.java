import java.util.Scanner;

public class BEE1174 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double N[] = new double[100];
            for (int i = 0; i < N.length; i++) {
                N[i] = sc.nextDouble();
                if (N[i] <= 10.0) {
                    System.out.printf("A[%d] = %.1f\n", i, N[i]);
                }
            }
            sc.close();
    }
}
