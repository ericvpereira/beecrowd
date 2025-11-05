import java.util.Locale;
import java.util.Scanner;

public class BEE1181 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        double[][] mat = new double[12][12];
        char t = sc.next().charAt(0);
        double soma = 0.0;
        int cont = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (i == l) {
                    soma += mat[i][j];
                    cont++;
                }
            }
        }

        if (t == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (t == 'M') {
            System.out.printf("%.1f\n", soma/ cont);
        }
        sc.close();
    }
}
