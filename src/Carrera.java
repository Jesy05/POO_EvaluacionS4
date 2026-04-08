public class Carrera {
    private String nombre;
    private int duracion;

    // Constructor
    public Carrera(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return nombre + " (" + duracion + " años)";
    }
}

