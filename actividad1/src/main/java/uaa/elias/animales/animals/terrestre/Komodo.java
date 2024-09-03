package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Reptil;

public class Komodo extends Animal implements Reptil {
    public Komodo(String nombre, int edad) {
        super(nombre, edad);
    }
    @override
    public void reptar() {
        System.out.println("este komodo se desliza por la tierra durante km");
    }
}


