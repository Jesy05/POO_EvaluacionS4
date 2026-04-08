public class Estudiante {
    private String codigo;
    private String nombre;
    private float promedio;
    private Carrera carrera; // Relación con la clase Carrera

    // Constructor
    public Estudiante(String codigo, String nombre, float promedio, Carrera carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.carrera = carrera;
    }

    // Método solicitado en el UML
    public boolean aprobar() {
        return this.promedio >= 70;
    }

    // Método para imprimir la información del estudiante
    @Override
    public String toString() {
        String estado = aprobar() ? "Aprobado" : "Reprobado";
        return "Código: " + codigo +
                " | Nombre: " + nombre +
                " | Carrera: " + carrera.getNombre() +
                " | Promedio: " + promedio +
                " | Estado: " + estado;
    }
}
