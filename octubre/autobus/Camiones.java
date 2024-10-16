import java.util.Scanner;
/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / UAA LITC
 *	@description
 *	 SISTEMA DE MONITOREO Y RESERVACION DE LUGARES PARA VIAJES EN CAMION
 *	
 * */

class Entradas {
    Scanner sc1 = new Scanner(System.in);

    public int entradasParaDestino() {
        int val = sc1.nextInt();
        return val;
    }

    public String entradaParaFinalizar() {
        return sc1.next();
    }
}

class ApplicationController {
    int[][] matriz = new int[6][3];  // La matriz es de 6 filas y 3 columnas (destinos x momentos)
    Entradas entradas = new Entradas();

    public void llenarMatriz() {
        System.out.print("\t\t");  // Salto de línea tras cada fila (destino)
        System.out.println("\t\tmañana\t\tmediodía\tnoche");  // Cabecera de los momentos del día

        for (int i = 0; i < 6; i++) {
            System.out.print(obtenerNombreDestino(i) + "\t");  // Imprimir el destino
            for (int j = 0; j < 3; j++) {  // Recorremos los momentos del día (mañana, mediodía, noche)
                System.out.print("[" + i + "][" + j + "]: ");
                matriz[i][j] = entradas.entradasParaDestino();  // Llenamos la matriz con los valores
            }
            System.out.println();  // Salto de línea tras cada fila (destino)
        }
        System.out.println("Matriz llenada con éxito");
    }

    // Método mejorado para obtener el nombre del destino
    public String obtenerNombreDestino(int destino) {
        switch(destino) {
            case 0: return "Leon               ";
            case 1: return "Queretaro          ";
            case 2: return "CDMX               ";
            case 3: return "Guadalajara        ";
            case 4: return "Tepic              ";
            case 5: return "Puerto Vallarta    ";
            default: return "NO ESPERADO";
        }
    }

    public void mostrarMatriz() {
        System.out.print("\t\t");  // Salto de línea tras cada fila (destino)
        System.out.println("\t\tmañana\t\tmediodía\tnoche");

        for (int i = 0; i < 6; i++) {
            System.out.print(obtenerNombreDestino(i) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    // Nueva funcionalidad: Comprar boletos
    public void comprarBoletos(int destino, int horario, int boletos) {
        // Validar si hay suficientes boletos disponibles
        if (matriz[destino][horario] >= boletos) {
            matriz[destino][horario] -= boletos;  // Descontar los boletos disponibles
            System.out.println("Compra exitosa. Boletos adquiridos: " + boletos);
        } else {
            System.out.println("Disculpe, no se pudo completar su operación. No hay suficientes asientos disponibles.");
        }
    }
    
    // Nueva funcionalidad: Mostrar asientos disponibles al terminar las ventas
    public void mostrarAsientosDisponibles() {
        System.out.println("**** asientos disponibles *****");
        mostrarMatriz();
    }
}

class Menu {
    ApplicationController controladorDeViajes = new ApplicationController();

    public void menuLogico(int opcion, Bandera bandera) {
        switch(opcion) {
            case 1:
                controladorDeViajes.llenarMatriz();
                bandera.setValor(true); // Cambiamos el valor de la bandera
                break;
            case 2:
                controladorDeViajes.mostrarMatriz();
                bandera.setValor(true); // Cambiamos el valor de la bandera
                break;
            case 3:
                bandera.setValor(false); // Finalizamos el ciclo en main
                break;
            case 4: 
                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.print("Ingrese el destino (0-5) o 'terminar' para finalizar las ventas: ");
                    String entrada = sc.next();
                    if (entrada.equalsIgnoreCase("terminar")) {
                        controladorDeViajes.mostrarAsientosDisponibles();  // Mostrar asientos disponibles al finalizar
                        bandera.setValor(false);
                        break;
                    }
                    int destino = Integer.parseInt(entrada);
                    System.out.print("Ingrese el horario (0: mañana, 1: mediodía, 2: noche): ");
                    int horario = sc.nextInt();
                    System.out.print("Ingrese la cantidad de boletos que desea comprar: ");
                    int boletos = sc.nextInt();
                    controladorDeViajes.comprarBoletos(destino, horario, boletos);
                }
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}

class Bandera {
    private boolean valor;

    public Bandera(boolean valorInicial) {
        this.valor = valorInicial;
    }

    public boolean getValor() {
        return valor;
    }

    public void setValor(boolean nuevoValor) {
        this.valor = nuevoValor;
    }
}

public class Camiones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Bandera bandera = new Bandera(true); // Iniciamos la bandera como true
        
        System.out.println("****** PRIMERA DE PLUS  -  ADMON DE VIAJES ******\n");
        
        while(bandera.getValor()) {
            System.out.print("1. Llenar Matriz\n");
            System.out.print("2. Mostrar Matriz\n");
            System.out.print("3. Salir\n");
            System.out.print("4. Comprar Boletos\n");  // Opción agregada
            System.out.print("Ingresa una opción: ");
            int op = sc.nextInt();
            
            menu.menuLogico(op, bandera);
        }

        System.out.println("Programa terminado.");
    }
}



