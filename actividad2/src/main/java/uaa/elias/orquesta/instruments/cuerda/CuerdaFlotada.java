package uaa.elias.orquesta.instruments.cuerda;

import uaa.elias.orquesta.base.Instrumento;
import uaa.elias.orquesta.interfaces.ICuerda;


public class CuerdaFlotada extends Instrumento implements ICuerda {
    public CuerdaFlotada(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void tocar() {
        System.out.println("escucha, esto suena como una guitarra");
    }
}
