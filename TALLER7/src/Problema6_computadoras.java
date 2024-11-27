/***
 * Problema 6
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente: 
 * Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20% En caso que sea otro tipo de cliente, no hay descuento. Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 */

import java.util.Scanner;

public class Problema6_computadoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder reporte = new StringBuilder("Reporte de Ventas\n");
        double totalVentas = 0.0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Venta " + i + ":");
            System.out.print("Nombre del cliente: ");
            String nombreCliente = scanner.nextLine();
            System.out.print("Costo de la computadora: ");
            double costoComputadora = scanner.nextDouble();
            System.out.print("Tipo de cliente (1, 2 u otro): ");
            int tipoCliente = scanner.nextInt();
            scanner.nextLine(); 
            double descuento = 0.0;
            if (tipoCliente == 1) {
                descuento = costoComputadora * 0.10;
            } else if (tipoCliente == 2) {
                descuento = costoComputadora * 0.20;
            }
            double precioFinal = costoComputadora - descuento;
            totalVentas += precioFinal;
            reporte.append(String.format("Cliente %s, tipo %d, compra computadora con precio $%.2f%n", 
                                          nombreCliente, tipoCliente, precioFinal));
        }
        System.out.println("\n" + reporte);
        System.out.printf("Total de ventas: $%.2f%n", totalVentas);
        scanner.close();
    }
}
/***
 * run:
Venta 1:
Nombre del cliente: julian
Costo de la computadora: 300
Tipo de cliente (1, 2 u otro): 1
Venta 2:
Nombre del cliente: pablo
Costo de la computadora: 200
Tipo de cliente (1, 2 u otro): 2
Venta 3:
Nombre del cliente: pedro
Costo de la computadora: 100
Tipo de cliente (1, 2 u otro): 1
Venta 4:
Nombre del cliente: daniel
Costo de la computadora: 400
Tipo de cliente (1, 2 u otro): 1
Venta 5:
Nombre del cliente: richard
Costo de la computadora: 00
Tipo de cliente (1, 2 u otro): 2
Venta 6:
Nombre del cliente: dani
Costo de la computadora: 200
Tipo de cliente (1, 2 u otro): 2
Venta 7:
Nombre del cliente: jair
Costo de la computadora: 100
Tipo de cliente (1, 2 u otro): 1

Reporte de Ventas
Cliente julian, tipo 1, compra computadora con precio $270,00
Cliente pablo, tipo 2, compra computadora con precio $160,00
Cliente pedro, tipo 1, compra computadora con precio $90,00
Cliente daniel, tipo 1, compra computadora con precio $360,00
Cliente richard, tipo 2, compra computadora con precio $0,00
Cliente dani, tipo 2, compra computadora con precio $160,00
Cliente jair, tipo 1, compra computadora con precio $90,00

Total de ventas: $1130,00
BUILD SUCCESSFUL (total time: 2 minutes 12 seconds)
 */
