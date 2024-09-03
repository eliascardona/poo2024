package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Reptil;

public class Serpiente extends Animal implements Reptil {
    public Serpiente(String nombre, int edad) {
        super(nombre, edad);
    }
    @override
    public void reptar() {
        System.out.println("esta serpiente se desliza por la tierra durante km");
    }


}

