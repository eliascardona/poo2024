/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / LITC UAA
**/

import java.util.Scanner;

class CalificacionesAux {
    private int filas;
    private int columnas = 3; // Solo 3 asignaturas según el enunciado
    private float[][] califMat;
    private float[] promedios;

    Scanner sc = new Scanner(System.in);

    public CalificacionesAux(int filas) {
        this.filas = filas;
        this.califMat = new float[filas][columnas];
        this.promedios = new float[filas];
    }

    public void llenarMatriz() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[est" + (i + 1) + "][asig" + (j + 1) + "]: ");
                califMat[i][j] = sc.nextFloat();
            }
            System.out.println();
        }
    }

    public void calcularPromedios() {
        for (int i = 0; i < filas; i++) {
            float suma = 0;
            for (int j = 0; j < columnas; j++) {
                suma += califMat[i][j];
            }
            promedios[i] = suma / columnas;
        }
    }

    public void mostrarResultados() {
        mostrarMatriz();
        calcularPromedios();
        mostrarPromediosEstudiantes();
        estudianteMayorYMenorPromedio();
        estudianteMenorCalificacionAsignatura(1); // índice 1 para Asignatura 2
        estudianteMayorCalificacionAsignatura(2); // índice 2 para Asignatura 3
        promedioAsignatura(0); // índice 0 para Asignatura 1
    }

    private void mostrarMatriz() {
        System.out.print("\n----------------------------------------------\n\n");
        System.out.print("\tAsignatura 1\tAsignatura 2\tAsignatura 3\n");

        for (int i = 0; i < filas; i++) {
            System.out.print("Estudiante " + (i + 1) + "\t");
            for (int j = 0; j < columnas; j++) {
                System.out.print(califMat[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.print("\n----------------------------------------------\n\n");
    }

    private void mostrarPromediosEstudiantes() {
        System.out.println("Promedios de cada estudiante:");
        for (int i = 0; i < filas; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + promedios[i]);
        }
    }

    private void estudianteMayorYMenorPromedio() {
        int indiceMayor = 0;
        int indiceMenor = 0;

        for (int i = 1; i < filas; i++) {
            if (promedios[i] > promedios[indiceMayor]) {
                indiceMayor = i;
            }
            if (promedios[i] < promedios[indiceMenor]) {
                indiceMenor = i;
            }
        }
        System.out.println("Estudiante con mayor promedio: Estudiante " + (indiceMayor + 1));
        System.out.println("Estudiante con menor promedio: Estudiante " + (indiceMenor + 1));
    }

    private void estudianteMenorCalificacionAsignatura(int columna) {
        int indiceMenor = 0;
        for (int i = 1; i < filas; i++) {
            if (califMat[i][columna] < califMat[indiceMenor][columna]) {
                indiceMenor = i;
            }
        }
        System.out.println("Estudiante con menor calificación en Asignatura " + (columna + 1) + ": Estudiante " + (indiceMenor + 1));
    }

    private void estudianteMayorCalificacionAsignatura(int columna) {
        int indiceMayor = 0;
        for (int i = 1; i < filas; i++) {
            if (califMat[i][columna] > califMat[indiceMayor][columna]) {
                indiceMayor = i;
            }
        }
        System.out.println("Estudiante con mayor calificación en Asignatura " + (columna + 1) + ": Estudiante " + (indiceMayor + 1));
    }

    private void promedioAsignatura(int columna) {
        float suma = 0;
        for (int i = 0; i < filas; i++) {
            suma += califMat[i][columna];
        }
        float promedio = suma / filas;
        System.out.println("Promedio de calificaciones para Asignatura " + (columna + 1) + ": " + promedio);
    }
}

class Menu {
    private CalificacionesAux califs;
    private int filas;

    Scanner sc1 = new Scanner(System.in);

    public void iniciarMenu() {
        System.out.print("Ingrese el numero de estudiantes: ");
        filas = sc1.nextInt();
        califs = new CalificacionesAux(filas);

        int opcion;
        do {
            imprimirMenu();
            opcion = sc1.nextInt();
            switch (opcion) {
                case 1 -> califs.llenarMatriz();
                case 2 -> califs.mostrarResultados();
                case 10 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opcion no valida, intenta de nuevo.");
            }
        } while (opcion != 10);
    }

    private void imprimirMenu() {
        System.out.println("\n1. Llenar matriz de calificaciones");
        System.out.println("2. Mostrar resultados");
        System.out.println("10. Salir");
        System.out.print("Ingrese una opcion: ");
    }
}

public class Calificaciones {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.iniciarMenu();
    }
}


