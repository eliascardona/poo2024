import java.util.Scanner;
/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / UAA LITC
**/


public class AlumnosController {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Arrays unidimensionales para los nombres, notas y calificaciones en texto
        String[] nombresAlumnos = new String[2];
        double[] notasAlumnos = new double[2];
        String[] calificacionesTexto = new String[2];

        // Entrada de nombres y notas
        for (int i = 0; i < 2; i++) {
            System.out.print("Introduce el nombre del alumno " + (i + 1) + ": ");
            nombresAlumnos[i] = entrada.nextLine();

            double nota;
            // Validación de la nota entre 0 y 10
            do {
                System.out.print("Introduce la nota de " + nombresAlumnos[i] + " (entre 0 y 10): ");
                nota = entrada.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Debe estar entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10);

            notasAlumnos[i] = nota;

            // Determinar la calificación en texto
            if (nota >= 0 && nota < 5) {
                calificacionesTexto[i] = "Suspenso";
            } else if (nota >= 5 && nota < 7) {
                calificacionesTexto[i] = "Bien";
            } else if (nota >= 7 && nota < 9) {
                calificacionesTexto[i] = "Notable";
            } else if (nota >= 9 && nota <= 10) {
                calificacionesTexto[i] = "Sobresaliente";
            }

            entrada.nextLine();  // Limpiar el buffer
        }

        // Mostrar los resultados
        System.out.println("\nResultados:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Nombre: " + nombresAlumnos[i]);
            System.out.println("Calificación: " + notasAlumnos[i]);
            System.out.println("Texto: " + calificacionesTexto[i]);
            System.out.println();
        }
    }
}



