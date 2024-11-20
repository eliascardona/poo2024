// Clase Persona
public class Persona {

    // 1.3.3.1 Concepto y Declaración de Atributos
    // Los atributos representan el estado o las propiedades de la clase
    private String nombre;   // Atributo privado (accesible solo dentro de la clase)
    private int edad;        // Atributo privado para almacenar la edad de la persona

    // Constructor de la clase
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // 1.3.3.2 Concepto y Declaración de Métodos
    // Los métodos definen el comportamiento de la clase

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para establecer un nuevo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Método para establecer una nueva edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para mostrar un saludo personalizado
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    // 1.3.3.3 Sintaxis
    // En Java, los métodos tienen una estructura específica:
    // 1. Modificador de acceso (public, private, etc.)
    // 2. Tipo de retorno (String, int, void, etc.)
    // 3. Nombre del método (getNombre, setNombre, saludar, etc.)
    // 4. Parámetros (si se requieren) entre paréntesis
    // 5. Cuerpo del método, encerrado en llaves { }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona1 = new Persona("Juan", 25);

        // Llamar a los métodos para mostrar la información
        persona1.saludar(); // Salida: Hola, mi nombre es Juan y tengo 25 años.

        // Cambiar el nombre y la edad usando los métodos set
        persona1.setNombre("Ana");
        persona1.setEdad(30);

        // Mostrar el saludo nuevamente con los datos actualizados
        persona1.saludar(); // Salida: Hola, mi nombre es Ana y tengo 30 años.
    }
}

