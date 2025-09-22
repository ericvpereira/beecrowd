import java.util.Scanner;

public class BEE1151 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int anterior = 0;

        for(int i = 0; i < N; i++) {
            i++;
            System.out.print(i );
            anterior += i;

        }
    }

}
