package uaa.elias.orquesta;

import uaa.elias.orquesta.instruments.Guitarra;


public class Main {
    public static void main(String args[]) {
        System.out.print("\nejecutado programa...\n\n");

        Guitarra guitarra1 = new Guitarra("Guitarra de michoacan", 1);
        guitarra1.tocar();
    }
}



