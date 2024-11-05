/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / UAA LITC
**/


public class BusquedaBasicaArreglo {
    public static void main(String[] args) {
        // Declaración e inicialización del arreglo bidimensional
        String[][] equipos = {
            {"La Liga", "FC Barcelona", "Real Madrid", "Atlético de Madrid", "Real Sociedad", "Valencia CF"},
            {"Liga Premier", "Arsenal", "Chelsea", "Liverpool", "Manchester City", "Manchester United"},
            {"Liga MX", "Pumas", "Tigres", "América", "Chivas", "Monterrey"}
        };

        String equipoBuscado = "FC Barcelona";
        String liga = "";

        // Búsqueda del equipo en el arreglo bidimensional
        for (int ren = 0; ren < equipos.length; ren++) {
            for (int col = 1; col < equipos[ren].length; col++) {
                if (equipos[ren][col].equals(equipoBuscado)) {
                    liga = equipos[ren][0];
                    break;
                }
            }
            if (!liga.isEmpty()) {
                break;
            }
        }

        // Resultado de la búsqueda
        if (liga.isEmpty()) {
            System.out.println("El equipo " + equipoBuscado + " no se encontró.");
        } else {
            System.out.println("El equipo " + equipoBuscado + " pertenece a " + liga + ".");
        }
    }
}



