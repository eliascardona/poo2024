package uaa.elias.animales.animals.aereo;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Aereo;

public class Paloma extends Animal implements Aereo {
    public Paloma(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void volar() {
        System.out.println("soy un ave que vuela");
    }
}
