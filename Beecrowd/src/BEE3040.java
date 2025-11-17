import java.util.Scanner;

public class BEE3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int d = sc.nextInt();
            int g = sc.nextInt();

            if (h >= 200 && h <= 300 && d >= 50 && g >= 150) {
                System.out.println("Sim");
            } else {
                System.out.println("Nao");
            }
        }
        sc.close();
    }
}
