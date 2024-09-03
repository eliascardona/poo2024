package uaa.elias.animales.animals.anfibio;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Anfibio;

public class Rana extends Animal implements Anfibio {
    public Rana(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void caminar() {
        System.out.println("La rana está caminando.");
    }

    @Override
    public void nadar() {
        System.out.println("La rana está nadando.");
    }
}



