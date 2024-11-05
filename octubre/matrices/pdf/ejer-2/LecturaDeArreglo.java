/**
 *	@author ELIAS EDUARDO CARDONA RODRIGUEZ / UAA LITC
**/


public class LecturaDeArreglo {
    public static void main(String[] args) {
        // Declaración e inicialización del arreglo bidimensional
        String[][] comidas = {
            {"Avena", "Cereal", "Huevo", "Yogur", "Fruta", "Pan tostado con aguacate", "Hotcakes"},
            {"Pollo", "Sándwich", "Verduras", "Atún", "Bistec", "Champiñones", "Espagueti"},
            {"Burritos de frijoles", "Quesadillas", "Estofado", "Picadillo", "Lasaña", "Ensalada con pollo", "Pizza"}
        };

        // Leyendo y mostrando todos los almuerzos de la semana
        System.out.println("Los almuerzos de toda la semana son:");
        for (int i = 0; i < comidas[1].length; i++) {
            System.out.println(comidas[1][i]); // Almuerzos están en el índice 1
        }

        // Leyendo y mostrando todas las comidas de la semana
        System.out.println("\nMostrando todas las comidas de la semana:");
        for (int col = 0; col < comidas[0].length; col++) {
            String dia = switch (col) {
                case 0 -> "Lunes";
                case 1 -> "Martes";
                case 2 -> "Miércoles";
                case 3 -> "Jueves";
                case 4 -> "Viernes";
                case 5 -> "Sábado";
                case 6 -> "Domingo";
                default -> "";
            };
            System.out.println("\nLas comidas del " + dia + " son:");
            for (int ren = 0; ren < comidas.length; ren++) {
                String tipo = switch (ren) {
                    case 0 -> " El desayuno: ";
                    case 1 -> " La comida: ";
                    case 2 -> " La cena: ";
                    default -> "";
                };
                System.out.println(tipo + comidas[ren][col]);
            }
        }
    }
}



