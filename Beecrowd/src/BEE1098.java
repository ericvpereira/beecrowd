public class BEE1098 {
    static void main() {
        for (int i = 0; i <= 10; i++) {
            double valorI = i / 5.0;
            for (int j = 1; j <= 3; j++) {
                double valorJ = j + valorI;
                System.out.printf("I=%.1f J=%.1f\n", valorI, valorJ);
            }
        }

    }
}
