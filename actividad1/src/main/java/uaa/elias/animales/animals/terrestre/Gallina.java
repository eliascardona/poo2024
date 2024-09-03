package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Mamifero;
import uaa.elias.animales.interfaces.Terrestre;

public class Gallina extends Animal implements Mamifero, Terrestre {
    public Gallina(String nombre, int edad) {
        super(nombre, edad);
    }

    @override
    public void amamantar() {
        System.out.println("la gallina tambien amamanta a sus crias, siendo que es oviparo");
    }
    @override
    public void caminar() {
        System.out.println("caminando");
    }
}


