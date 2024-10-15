import java.util.Scanner;
import java.util.Arrays;

/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / UAA LITC
 *	@description
 *	 SISTEMA DE MONITOREO Y RESERVACION DE LUGARES PARA VIAJES EN CAMION
 *	
 * */
class MessagePrinter {
	private String [][] referencias = {
		{"\t", "m = mañana "},
		{"\t", "M = mediodía "},
		{"\t", "n = noche "}
	};
	public void pintarRefer() {
		System.out.print("\n");
		for (int i=0; i < 3; i++) {
			for (int j=0; j < 3; j++) {

				String tab = referencias[0][0];
				if (j == 0) {
					System.out.print(tab);
				}
				else if (j == 1) {
					System.out.print(referencias[i][j] + "\n");
				}
			}
		}	// fin del primer for()
		System.out.print("\n");
	}

	public void pintarDestino(int destino) {
		switch(destino) {
			case 0: {
				System.out.print("");
				break;
			}
			case 1: {
				System.out.print(".");
				break;
			}
			case 2: {
				System.out.print(".");
				break;
			}
			case 3: {
				System.out.print(".");
				break;
			}
			case 4: {
				System.out.print(".");
				break;
			}
			case 5: {
				System.out.print(".");
				break;
			}
			default:
				System.out.print("_");
			break;
		}
	}	// fin del metodo pintarDestino()

	public void pintarMomento(int momento) {
		switch(momento) {
			case 0: {
				System.out.print("_0_");
				break;
			}
			case 1: {
				System.out.print("_1_");
				break;
			}
			case 2: {
				System.out.print("_2_");
				break;
			}
			default:
				System.out.print("_");
			break;
		}
	}	// fin del metodo pintarDia()


	public void pintarFilas() {
		System.out.print("\n");
		System.out.println("Leon");
		System.out.println("Queretaro");
		System.out.println("CDMX");
		System.out.println("Guadalajara");
		System.out.println("Tepic");
		System.out.println("Puerto Vallarta");
	}
	public void pintarColumnas() {
		System.out.print("\t\t");
		System.out.print("\t");
		System.out.print("mañana\t");
		System.out.print("mediodía\t");
		System.out.print("noche");
	}


}


class ApplicationController {
    int[][] matriz = new int[3][6];
	Scanner sc1 = new Scanner(System.in);
	MessagePrinter mensajeria1 = new MessagePrinter();

    public void llenarMatriz() {

		mensajeria1.pintarColumnas();
		mensajeria1.pintarFilas();

        for (int i = 0; i < 2; i++) {

			mensajeria1.pintarDestino(i);
            for (int j = 0; j < 5; j++) {

				mensajeria1.pintarMomento(j);
                int val = sc1.nextInt();
                this.matriz[i][j] = val;
            }

        }	// fin del for() exterior


        System.out.println("Matriz llenada con éxito");
    }	// fin del metodo llenarMatriz()

    public void mostrarMatriz() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("\t[" + i + "][" + j + "] " + matriz[i][j]);
            }
			System.out.println();
        }	// fin del primer for()
    }

}	// fin de la clase ApplicationController()


class Menu {
	MessagePrinter mensajeria = new MessagePrinter();
	ApplicationController controladorDeViajes = new ApplicationController();

	public boolean auxiliarMenu(int[] arreglo, int valor) {
		for (int i=0; i < arreglo.length; i++) {	
			if (arreglo[i] == valor) {
				return false;
			}
		}
		return true;
	}

	public void menuLogico(int[] opsDisponiblesVV, int opv, boolean bandera) {
		switch(opv) {
			case 1: {
				boolean banderav = auxiliarMenu(opsDisponiblesVV, opv);
				mensajeria.pintarRefer();
				controladorDeViajes.llenarMatriz();
				bandera = banderav;
				break;
			}
			case 2: {
				boolean banderav = auxiliarMenu(opsDisponiblesVV, opv);
				controladorDeViajes.mostrarMatriz();
				bandera = banderav;
				break;
			}
			default: {
				System.out.println("Opcion no valida. Introduzca una del menu.");
			}
		}
	}	// fin de menuLogico()
}


public class Camiones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Camiones camiones = new Camiones();
        Menu menu = new Menu();

		int [] opsDisponibles = {1, 2};
        int op = 0;
        boolean bandera = false;

		System.out.println("****** PRIMERA DE PLUS  -  ADMON DE VIAJES ******\n");
        do {
			System.out.print("1. llenar \n");
			System.out.print("2. mostrar \n");
			System.out.print("3. salir \n");
			System.out.print("Ingresa una opción: ");
			op = sc.nextInt();

			menu.menuLogico(opsDisponibles, op, bandera);


		} while(op != 3 || bandera == true);
    }	// fin de main()

}

