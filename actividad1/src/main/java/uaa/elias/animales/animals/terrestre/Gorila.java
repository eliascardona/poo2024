package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Mamifero;
import uaa.elias.animales.interfaces.Terrestre;

public class Gorila extends Animal implements Mamifero, Terrestre {
    public Gorila(String nombre, int edad) {
        super(nombre, edad);
    }

    @override
    public void amamantar() {
        System.out.println("los gorilas amamantan a sus crias, ademas se gestan en el utero de sus madres");
    }
    @override
    public void caminar() {
        System.out.println("caminando");
    }
}

