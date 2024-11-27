/***
 * Problema 4
Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:

Nombre el jugador
Posición en el campo de juego
Edad
Estatura
El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte (usar una cadena de acumulación):

Listado de Jugadores
1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
4. Ángel Mena -Delantero-, edad 32, estatura 1.75
5. Michael Estrada -Delantero-, edad 27, estatura 1.93
Promedio de edades:  26.8
Promedio de estaturas: 1.87
 */

import java.util.Scanner;

public class Problema4_ListadoJugadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder reporte = new StringBuilder("Listado de Jugadores\n");
        int contador = 0;
        int sumaEdades = 0;
        double sumaEstaturas = 0.0;
        boolean continuar = true;
        while (continuar) {
            contador++;
            System.out.print("Nombre del jugador: ");
            String nombre = scanner.nextLine();
            System.out.print("Posicion en el campo de juego: ");
            String posicion = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Estatura (en metros, ejemplo 1.85): ");
            double estatura = scanner.nextDouble();
            scanner.nextLine(); 
            reporte.append(String.format("%d. %s -%s-, edad %d, estatura %.2f%n",
                    contador, nombre, posicion, edad, estatura));
            sumaEdades += edad;
            sumaEstaturas += estatura;
            System.out.print("¿Desea ingresar otro jugador? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        double promedioEdades = (double) sumaEdades / contador;
        double promedioEstaturas = sumaEstaturas / contador;
        reporte.append(String.format("Promedio de edades: %.1f%n", promedioEdades));
        reporte.append(String.format("Promedio de estaturas: %.2f%n", promedioEstaturas));
        System.out.println("\n" + reporte);

        scanner.close();
    }
}
