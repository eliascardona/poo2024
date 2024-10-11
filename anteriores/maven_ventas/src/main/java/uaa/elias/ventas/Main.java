package uaa.elias.ventas;

import java.util.Scanner;
import uaa.elias.ventas.controllers.arrayController.ArregloDeVentas;


public class Main {
    public static void main(String args[]) {
        System.out.print("\n\t ****REGISTRADOR DE VENTAS EN JAVA****\n\n");
		Scanner scanner = new Scanner(System.in);
        ArregloDeVentas reporteDeVentas = new ArregloDeVentas(30);


        reporteDeVentas.llenarArregloDeVentas();
		System.out.println("llenando el arreglo... PRESIONE UNA TECLA PARA CONTINUAR");
		scanner.nextLine();


        reporteDeVentas.mostrarArregloDeVentas();
    }
}
