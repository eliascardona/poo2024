package uaa.elias.animales.animals.anfibio;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Anfibio;

public class Pato extends Animal implements Anfibio {
    public Pato(String nombre, int edad) {
        super(nombre, edad);
    }
    @override
    public void nadar() {
        System.out.println("estoy nadando");
    }
    @Override
    public void caminar() {
        System.out.println("caminando.");
    }
}
