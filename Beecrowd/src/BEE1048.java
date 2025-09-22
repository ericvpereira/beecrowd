import java.util.Scanner;

public class BEE1048 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double reajuste = 0.00;
        double novoSalario = 0.00;

        if (salario <= 400.00) {
            reajuste = 0.15;
            reajuste = salario * reajuste;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15 %");
        } else if (salario > 400.00 && salario <= 800.00) {
            reajuste = 0.12;
            reajuste = salario * reajuste;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 12 %");
        } else if (salario > 800.00 && salario <= 1200.00) {
            reajuste = 0.10;
            reajuste = salario * reajuste;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 10 %");
        }
        else if (salario > 1200.00 && salario <= 2000.00) {
            reajuste = 0.07;
            reajuste = salario * reajuste;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 7 %");
        }
        else if (salario > 2000.00) {
            reajuste = 0.04;
            reajuste = salario * reajuste;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 4 %");
        }
        sc.close();
    }
}
