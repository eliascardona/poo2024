package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Mamifero;
import uaa.elias.animales.interfaces.Terrestre;

public class Elefante extends Animal implements Mamifero, Terrestre {
    public Elefante(string nombre, int edad) {
        super(nombre, edad);
    }

    @override
    public void amamantar() {
        System.out.println("amamantando a mis crias");
    }
    @override
    public void caminar() {
        System.out.println("caminando");
    }

}

