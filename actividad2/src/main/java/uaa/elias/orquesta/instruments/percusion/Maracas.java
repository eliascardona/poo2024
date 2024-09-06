package uaa.elias.orquesta.instruments.percusion;

import uaa.elias.orquesta.base.Instrumento;
import uaa.elias.orquesta.interfaces.IPercusion;


public class Maracas extends Instrumento implements IPercusion {
    public Maracas(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void tocar() {
        System.out.println("escucha, esto suena como una guitarra");
    }
}
