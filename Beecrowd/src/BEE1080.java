import java.util.Scanner;

public class BEE1080 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[100]; // Declara um array de 100 inteiros
        int maiorNumero = Integer.MIN_VALUE; // Inicializa com o menor valor possível para int
        int posicao = -1;// Variável para guardar a posição

        for (int i = 0; i < 100; i++) {
            numeros[i] = sc.nextInt(); // Lê o inteiro e armazena no array

            if (numeros[i] > maiorNumero) { // Compara o número atual com o maior encontrado até agora
                maiorNumero = numeros[i]; // Se for maior, atualiza maiorNumero
                posicao = i + 1; // +1 porque no URI/Beecrowd a posição começa em 1
            }
        }

        System.out.println(maiorNumero); // Imprime o resultado
        System.out.println(posicao); // Imprime o resultado

    }
}