import java.util.Scanner;

public class BEE3224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String input2 = sc.nextLine();

        if (input.length() < input2.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }

    }
}
