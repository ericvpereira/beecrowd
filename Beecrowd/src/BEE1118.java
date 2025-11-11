import java.io.IOException;
import java.util.Scanner;

public class BEE1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;
        int opcao;

        do {
            nota1 = lerNotaValida(sc);
            nota2 = lerNotaValida(sc);
            media = (nota1 + nota2) / 2.0;
            System.out.printf("media = %.2f%n", media);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = sc.nextInt();
            } while (opcao != 1 && opcao != 2);

        } while (opcao == 1);

        sc.close();
    }

    private static double lerNotaValida(Scanner sc) {
        double nota;
        while (true) {
            nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                return nota;
            } else {
                System.out.println("nota invalida");
            }
        }
    }

}

