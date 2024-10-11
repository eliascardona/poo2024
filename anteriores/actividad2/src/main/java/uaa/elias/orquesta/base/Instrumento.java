package uaa.elias.orquesta.base;

public class Instrumento {
    private String nombre;
    private int antiguedad;

    public Instrumento(String nombre, int antiguedad) {
        this.nombre = nombre;
        this.antiguedad= antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad= antiguedad;
    }
}
