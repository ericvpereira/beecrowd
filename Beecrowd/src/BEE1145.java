import java.io.IOException;
import java.util.Scanner;

public class BEE1145 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();

        for (int i = 1; i <= Y; i++) {
            System.out.print(i);

            // Se for o último número da linha, quebra a linha
            if (i % X == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }

        input.close();
    }
}
