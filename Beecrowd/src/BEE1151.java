import java.util.Scanner;

public class BEE1151 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = 0, b = 1;

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                System.out.print(a);
            } else {
                System.out.print(" " + a);
            }

            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println(); // para quebrar linha no final
        sc.close();
    }
}
