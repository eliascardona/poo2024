package uaa.elias.animales.animals.acuatico;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Acuatico;

public class Delfin extends Animal implements Acuatico {
    public Delfin(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void nadar() {
        System.out.println("soy un delfin y estoy nadando");
    }
}

