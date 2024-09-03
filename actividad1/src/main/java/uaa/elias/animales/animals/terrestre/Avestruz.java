package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Mamifero;
import uaa.elias.animales.interfaces.Terrestre;

public class Avestruz extends Animal implements Mamifero, Terrestre {
    public Avestruz(String nombre, int edad) {
        super(nombre, edad);
    }

    @override
    public void amamantar() {
        System.out.println("este animal esta amamantando a sus crias");
    }
    @override
    public void caminar() {
        System.out.println("caminando");
    }
}
