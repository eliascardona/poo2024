package uaa.elias.animales.animals.anfibio;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Anfibio;

public class Ornitorrinco extends Animal implements Anfibio {
    public Ornitorrinco(String nombre, int edad) {
        super(nombre, edad);
    }
    @override
    public void nadar() {
        System.out.println("nadando");
    }
    @override
    public void caminar() {
        System.out.println("caminando");
    }
}
