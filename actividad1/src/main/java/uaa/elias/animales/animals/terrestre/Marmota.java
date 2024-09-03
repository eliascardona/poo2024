package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Mamifero;
import uaa.elias.animales.interfaces.Terrestre;

public class Marmota extends Animal implements Mamifero, Terrestre {
    public Marmota(String nombre, int edad) {
        super(nombre, edad);
    }
    @override
    public void amamantar() {
        System.out.println("la pequenia marmota esta tomando leche de su madre");
    }
    @override
    public void caminar() {
        System.out.println("caminando");
    }
}

