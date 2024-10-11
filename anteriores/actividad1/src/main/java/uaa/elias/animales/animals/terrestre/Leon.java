package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Mamifero;
import uaa.elias.animales.interfaces.Terrestre;

public class Leon extends Animal implements Mamifero, Terrestre {
    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void amamantar() {
        System.out.println("los pequenos leones toman leche de su madre");
    }
    @Override
    public void caminar() {
        System.out.println("caminando");
    }
}

