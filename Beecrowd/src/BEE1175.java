import java.util.Scanner;
public class BEE1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N[] = new int[20];

        for (int i = 0; i < N.length; i++) {
            N[i] = sc.nextInt();
        } 
        for (int i = 0; i < N.length / 2; i++) {
            // Guarda o valor do elemento atual em uma variável temporária
            int temp = N[i];
            // Troca o elemento atual pelo elemento correspondente do final do vetor
            N[i] = N[N.length - 1 - i];
            // Coloca o valor temporário na posição do final do vetor
            N[N.length - 1 - i] = temp;
        }

        for (int i = 0; i < N.length; i++) {
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }

        sc.close();
    }
}
