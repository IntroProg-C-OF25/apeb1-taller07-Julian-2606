/***
 * Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */
public class Problema7_sumatoria {
    public static void main(String[] args) {
        int limite = 10; // Número máximo en la serie
        double sumatoria = 0.0; // Variable para acumular el resultado de la serie

        // Generar la serie
        StringBuilder serie = new StringBuilder("sumatoria = ");
        for (int i = 1; i <= limite; i++) {
            // Calcular el término actual
            double termino = 1.0 / i;

            // Alternar signo positivo y negativo
            if (i % 2 == 0) {
                sumatoria += termino;
                serie.append(String.format("+ (1/%d) ", i));
            } else {
                sumatoria -= termino;
                serie.append(String.format("- (1/%d) ", i));
            }
        }

        // Imprimir la serie y la sumatoria
        System.out.println(serie.toString().trim());
        System.out.printf("Resultado de la sumatoria: %.5f%n", sumatoria);
    }
}

