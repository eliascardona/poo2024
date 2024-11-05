import java.util.Arrays;
import java.util.Scanner;
/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / UAA LITC
**/


public class OrdenandoArreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Crear un arreglo de números
        int[] numeros = new int[5];

        // Pedir valores al usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Mostrar el arreglo original
        System.out.println("\nArreglo original: " + Arrays.toString(numeros));

        // Ordenar el arreglo
        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

        // Búsqueda Secuencial
        System.out.print("Introduce un número a buscar (búsqueda secuencial): ");
        int numeroABuscar = entrada.nextInt();
        int posicion = busquedaSecuencial(numeros, numeroABuscar);

        if (posicion != -1) {
            System.out.println("Número encontrado en la posición: " + posicion);
        } else {
            System.out.println("Número no encontrado.");
        }

        // Búsqueda Binaria
        posicion = Arrays.binarySearch(numeros, numeroABuscar);
        if (posicion >= 0) {
            System.out.println("Número encontrado en la posición (búsqueda binaria): " + posicion);
        } else {
            System.out.println("Número no encontrado (búsqueda binaria).");
        }
    }

    // Método de búsqueda secuencial
    public static int busquedaSecuencial(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return i;  // Retornar la posición si se encuentra
            }
        }
        return -1;  // Retornar -1 si no se encuentra
    }
}



