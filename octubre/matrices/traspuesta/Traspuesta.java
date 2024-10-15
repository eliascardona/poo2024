import java.util.Scanner;

class ApplicationController {
	Scanner sc1 = new Scanner(System.in);
	private int mat[][];

	public ApplicationController(int matvv[][]) {
		this.mat = matvv;
	}

	public void llenar(int FILAS, int COLS) {
		System.out.println("llenado de matriz \n");
		for (int i=0; i < FILAS; i++) {
			for (int j=0; j < COLS; j++) {
				System.out.print("(" + i + ")(" + j + "): ");
				int val = sc1.nextInt();
				mat[i][j] = val;
			}
		}	// fin del for() exterior
	}	// fin del metodo llenar()

	public void mostrar(int FILAS, int COLS) {
		System.out.println("matriz original\n");
		for (int i=0; i < FILAS; i++) {
			for (int j=0; j < COLS; j++) {
				System.out.print("\t" + mat[i][j]);
			}
			System.out.print("\n\n");
		}	// fin del for() exterior

	}

	public void trasp(int FILAS, int COLS) {
		for (int i=0; i < FILAS; i++) {
			for (int j=0; j < COLS; j++) {
				this.mat[i][j] = mat[j][i];
			}
		}	// fin del for() exterior

	}

	public void mostrarT(int FILAS, int COLS) {
		System.out.println("matriz traspuesta\n");
		for (int i=0; i < FILAS; i++) {
			for (int j=0; j < COLS; j++) {
				System.out.print("\t" + mat[i][j]);
			}
			System.out.print("\n\n");
		}	// fin del for() exterior

	}


}	// fin de la clase "ApplicationController"


class Menu {
	Scanner sc1 = new Scanner(System.in);
	int cont=0, ff, cc;
	private int [][] matriz;

	public void menuLogico() {
		do {
			if(cont == 0) {
				System.out.print("ingresa las filas: ");
				ff = sc1.nextInt();
				System.out.print("ingresa las columnas: ");
				cc = sc1.nextInt();
				this.matriz = new int[ff][cc];
				cont++;
			}
			ApplicationController controller = new ApplicationController(this.matriz);

			controller.llenar(ff, cc);
			controller.mostrar(ff, cc);
			controller.trasp(ff, cc);
			controller.mostrarT(ff, cc);

			if(ff != cc) {
				System.out.print("las columnas y filas deben ser iguales \n");
			}
			break;
		} while(true);
	}
}

class Traspuesta {
	public static void main(String [] args) {
		Menu menu = new Menu();
		System.out.println(" *****TRASPOSICION DE MATRICES*****");
		menu.menuLogico();
	}
}












