import java.util.Scanner;

public class BEE1061 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dataInicio = sc.nextLine().split(" ");
        int dia1 = Integer.parseInt(dataInicio[1]);

        String[] tempoInicio = sc.nextLine().split(" : ");
        int h1 = Integer.parseInt(tempoInicio[0]);
        int m1 = Integer.parseInt(tempoInicio[1]);
        int s1 = Integer.parseInt(tempoInicio[2]);

        String[] diaFim = sc.nextLine().split(" ");
        int dia2 = Integer.parseInt(diaFim[1]);

        String[] tempoFim = sc.nextLine().split(" : ");
        int h2 = Integer.parseInt(tempoFim[0]);
        int m2 = Integer.parseInt(tempoFim[1]);
        int s2 = Integer.parseInt(tempoFim[2]);

        int inicioEmSegundos = s1 + m1 * 60 + h1 * 3600 + dia1 * 24 * 3600;
        int fimEmSegundos = s2 + m2 * 60 + h2 * 3600 + dia2 * 24 * 3600;

        int duracao = fimEmSegundos - inicioEmSegundos;

        int dias = duracao / (24 * 3600);
        duracao %= (24 * 3600);

        int horas = duracao / 3600;
        duracao %= 3600;

        int minutos = duracao / 60;
        int segundos = duracao % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        sc.close();
    }
}
