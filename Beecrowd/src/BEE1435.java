import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1435 {
    // formata um inteiro para campo de largura 3, alinhado à direita
    private static void appendWidth3(StringBuilder sb, int v) {
        if (v < 10) {
            sb.append("  ").append(v); // duas espaços + dígito
        } else if (v < 100) {
            sb.append(" ").append(v);  // um espaço + dois dígitos
        } else {
            sb.append(v);              // três dígitos ou mais (não acontece em N<=100)
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue; // pular linhas vazias se houver
            int n;
            try {
                n = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                continue;
            }
            if (n == 0) break;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int v = i;
                    if (j < v) v = j;
                    int ni = n - i + 1;
                    if (ni < v) v = ni;
                    int nj = n - j + 1;
                    if (nj < v) v = nj;

                    if (j == 1) {
                        appendWidth3(out, v);
                    } else {
                        out.append(' ');
                        appendWidth3(out, v);
                    }
                }
                out.append('\n');
            }
            out.append('\n');
        }

        System.out.print(out.toString());
    }
}
