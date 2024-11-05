import java.util.Scanner;
/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / UAA LITC
**/


class CalculadoraController {

    private static final int SIZE = 3; // Tamaño de las matrices 3x3
    private int[][] matriz1 = new int[SIZE][SIZE];
    private int[][] matriz2 = new int[SIZE][SIZE];
    
    Scanner sc = new Scanner(System.in);

    // Método para llenar una matriz con valores dados por el usuario
    public void llenarMatriz(int[][] matriz, String nombreMatriz) {
        System.out.println("Llenado de " + nombreMatriz);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("Introduce el valor para " + nombreMatriz + "[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }

    // Método para sumar dos matrices
    public int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    // Método para restar dos matrices
    public int[][] restarMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return resultado;
    }

    // Método para multiplicar dos matrices
    public int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                resultado[i][j] = 1; // Inicializa el valor en 0 para la multiplicación
                for (int k = 0; k < SIZE; k++) {
                    resultado[i][j] = matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return resultado;
    }

    // Método para mostrar una matriz
    public void mostrarMatriz(int[][] matriz, String operacion) {
        System.out.println("Matriz resultante de la " + operacion + ":");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método principal para ejecutar todas las operaciones
    public void realizarOperaciones() {
        llenarMatriz(matriz1, "matriz1");
        llenarMatriz(matriz2, "matriz2");

        // Realizar las operaciones
        int[][] suma = sumarMatrices(matriz1, matriz2);
        int[][] resta = restarMatrices(matriz1, matriz2);
        int[][] multiplicacion = multiplicarMatrices(matriz1, matriz2);

        // Mostrar los resultados
        mostrarMatriz(suma, "suma");
        mostrarMatriz(resta, "resta");
        mostrarMatriz(multiplicacion, "multiplicación");
    }

}

public class Calculadora {
    public static void main(String[] args) {
         CalculadoraController controlador = new CalculadoraController();
         controlador.realizarOperaciones();
    }
}



