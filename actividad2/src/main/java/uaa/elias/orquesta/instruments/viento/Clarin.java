package uaa.elias.orquesta.instruments.viento;

import uaa.elias.orquesta.base.Instrumento;
import uaa.elias.orquesta.interfaces.IViento;


public class Clarin extends Instrumento implements IViento {
    public Clarin(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void tocar() {
        System.out.println("escucha, esto suena como una guitarra");
    }
}