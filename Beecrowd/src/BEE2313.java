import java.util.Scanner;

public class BEE2313 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A + B > C && A + C > B && B + C > A) {
            if (A > B && B == C) {
                System.out.println("Valido-Isoceles");
                System.out.println("Retangulo: N");
            }
            else if (A == B && B == C) {
                System.out.println("equilatero");
            } else if (A == B && A != C) {
                System.out.println("isosceles");
                System.out.println("");
            } else if (A != B && A != C && B != A && B != C) {
                System.out.println("escaleno");
            }
        }

        else {
            System.out.println("Invalido");
        }

    }
}
