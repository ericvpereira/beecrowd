import java.util.Scanner;

public class BEE1101 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int M = sc.nextInt();
            int N = sc.nextInt();

            if (M <= 0 || N <= 0) {
                break; // Encerra o loop
            }

            int inicio = Math.min(M, N);
            int fim = Math.max(M, N);
            int soma = 0;

            for (int i = inicio; i <= fim; i++) {
                System.out.print(i + " ");
                soma += i;
            }

            System.out.println("Sum=" + soma);
        }

        sc.close();
    }
}
