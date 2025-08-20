import java.util.Scanner;
public class BEE1071 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int Y = teclado.nextInt();
        int X = teclado.nextInt();
        int soma = 0;

        int menor = Math.min(X, Y);
        int maior = Math.max(X, Y);

        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
        teclado.close();

    }    
}
