/*
 * @author Elias Eduardo Cardona Rodriguez
/*
	Descripción u objetivo del ejercicio:
	Toda variable que instancie una clase String
	en Java tiene distintos métodos que permiten acceder
	a las propiedades básicas de las cadenas de texto
	En este ejercicio, accederemos a métodos nativos de las cadenas de texto en Java, tales como:
*/
public class Main {
	public static void main(String[] args) {
		String texto = "hola mundo";
		System.out.print("\\ ---------------------------------------- \\" + "\n");
		System.out.print("    Cadena original:   " + texto + "\n");
		System.out.print("\\ ---------------------------------------- \\" + "\n\n");


		/*  métodos que retornan un tipo de dato entero  */
		int longitud = texto.length();
		System.out.println("La longitud del texto es: " + longitud);

		int indice = texto.indexOf("mundo");
		System.out.println("El indice de 'mundo' es: " + indice);


		/*  métodos que retornan una cadena o subcadena de tipo string  */
		String subTexto = texto.substring(0, 4);
		System.out.println("El substring es: " + subTexto);

		String textoMayusculas = texto.toUpperCase();
		System.out.println("El texto en mayusculas es: " + textoMayusculas);

		String textoMinusculas = texto.toLowerCase();
		System.out.println("El texto en minusculas es: " + textoMinusculas + "\n");
	}
}
