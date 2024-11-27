import java.util.Scanner;

public class Problema3_tabla_5_empleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
        int[]diasTrabajados = new int[5];
        double[] costoPorDia = new double[5];
        double[] totalPagar = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();
            System.out.print("Numero de dias trabajados: ");
            diasTrabajados[i] = scanner.nextInt();
            System.out.print("Costo por dia de trabajo: ");
            costoPorDia[i] = scanner.nextDouble();
            scanner.nextLine();
            totalPagar[i] = diasTrabajados[i] * costoPorDia[i];
        }
        System.out.println("\nReporte de empleados:");
        System.out.println("Nombre\tDías\tCosto/Dia\tTotal");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s  \t%d\t$%.2f\t\t$%.2f%n", nombres[i], diasTrabajados[i], costoPorDia[i], totalPagar[i]);
        }
        scanner.close();
    }
}
/***
 * run:
 * Empleado 1:
 * Nombre: julian
 * Numero de dias trabajados: 10
 * Costo por dia de trabajo: 2,5
 * Empleado 2:
 * Nombre: domeni
 * Numero de dias trabajados: 11
 * Costo por dia de trabajo: 2
 * Empleado 3:
 * Nombre: philip
 * Numero de dias trabajados: 9
 * Costo por dia de trabajo: 3
 * Empleado 4:
 * Nombre: sofia
 * Numero de dias trabajados: 5
 * Costo por dia de trabajo: 4
 * Empleado 5:
 * Nombre: candy
 * Numero de dias trabajados: 12
 * Costo por dia de trabajo: 2
 * Reporte de empleados:
 * Nombre  Dias	Costo/Dia	Total
 * julian  10	$2,50		$25,00
 * domeni  11	$2,00		$22,00
 * philip  9	$3,00		$27,00
 * sofia   5	$4,00		$20,00
 * candy   12	$2,00		$24,00
 */