package uaa.elias.orquesta.instruments;

import uaa.elias.orquesta.base.Instrumento;
import uaa.elias.orquesta.interfaces.ICuerda;


public class Guitarra extends Instrumento implements ICuerda {
    public Guitarra(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void tocar() {
        System.out.println("escucha, esto suena como una guitarra");
    }
}