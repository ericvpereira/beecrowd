import java.util.Scanner;

public class BEE1113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int menor = Math.min(x, y);
        int maior = Math.max(x, y);

        while (menor < maior) {
            if (menor % 5 == 2 || menor % 5 == 3) {
                System.out.println(menor);
            }
            menor++;
        }
        sc.close();  
    }
}
    

