package uaa.elias.animales.animals.acuatico;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Acuatico;

public class Tiburon extends Animal implements Acuatico {
    public Tiburon(String nombre, int edad) {
        super(nombre, edad);
    }
    @override
    public void nadar() {
        System.out.println("soy un tiburon, por fuerza debo de nadar");
    }
}

