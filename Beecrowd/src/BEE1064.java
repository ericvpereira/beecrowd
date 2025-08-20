import java.util.Scanner;
import static java.lang.System.out;

public class BEE1064 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] valores = new double[6];
        int count = 0;
        double soma = 0.0;

        for (int i = 0; i < 6; i++) {
            valores[i] = sc.nextDouble();
            if (valores[i] > 0) {
                count++;
                soma += valores[i];
            }
        }

        out.println(count + " valores positivos");
        out.printf("%.1f\n", soma / count);

        sc.close();
    }
}
