import java.util.Locale;
import java.util.Scanner;

public class BEE1983 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int idMax = 0;
        double max = -1.0;

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            double nota = sc.nextDouble();

            if (nota > max) {
                max = nota;
                idMax = id;
            }
        }

        if (max >= 8.0) {
            System.out.println(idMax);
        } else {
            System.out.println("Minimum note not reached");
        }

        sc.close();
    }
}
