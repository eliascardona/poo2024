
public class Main {
    public static void main(String args[]) {
        // declaración de variables
        int num1, num2, resultado;
        float resultado_decimal = 0;

        // inicialización (asignación de valores)
        num1 = 8;
        num2 = 2;
        resultado = 0;


        // inicio de operaciones
        resultado = num1 + num2;
            System.out.println("El resultado de la operacion suma es: " + resultado + "\n");

        resultado = num1 - num2;
            System.out.println("El resultado de la operacion resta es: " + resultado + "\n");

        resultado = num1 * num2;
            System.out.println("El resultado de la operacion multiplicacion es: " + resultado + "\n");

        resultado_decimal = (float) num1 / num2;
            System.out.println("El resultado de la operacion division es: " + resultado + "\n");



    }
}
