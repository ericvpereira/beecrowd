import java.util.Locale;
import java.util.Scanner;

public class BEE1182 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[][] mat = new double[12][12];

        int colLida = sc.nextInt();         // coluna a ser considerada
        char operacao = sc.next().charAt(0); // 'S' ou 'M'
        double soma = 0.0;

        // leitura da matriz
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        // soma dos elementos da coluna especificada
        for (int i = 0; i < 12; i++) {
            soma += mat[i][colLida];
        }

        // se for média, divide pela quantidade de elementos
        if (operacao == 'M' || operacao == 'm') {
            soma /= 12.0;
        }

        // imprime com uma casa decimal, conforme o problema do Beecrowd
        System.out.printf("%.1f%n", soma);

        sc.close();
    }
}
