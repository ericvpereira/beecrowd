import java.util.Scanner;

public class BEE1176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] fib = new int[61];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= 60; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];

        }

        for (int j = 0; j < N; j++) {
            int num = sc.nextInt();
            System.out.println("fib(" + num + ") = " + " " + fib[num]);
        }
        sc.close();
    }    
}
