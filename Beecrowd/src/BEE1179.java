import java.util.Scanner;

public class BEE1179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int countPar = 0;
        int countImpar = 0;

        for (int i = 0; i < 15; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                par[countPar] = num;
                countPar++;
                if (countPar == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("par[" + j + "] = " + par[j]);
                    }
                    countPar = 0; // limpa o contador
                }
            } else {
                impar[countImpar] = num;
                countImpar++;
                if (countImpar == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("impar[" + j + "] = " + impar[j]);
                    }
                    countImpar = 0; // limpa o contador
                }
            }
        }

        // imprime o que sobrou nos ímpares
        for (int j = 0; j < countImpar; j++) {
            System.out.println("impar[" + j + "] = " + impar[j]);
        }

        // imprime o que sobrou nos pares
        for (int j = 0; j < countPar; j++) {
            System.out.println("par[" + j + "] = " + par[j]);
        }

        sc.close();
    }
}
