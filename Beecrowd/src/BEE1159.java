import java.util.Scanner;

public class BEE1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        while (X != 0) {
            // Torna X par se for ímpar
            if (X % 2 != 0) {
                X++;
            }

            int total = 0;
            // Soma os 5 pares consecutivos
            for (int i = 0; i < 5; i++) {
                total += X;
                X += 2;
            }

            System.out.println(total);
            X = sc.nextInt();
        }

        sc.close();
    }
}
