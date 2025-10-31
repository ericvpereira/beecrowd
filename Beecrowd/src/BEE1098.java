public class BEE1098 {
    public static void main(String[] args) {
        for (double i = 0; i <= 2.0; i += 0.2) {
            for (double j = 1; j <= 3; j++) {
                double valorJ = j + i;

                // Evitar problemas de precisão (ex: 1.9999999)
                double valorI = Math.round(i * 10.0) / 10.0;
                valorJ = Math.round(valorJ * 10.0) / 10.0;

                // Se I for inteiro, imprime sem casas decimais
                if (valorI % 1 == 0) {
                    System.out.printf("I=%.0f J=%.0f%n", valorI, valorJ);
                } else {
                    System.out.printf("I=%.1f J=%.1f%n", valorI, valorJ);
                }
            }
        }
    }
}
