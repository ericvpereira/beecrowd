import java.util.Scanner;

public class BEE1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // quantidade de casos de teste

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int soma = 0;

            // Verifica divisores de X
            for (int j = 1; j <= X / 2; j++) {
                if (X % j == 0) {
                    soma += j;
                }
            }

            // Verifica se é perfeito
            if (soma == X) {
                System.out.println(X + " eh perfeito");
            } else {
                System.out.println(X + " nao eh perfeito");
            }
        }

        sc.close();
    }
}
