package uaa.elias.animales.animals.acuatico;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Acuatico;

public class SerpienteMarina extends Animal implements Acuatico {
    public SerpienteMarina(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void nadar() {
        System.out.println("soy una serpiente que vive en el agua");
    }
}

