import java.util.Scanner;
import java.lang.Exception;
/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / UAA LITC
**/


class Generico<T> {
	private T valor;

	public Generico(T valor) {
		this.valor = valor;
	}

	public T readVal() {
		return valor;
	}
}



public class EstudiantesCalif {
	private static int op = 0;
	private static int getOpcion() {
		return op;
	}
	public static enum ComparingTo {TO_MINUS, TO_MAJOR};



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
		System.out.println("  1.   Ingresar alumnos");
		System.out.println("  2.   Revisar alumnos dados de alta");
		System.out.println(" 10.   Salir");
		System.out.print("       Ingrese una opcion: ");
		op = sc.nextInt();
	}
	public static void menu() {
		do {
			Float[] valoresAUsar = valores();
			pintarMenu();
			int opcion = getOpcion();
			menuAnt();
		} while(op != 10);
	}


    public static void validarCalificacion(double nota, String [] resultado, int i) {
        if(nota >= 0 && nota < 10) {
            if (nota >= 0 && nota < 5) resultado[i] = "Suspenso";

            switch (nota > 4) {
				case 5, 6: {
					resultado[i] = "Bien";
					break;
				}

				case 7, 8: {
					resultado[i] = "Notable";
					break;
				}

				case 9, 10: {
					resultado[i] = "Sobresaliente";
					break;
				}
				default:
					break;
            }
        }
        System.out.println("nota no valida");
    }



	public static boolean validarValorEntero(Generico nota, ComparingTo comparissionTo, int valorDeseado) {
		if(comparissonTo = ComparingTo.TO_MINUS) {
			if (nota < valorDeseado) {
				return true;
			}
			return false;
		} else if(comparissonTo = ComparingTo.TO_MAJOR) {
			if (nota > valorDeseado) {
				return true;
			}
			return false;
		}
		return false;
	}


	public static void menuAnt() {
        Scanner entrada = new Scanner(System.in);

        String[] nombresAlumnos = new String[2];
        double[] notasAlumnos = new double[2];
        String[] calificacionesTexto = new String[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            nombresAlumnos[i] = entrada.nextLine();

            double nota;
			Generico notaG;
            try {
                System.out.print("Nota para " + nombresAlumnos[i] + ": ");
                nota = entrada.nextDouble();
				notaG = new Generico(nota);
				
                if(validarValorEntero(notaG, ComparingTo.TO_MINUS, 0)) {
                    System.out.println("Nota no valida. Menor que cero");
					return;
                }
                if(validarValorEntero(notaG, ComparingTo.TO_MAJOR, 10)) {
                    System.out.println("Nota no valida. Mayor a diez");
					return;
                }
                notasAlumnos[i] = nota;

            } catch (Exception e) {
				System.out.println("excepcion por NOTA no valida " + e + "\n");
				return;
			}
			validarCalificacion(nota, calificacionesTexto, i);
            entrada.nextLine();
        }

        // Mostrar los resultados
        System.out.println("\nResultados:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Nombre: " + nombresAlumnos[i]);
            System.out.println("Calificacion: " + notasAlumnos[i]);
            System.out.println("Texto: " + calificacionesTexto[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
		menuAnt();
	}
}






    


