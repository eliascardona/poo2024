package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Mamifero;
import uaa.elias.animales.interfaces.Terrestre;

public class Armadillo extends Animal implements Mamifero, Terrestre {
    public Armadillo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void amamantar() {
        System.out.println("el armadillo esta amamantando");
    }
    @Override
    public void caminar() {
        System.out.println("caminando");
    }
}

