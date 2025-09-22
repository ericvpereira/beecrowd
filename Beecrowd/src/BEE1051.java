import java.util.Scanner;

public class BEE1051 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria o objeto Scanner para ler a entrada

        double salario = sc.nextDouble(); // Lê o valor do salário informado pelo usuário
        double impostoDeRenda = 0.0; // Inicializa a variável do imposto

        // Verifica em qual faixa de imposto o salário se encaixa
        if (salario <= 2000.00) {
            // Salários até 2000 são isentos de imposto
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            // Salários entre 2000.01 e 3000.00 pagam 8% sobre o valor que excede 2000
            impostoDeRenda = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", impostoDeRenda);
        } else if (salario <= 4500.00) {
            // Salários entre 3000.01 e 4500.00 pagam:
            // 8% sobre os primeiros 1000 acima de 2000 (ou seja, de 2000.01 até 3000.00)
            // 18% sobre o valor que excede 3000
            impostoDeRenda = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
            System.out.printf("R$ %.2f\n", impostoDeRenda);
        } else {
            // Salários acima de 4500.00 pagam:
            // 8% sobre os primeiros 1000 acima de 2000 (de 2000.01 até 3000.00)
            // 18% sobre os próximos 1500 (de 3000.01 até 4500.00)
            // 28% sobre o valor que excede 4500
            impostoDeRenda = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
            System.out.printf("R$ %.2f\n", impostoDeRenda);
        }
        sc.close(); // Fecha o Scanner
    }
}
