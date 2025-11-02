import java.util.Locale;
import java.util.Scanner;

public class BEE1184 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char o = sc.next().charAt(0);
        double[][] mat = new double[12][12];
        double soma = 0.0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (j < i) {
                    soma += mat[i][j];
                }
            }
        }
        double media = soma / 66.0;

        if (o == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (o == 'M') {
            System.out.printf("%.1f\n", media);
        }

        sc.close();
    }
}
