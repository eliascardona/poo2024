/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / LITC UAA
**/

import java.util.Scanner;

class Matriz4x4Handler {
    private int[][] matriz;
    private final int SIZE = 4;
    private boolean matrizLlena = false;

    Scanner sc = new Scanner(System.in);

    public Matriz4x4Handler() {
        matriz = new int[SIZE][SIZE];
    }

    public void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Error al intentar limpiar la pantalla");
        }
    }

    // Metodo para llenar la matriz con valores proporcionados por el usuario
    public void llenarMatriz() {
        System.out.println("Ingrese los valores para la matriz 4x4:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        matrizLlena = true;
    }

    // Metodo para sumar los elementos de una fila especifica
    public void sumarFila(int fila) {
        if (!matrizLlena) {
            System.out.println("Debe llenar la matriz primero.");
            return;
        }
        if (fila < 0 || fila >= SIZE) {
            System.out.println("Fila invalida. Ingrese un numero entre 0 y " + (SIZE - 1));
            return;
        }
        int suma = 0;
        System.out.print("Elementos en la fila " + fila + ": ");
        for (int j = 0; j < SIZE; j++) {
            System.out.print(matriz[fila][j] + " ");
            suma += matriz[fila][j];
        }
        System.out.println("\n** Suma de la fila " + fila + ": " + suma + " **\n");
    }

    // Metodo para sumar los elementos de una columna especifica
    public void sumarColumna(int columna) {
        if (!matrizLlena) {
            System.out.println("Debe llenar la matriz primero.");
            return;
        }
        if (columna < 0 || columna >= SIZE) {
            System.out.println("Columna invalida. Ingrese un numero entre 0 y " + (SIZE - 1));
            return;
        }
        int suma = 0;
        System.out.print("Elementos en la columna " + columna + ": ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(matriz[i][columna] + " ");
            suma += matriz[i][columna];
        }
        System.out.println("\n** Suma de la columna " + columna + ": " + suma + " **\n");
    }

    // Metodo para sumar los elementos de la diagonal principal
    public void sumarDiagonalPrincipal() {
        if (!matrizLlena) {
            System.out.println("Debe llenar la matriz primero.");
            return;
        }
        int suma = 0;
        System.out.print("Elementos en la diagonal principal: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(matriz[i][i] + " ");
            suma += matriz[i][i];
        }
        System.out.println("\n** Suma de la diagonal principal: " + suma + " **\n");
    }

    // Metodo para sumar los elementos de la diagonal inversa
    public void sumarDiagonalInversa() {
        if (!matrizLlena) {
            System.out.println("Debe llenar la matriz primero.");
            return;
        }
        int suma = 0;
        System.out.print("Elementos en la diagonal inversa: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(matriz[i][SIZE - 1 - i] + " ");
            suma += matriz[i][SIZE - 1 - i];
        }
        System.out.println("\n** Suma de la diagonal inversa: " + suma + " **\n");
    }
}

public class SumaDeDiagonales {
    public static void main(String[] args) {
        Matriz4x4Handler matrizHandler = new Matriz4x4Handler();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            matrizHandler.limpiarPantalla();  // Se limpia solo antes de mostrar el menu
            imprimirMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    matrizHandler.llenarMatriz();
                    break;
                case 2:
                    System.out.print("Ingrese el numero de fila para sumar: ");
                    int fila = sc.nextInt();
                    matrizHandler.sumarFila(fila);
                    break;
                case 3:
                    System.out.print("Ingrese el numero de columna para sumar: ");
                    int columna = sc.nextInt();
                    matrizHandler.sumarColumna(columna);
                    break;
                case 4:
                    matrizHandler.sumarDiagonalPrincipal();
                    break;
                case 5:
                    matrizHandler.sumarDiagonalInversa();
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
            System.out.println("\nPresione Enter para continuar...");
            sc.nextLine();  // Captura la entrada extra después de ingresar una opción
            sc.nextLine();  // Espera a que el usuario presione Enter antes de limpiar y mostrar el menú de nuevo

        } while (opcion != 6);
    }

    private static void imprimirMenu() {
        System.out.println("\nMenu de opciones:");
        System.out.println("1. Llenar matriz con valores");
        System.out.println("2. Sumar una fila especifica");
        System.out.println("3. Sumar una columna especifica");
        System.out.println("4. Sumar la diagonal principal");
        System.out.println("5. Sumar la diagonal inversa");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
    }
}



