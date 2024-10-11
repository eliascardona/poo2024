package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Mamifero;
import uaa.elias.animales.interfaces.Terrestre;

public class Elefante extends Animal implements Mamifero, Terrestre {
    public Elefante(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void amamantar() {
        System.out.println("amamantando a mis crias");
    }
    @Override
    public void caminar() {
        System.out.println("caminando");
    }

}

