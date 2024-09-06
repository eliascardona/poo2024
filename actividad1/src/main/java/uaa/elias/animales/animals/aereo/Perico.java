package uaa.elias.animales.animals.aereo;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Aereo;

public class Perico extends Animal implements Aereo {
    public Perico(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void volar() {
        System.out.println("soy un ave que vuela");
    }
}
