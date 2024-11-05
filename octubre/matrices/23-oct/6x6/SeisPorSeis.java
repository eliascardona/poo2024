/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / LITC UAA
**/

class MatrizHandler {
    private int[][] matriz;
    private final int FILAS = 6;
    private final int COLUMNAS = 6;

    public MatrizHandler() {
        this.matriz = new int[FILAS][COLUMNAS];
    }

    // Método para llenar la matriz según los requisitos
    public void llenarMatriz() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (i % 2 == 0) { 
                    matriz[i][j] = 10; // Filas pares
                } else if (j % 2 == 1) { 
                    matriz[i][j] = 11; // Columnas impares
                } else {
                    matriz[i][j] = 0; // Resto de las celdas
                }
            }
        }
    }

    // Método para imprimir la matriz en consola
    public void mostrarMatriz() {
        System.out.println("Matriz 6x6:");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

public class SeisPorSeis {
    public static void main(String[] args) {
        MatrizHandler matrizHandler = new MatrizHandler();
        matrizHandler.llenarMatriz();
        matrizHandler.mostrarMatriz();
    }
}




