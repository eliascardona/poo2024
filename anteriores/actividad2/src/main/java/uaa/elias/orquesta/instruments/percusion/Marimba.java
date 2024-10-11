package uaa.elias.orquesta.instruments.percusion;

import uaa.elias.orquesta.base.Instrumento;
import uaa.elias.orquesta.interfaces.IPercusion;


public class Marimba extends Instrumento implements IPercusion {
    public Marimba(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void tocar() {
        System.out.println("escucha, esto suena como una guitarra");
    }
}
