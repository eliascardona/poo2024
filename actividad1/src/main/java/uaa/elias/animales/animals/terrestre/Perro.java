package uaa.elias.animales.animals.terrestre;

import uaa.elias.animales.base.Animal;
import uaa.elias.animales.interfaces.Mamifero;
import uaa.elias.animales.interfaces.Terrestre;

public class Perro extends Animal implements Mamifero, Terrestre {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    @override
    public void amamantar() {
        System.out.println("las perras tienen glandulas mamarias muy notorias, pueden tener mas de una cria por embarazo");
    }
    @override
    public void caminar() {
        System.out.println("caminando");
    }
}

