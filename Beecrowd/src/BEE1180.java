import java.util.Scanner;

public class BEE1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];
        int posicao = 0;

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }

        int menorNumero = X[0];

        for (int i = 1; i < X.length; i++) {
            if (X[i] < menorNumero) {
                menorNumero = X[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menorNumero);
        System.out.println("Posicao: " + posicao);

        sc.close();
    }
}
