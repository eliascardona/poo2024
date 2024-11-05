import java.util.Scanner;
/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / UAA LITC
**/


public class ArregloManual {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Crear el array de 5 elementos
        int[] arregloNumerico = new int[5];

        // Pedir los valores al usuario
        for (int i = 0; i < arregloNumerico.length; i++) {
            System.out.print("Introduce el valor para el índice " + i + ": ");
            arregloNumerico[i] = entrada.nextInt();
        }

        // Mostrar los valores con sus índices
        System.out.println("\nContenido del array:");
        for (int i = 0; i < arregloNumerico.length; i++) {
            System.out.println("En el índice " + i + " está el valor " + arregloNumerico[i]);
        }
    }
}



