import java.util.Scanner;

public class BEE1190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char o = sc.next().charAt(0);
        double[][] mat = new double[12][12];
        double soma = 0.0;
        int cont = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                    if (j > 11 - i && j > i) {
                        soma += mat[i][j];
                        cont++;
                }
            }
        }
        if (o == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (o == 'M') {
            System.out.printf("%.1f\n", soma / cont);
        }
        sc.close();
    }
}
