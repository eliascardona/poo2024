package uaa.elias.animales.animals.acuatico;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Acuatico;

public class Foca extends Animal implements Acuatico {

    public Foca(String nombre, int edad) {
        super(nombre, edad);
    }
    @override
    public void nadar() {
        System.out.println("soy una foca, me gusta el agua");
    }
}

