import java.util.Scanner;

public class BEE2313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Verifica se é triângulo válido
        if (A + B > C && A + C > B && B + C > A) {
            String tipo;

            // Verifica tipo de triângulo
            if (A == B && B == C) {
                tipo = "Valido-Equilatero";
            } else if (A == B || A == C || B == C) {
                tipo = "Valido-Isoceles";
            } else {
                tipo = "Valido-Escaleno";
            }

            System.out.println(tipo);

            // Verifica se é retângulo (Pitágoras)
            int a2 = A * A;
            int b2 = B * B;
            int c2 = C * C;

            if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                System.out.println("Retangulo: S");
            } else {
                System.out.println("Retangulo: N");
            }

        } else {
            System.out.println("Invalido");
        }

        sc.close();
    }
}
