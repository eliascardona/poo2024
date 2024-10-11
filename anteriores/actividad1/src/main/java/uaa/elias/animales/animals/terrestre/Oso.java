package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Mamifero;
import uaa.elias.animales.interfaces.Terrestre;

public class Oso extends Animal implements Mamifero, Terrestre {
    public Oso(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void amamantar() {
        System.out.println("la madre de los osesnos esta alimentando a sus crias");
    }
    @Override
    public void caminar() {
        System.out.println("caminando");
    }
}



