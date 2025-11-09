import java.util.Scanner;

public class BEE1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testes = sc.nextInt();

        for (int i = 0; i < testes; i++) {
            int numero = sc.nextInt();

            if (ehPrimo(numero)) {
                System.out.println(numero + " eh primo");
            } else {
                System.out.println(numero + " nao eh primo");
            }
        }

        sc.close();
    }

    // Método que verifica se um número é primo
    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        // Testa apenas os ímpares até a raiz quadrada de n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
