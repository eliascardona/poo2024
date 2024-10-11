import java.util.Scanner;

class CamionesAux {
    int[][] matriz = new int[6][3];  // Declaración correcta de la matriz

    public void llenarMatriz() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                this.matriz[i][j] = j;
            }
        }
        System.out.println("Matriz llenada con éxito");
    }

    public void mostrarMatriz() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("[" + i + "][" + j + "] " + matriz[i][j]);
            }
        }
    }
}

public class Camiones {
    CamionesAux claseDeApoyo = new CamionesAux();  // Inicialización de la clase de apoyo

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Camiones camiones = new Camiones();  // Crear una instancia de Camiones para usar claseDeApoyo

        System.out.println("Programa de reserva de lugares en autobús\n");

        int op = 0;
        System.out.print("1. llenar \n");
        System.out.print("2. mostrar \n");
        System.out.print("Ingresa una opción: ");
        op = sc.nextInt();  // Captura de la opción del usuario

        while(true) {
            switch (op) {
                case 1:
                    camiones.claseDeApoyo.llenarMatriz();  // Llamada correcta
                    break;
                case 2:
                    camiones.claseDeApoyo.mostrarMatriz();  // Llamada correcta
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }   // fin del ciclo while

}
