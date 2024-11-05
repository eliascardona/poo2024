/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / UAA LITC
**/


public class LlenadoDeMatrices {
    public static void main(String[] args) {
        // Declaración e inicialización del arreglo bidimensional
        String[][] nombres = new String[2][2];

        // Llenando el primer renglón
        nombres[0][0] = "Arturo";  // Primer nombre
        nombres[0][1] = "Parra";   // Primer apellido

        // Llenando el segundo renglón
        nombres[1][0] = "Enrique"; // Segundo nombre
        nombres[1][1] = "Sánchez"; // Segundo apellido

        // Mostrando el contenido del arreglo bidimensional
        System.out.println("Arreglo de nombres y apellidos:");
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + " ");
            }
            System.out.println();
        }
    }
}



