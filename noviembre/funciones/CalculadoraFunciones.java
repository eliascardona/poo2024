import java.util.Scanner;

/**
 *  @author    ELIAS EDUARDO CARDONA RODRIGUEZ
 *  @escuela   UAA  -  LIC INFORMATICA
 * */


public class CalculadoraFunciones {
	private static int op = 0;
	private static int getOpcion() {
		return op;
	}
	private static double suma(float a, float b) {
		return (double) a+b;
	}
	private static double resta(float a, float b) {
		return (double) a-b;
	}
	private static double multi(float a, float b) {
		return (double) a*b;
	}
	private static double divi(float a, float b) {
		return (double) a/b;
	}
	
	public static Float[] valores() {
		System.out.println("calculadora basica en java");
		System.out.print("\n  -- INGRESA DOS VALORES DECIMALES \n");
		Scanner scan = new Scanner(System.in);
		Float[] valores = new Float[2];
		System.out.print("numero uno: ");
		valores[0] = scan.nextFloat();
		System.out.print("numero dos: ");
		valores[1] = scan.nextFloat();
		System.out.println();
		return valores;
	}
	public static void pintarMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("  1.  suma");
		System.out.println("  2.  resta");
		System.out.println("  3.  multiplicacion");
		System.out.println("  4.  division");
		System.out.println("  10. salir");
		System.out.print("      Ingresa una opcion: ");
		op = sc.nextInt();
	}
	public static void menu() {
		do {
			Float[] valoresAUsar = valores();
			pintarMenu();
			int opcion = getOpcion();
			switch(opcion) {
				case 1: {
					double res = suma(valoresAUsar[0], valoresAUsar[1]);
					System.out.printf("\nla suma es %.2f\n", res);
					break;
				}
				case 2: {
					double res = resta(valoresAUsar[0], valoresAUsar[1]);
					System.out.printf("\nla resta es %.2f\n", res);
					break;
				}
				case 3: {
					double res = multi(valoresAUsar[0], valoresAUsar[1]);
					System.out.printf("\nla multiplicacion es %.2f\n", res);
					break;
				}
				case 4: {
					double res = divi(valoresAUsar[0], valoresAUsar[1]);
					System.out.printf("\nla resta es %.2f\n", res);
					break;
				}
				default: {
					System.out.println("\nsaliendo... ");
					break;
				}
			}
		} while(op != 10);
	}

	public static void main(String args[]) {
		menu();
	}


}
