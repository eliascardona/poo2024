package uaa.elias.animales.animals.acuatico;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Reptil;
import uaa.elias.animales.interfaces.Acuatico;

public class Cocodrilo extends Animal implements Acuatico, Reptil {
    public Cocodrilo(String nombre, int edad) {
        super(nombre, edad);
    }
    @override
    public void nadar() {
        System.out.println("soy un cocodrilo y la mayor parte de mi vida en el agua");
    }
    @override
    public void reptar() {
        System.out.println("soy un cocodrilo y cuando estoy en la tierra, me arrastro");
    }
}

