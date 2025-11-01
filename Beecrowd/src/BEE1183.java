import java.util.Locale;
import java.util.Scanner;

public class BEE1183 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char O = sc.next().charAt(0);
        double[][] mat = new double[12][12];
        double soma = 0.0;

        // Lê os 144 valores da matriz
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        // Soma os elementos acima da diagonal principal
        for (int i = 0; i < 12; i++) {
            for (int j = i + 1; j < 12; j++) { // pode simplificar assim
                soma += mat[i][j];
            }
        }

        // Calcula média se for o caso
        if (O == 'M' || O == 'm') {
            soma /= 66.0;
        }

        // Saída formatada
        System.out.printf("%.1f\n", soma);

        sc.close();
    }
}
