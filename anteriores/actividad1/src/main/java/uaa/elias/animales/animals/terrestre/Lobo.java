package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Mamifero;
import uaa.elias.animales.interfaces.Terrestre;

public class Lobo extends Animal implements Mamifero, Terrestre {
    public Lobo(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void amamantar() {
        System.out.println("la manada de lobos bebe es alimentada por sus madres");
    }
    @Override
    public void caminar() {
        System.out.println("caminando");
    }
}

