import java.util.Scanner;

public class BEE1828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T  = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String S = sc.nextLine();
            String R = sc.nextLine();

            if (S.equals("papel") && R.equals("pedra") || 
                S.equals("pedra") && R.equals("tesoura") ||
                S.equals("tesoura") && R.equals("papel")|| 
                S.equals("lagarto") && R.equals("Spock") ||
                S.equals("tesoura") && R.equals("lagarto")) {
                    System.out.println("Caso #1: Bazinga!");

                }
                else if (S.equals("pedra") && R.equals("papel") || 
                        S.equals("tesoura") && R.equals("pedra") ||
                        S.equals("papel") && R.equals("tesoura")|| 
                        S.equals("Spock") && R.equals("lagarto") ||
                        S.equals("lagarto") && R.equals("tesoura")) {
                            System.out.println("Caso #2: Raj trapaceou!");

                }
                else {
                    System.out.println("Caso #3: De novo!");
                }
        }

        sc.close();

    }
}
