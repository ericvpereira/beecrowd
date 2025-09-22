import java.util.Scanner;

public class BEE1074 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i ++) {
            int X = sc.nextInt();
            if (X > 0 && X % 2 == 0) {
                System.out.println("EVEN POSITIVE");
            } else if (X < 0 && X % 2 == 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (X > 0 && X % 2 != 0) {
                System.out.println("ODD POSITIVE");
            } else if (X < 0 && X % 2 != 0) {
                System.out.println("ODD NEGATIVE");
            } else if (X == 0) {
                System.out.println("NULL");
            }
        }
        sc.close();
    }
}
