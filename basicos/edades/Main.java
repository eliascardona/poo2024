import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        int anioNacimiento=0, anioActual=2024, edad=0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("\n ---");
        System.out.print(" Introduzca su anio de nacimiento: ");
        anioNacimiento = scanner.nextInt();
        edad = anioActual - anioNacimiento;

        System.out.println("\n Usted tiene " + edad + " anios\n");



    }
}

