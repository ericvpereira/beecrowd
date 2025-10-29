import java.util.Scanner;

public class BEE1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rato = 0;
        int sapo = 0;
        int coelho = 0;

        for (int i = 0; i < n; i++) {
            int quantia = sc.nextInt();
            char tipo = sc.next().charAt(0);
            if (tipo == 'R' || tipo == 'r') {
                rato += quantia;
            } else if (tipo == 'S' || tipo == 's') {
                sapo += quantia;
            } else if (tipo == 'C' || tipo == 'c') {
                coelho += quantia;
            }
        }
        int total = rato + sapo + coelho;
        System.out.printf("Total: %d cobaias%n", total);
        System.out.printf("Total de coelhos: %d%n", coelho);
        System.out.printf("Total de ratos: %d%n", rato);
        System.out.printf("Total de sapos: %d%n", sapo);

        double percentualCoelho = ((double) coelho/total) * 100;
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelho);

        double percentualRato = ((double) rato/total) * 100;
        System.out.printf("Percentual de ratos: %.2f %%%n", percentualRato);

        double percentualSapo = ((double) sapo/total) * 100;
        System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapo);

        sc.close();
    }
}
