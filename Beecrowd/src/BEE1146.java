import java.io.IOException;
import java.util.Scanner;

public class BEE1146 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean entrada = true;

        while (true) {
            int x = sc.nextInt();
            if (x == 0) {
                entrada = false;
                break;
            }
            for (int i = 1; i <= x; i++) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
