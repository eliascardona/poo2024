package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Mamifero;
import uaa.elias.animales.interfaces.Terrestre;

public class Jirafa extends Animal implements Terrestre {
    public Jirafa(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void caminar() {
        System.out.println("la jirafa bebe litros de leche");
    }
}



