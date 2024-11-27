/***
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos 
 * ingresar el nombre del estudiante, el promedio de ciclo. Presentar el siguiente reporte		
 * Estudiante1	10	Aprobado
 * Estudiante2	6.9	Reprobado
 * Estudiante3	7	Aprobado
 * Estudiante4	5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 */
import java.util.Scanner;
public class Problema5_PromedioEstudiantes {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, estado;
        double promedio;
        int contador = 1;
        while (contador <= 4){
            System.out.print("DAME EL NOMBRES Y PROMEDIO DEL EST_" + contador + ": ");
            nombre = tcl.next();
            promedio = tcl.nextDouble();
            if (promedio < 7)
                estado = "reprobado";
            else
                estado = "Aprobado";
            System.out.printf("| %s\t| %s | %s\t|\n","NOMBERE", "PROMEDIO", "ESTADO");
            System.out.printf("| %s\t| %.2f\t   | %s\t|", nombre, promedio, estado);
            contador++;
            
        }
    }
}
