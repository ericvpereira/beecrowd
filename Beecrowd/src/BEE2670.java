import java.util.Scanner;

public class BEE2670 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A1 = sc.nextInt(); // Funcionários no 1º andar
        int A2 = sc.nextInt(); // Funcionários no 2º andar
        int A3 = sc.nextInt(); // Funcionários no 3º andar

        // Tempo total se a máquina for colocada em cada andar
        int tempoAndar1 = 0 * A1 + 2 * A2 + 4 * A3;
        int tempoAndar2 = 2 * A1 + 0 * A2 + 2 * A3;
        int tempoAndar3 = 4 * A1 + 2 * A2 + 0 * A3;

        // Pega o menor dos tempos
        int tempoMinimo = Math.min(tempoAndar1, Math.min(tempoAndar2, tempoAndar3));

        System.out.println(tempoMinimo);
    }
}
