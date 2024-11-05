import java.util.Random;
/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / UAA LITC
**/


class MagicaAux {
    private int[][] matriz;
    private int tamano = 5;

    public MagicaAux() {
        matriz = new int[tamano][tamano];
    }

    // 1) Llenar la matriz con números aleatorios
    public void llenarMatriz() {
        Random rand = new Random();
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matriz[i][j] = rand.nextInt(100); // Números entre 0 y 99
            }
        }
    }

    // 2) Mostrar la matriz
    public void mostrarMatriz() {
        System.out.println("Matriz:");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 3) Calcular el promedio de la matriz
    public double calcularPromedio() {
        int suma = 0;
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                suma += matriz[i][j];
            }
        }
        return (double) suma / (tamano * tamano);
    }

    // 4) Encontrar el número mayor y cuántas veces se repite
    public void encontrarMayor() {
        int mayor = matriz[0][0];
        int repeticiones = 0;

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    repeticiones = 1;
                } else if (matriz[i][j] == mayor) {
                    repeticiones++;
                }
            }
        }

        System.out.println("Número mayor: " + mayor + ", Repetido: " + repeticiones + " veces");
    }

    // 5) Mostrar todos los números primos
    public void mostrarPrimos() {
        System.out.print("Números primos: ");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (esPrimo(matriz[i][j])) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    private boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // 6) Mostrar todos los números pares
    public void mostrarPares() {
        System.out.print("Números pares: ");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    // 7) Sumar las diagonales de la matriz
    public void sumarDiagonales() {
        int sumaPrincipal = 0;
        int sumaSecundaria = 0;

        for (int i = 0; i < tamano; i++) {
            sumaPrincipal += matriz[i][i]; // Diagonal principal
            sumaSecundaria += matriz[i][tamano - i - 1]; // Diagonal secundaria
        }

        System.out.println("Suma diagonal principal: " + sumaPrincipal);
        System.out.println("Suma diagonal secundaria: " + sumaSecundaria);
    }

    // 8) Sumar la última fila
    public void sumarUltimaFila() {
        int suma = 0;
        for (int j = 0; j < tamano; j++) {
            suma += matriz[tamano - 1][j];
        }
        System.out.println("Suma de la última fila: " + suma);
    }

    // 9) Verificar si la matriz es un cuadrado mágico
    public void verificarCuadradoMagico() {
        int sumaObjetivo = 0;
        for (int j = 0; j < tamano; j++) {
            sumaObjetivo += matriz[0][j];
        }

        // Verificar filas
        for (int i = 1; i < tamano; i++) {
            int sumaFila = 0;
            for (int j = 0; j < tamano; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaObjetivo) {
                System.out.println("La matriz no es un cuadrado mágico.");
                return;
            }
        }

        // Verificar columnas
        for (int j = 0; j < tamano; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < tamano; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaObjetivo) {
                System.out.println("La matriz no es un cuadrado mágico.");
                return;
            }
        }

        // Verificar diagonales
        int sumaDiagonalPrincipal = 0, sumaDiagonalSecundaria = 0;
        for (int i = 0; i < tamano; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
            sumaDiagonalSecundaria += matriz[i][tamano - i - 1];
        }

        if (sumaDiagonalPrincipal == sumaObjetivo && sumaDiagonalSecundaria == sumaObjetivo) {
            System.out.println("Esta matriz es un Cuadrado Mágico.");
        } else {
            System.out.println("La matriz no es un cuadrado mágico.");
        }
    }
}

public class Magica {
    public static void main(String[] args) {
        MagicaAux matriz = new MagicaAux();

        matriz.llenarMatriz();
        matriz.mostrarMatriz();

        System.out.println("Promedio de la matriz: " + matriz.calcularPromedio());

        matriz.encontrarMayor();
        matriz.mostrarPrimos();
        matriz.mostrarPares();
        matriz.sumarDiagonales();
        matriz.sumarUltimaFila();
        matriz.verificarCuadradoMagico();
    }
}



