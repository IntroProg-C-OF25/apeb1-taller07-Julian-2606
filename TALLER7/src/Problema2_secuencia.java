/***
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 5/10
 * 10/12
 * 15/14
 * 20/16
 * 25/18
 * 30/20
 */

import java.util.Scanner;
public class Problema2_secuencia {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numerador = 5; 
        int denominador = 10; 
        int contador = 0; 
        int limite = 6;
        System.out.println("DAME EL LIMITE: ");
        limite = tcl.nextInt();

        while (contador < 6) {
            System.out.print(numerador + "/" + denominador + ",  ");
            numerador += 5; 
            denominador += 2; 
            contador++; 
        }
    }
}
/***
 * run:
 *DAME EL LIMITE: 
 *6
 *5/10,  10/12,  15/14,  20/16,  25/18,  30/20,  BUILD SUCCESSFUL (total time: 1 second)
*/