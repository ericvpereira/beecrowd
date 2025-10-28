import java.util.Scanner;

public class BEE1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoIncial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int inicioTotalMin = horaInicial * 60 + minutoIncial;
        int finalTotalMin = horaFinal * 60 + minutoFinal;

        int duracaoMinutos = finalTotalMin - inicioTotalMin;

        if (duracaoMinutos <= 0) {
            duracaoMinutos += 24 * 60;
        }

        int duracaoHoras = duracaoMinutos / 60;
        duracaoMinutos = duracaoMinutos % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMinutos);

        sc.close();

    }
}
