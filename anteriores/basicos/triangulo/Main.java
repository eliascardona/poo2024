import java.util.Scanner;


public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        float base, altura, aux, area;


        System.out.println("\n ---");
        System.out.println(" PROGRAMA PARA CALCULAR EL AREA DE UN TRIANGULO\n");
        System.out.print(" Asigne un valor a la base (b) del triangulo: ");
        base = scanner.nextFloat();
        System.out.print(" Ahora un valor para la altura (h): ");
        altura = scanner.nextFloat();

        // area del triangulo  =  (base*altura)/2;
        aux = base * altura;
        area = aux / 2;
            System.out.print("\n Un triangulo de " + base + "*" + altura + " ");
            System.out.println("tiene un area de " + area + "\n");




    }

}
