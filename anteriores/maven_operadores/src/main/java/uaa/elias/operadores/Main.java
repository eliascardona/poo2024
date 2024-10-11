package uaa.elias.operadores;

import uaa.elias.operadores.operador.aritmetico.OpAritmetico;

public class Main {
    public static void main(String args[]) {
        System.out.print("\nejecutado programa...\n\n");

        // operadores aritmeticos
        OpAritmetico opAritmetico = new OpAritmetico(2, 2);

        int suma = opAritmetico.opSuma();
        System.out.print("el operador aritmetico puede sumar" + suma + "\n\n");



    }
}
