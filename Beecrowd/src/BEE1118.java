import java.io.IOException;
import java.util.Scanner;

public class BEE1118 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double N1 = entrada.nextDouble();
        double N2 = entrada.nextDouble();
        int contador = 0;

        while (N1 >= 0 && N1 <= 10 && N2 >= 0 && N2 <= 10) {
            double media = (N1 + N2) / 2;
            System.out.println("media = " + media);
            System.out.println("novo calculo (1-sim 2-nao)");
            contador++;
        }
        System.out.println("nota invalida");
    }
}
