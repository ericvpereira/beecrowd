import java.io.IOException;
import java.util.Scanner;;

public class BEE2780 {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();

        if (D <= 800) {
            System.out.println("1");
        }

        else if (D <= 1400) {
            System.out.println("2");
        }

        else if (D <= 2000) {
            System.out.println("3");
        }

        sc.close();

    }

}