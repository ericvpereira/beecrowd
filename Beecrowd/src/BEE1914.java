import java.util.Scanner;

public class BEE1914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qt = sc.nextInt();

        for (int i = 0; i < qt; i++) {
            String jogador1 = sc.next();
            String j1Escolha = sc.next(); // "PAR" ou "IMPAR"
            String jogador2 = sc.next();
            String j2Escolha = sc.next(); // "PAR" ou "IMPAR"
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            int soma = n1 + n2;

            if (soma % 2 == 0) { // soma é par
                if (j1Escolha.equalsIgnoreCase("PAR")) {
                    System.out.println(jogador1);
                } else {
                    System.out.println(jogador2);
                }
            } else { // soma é ímpar
                if (j1Escolha.equalsIgnoreCase("IMPAR")) {
                    System.out.println(jogador1);
                } else {
                    System.out.println(jogador2);
                }
            }
        }

        sc.close();
    }
}
