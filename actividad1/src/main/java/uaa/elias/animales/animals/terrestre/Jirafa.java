package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Mamifero;
import uaa.elias.animales.interfaces.Terrestre;

public class Jirafa extends Animal implements Mamifero, Terrestre {
    public Jirafa(String nombre, int edad) {
        super(nombre, edad);
    }
    @override
    public void amamantar() {
        System.out.println("la jirafa bebe litros de leche");
    }
}



