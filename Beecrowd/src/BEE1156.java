public class BEE1156 {
    public static void main(String[] args) {
        double s = 0.0;
        int denominador = 1;

        for (int i = 1; i <= 39; i += 2) {
            s += (double) i / denominador;
            denominador *= 2;
        }

        System.out.printf("%.2f\n", s);
    }
}
