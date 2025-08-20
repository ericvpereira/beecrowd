import java.util.Scanner;
import java.util.Arrays;

public class BEE1045 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double[] lados = new double[3];
        lados[0] = keyboard.nextDouble();
        lados[1] = keyboard.nextDouble();
        lados[2] = keyboard.nextDouble();

        // Ordena em ordem decrescente
        Arrays.sort(lados);
        double A = lados[2];
        double B = lados[1];
        double C = lados[0];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        keyboard.close();
    }
}
