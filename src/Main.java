import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN DE ESTUDIANTES ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Pedir datos del estudiante
                    System.out.print("Ingrese el código del estudiante: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el promedio (ej. 85.5): ");
                    float promedio = scanner.nextFloat();
                    scanner.nextLine(); // Limpiar el buffer

                    // Pedir datos de la carrera
                    System.out.print("Ingrese el nombre de la carrera: ");
                    String nombreCarrera = scanner.nextLine();
                    System.out.print("Ingrese la duración de la carrera (en años): ");
                    int duracionCarrera = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    // Crear objetos y guardar en la lista
                    Carrera carrera = new Carrera(nombreCarrera, duracionCarrera);
                    Estudiante estudiante = new Estudiante(codigo, nombre, promedio, carrera);
                    listaEstudiantes.add(estudiante);

                    System.out.println("¡Estudiante registrado con éxito!");
                    break;

                case 2:
                    if (listaEstudiantes.isEmpty()) {
                        System.out.println("No hay estudiantes registrados aún.");
                    } else {
                        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
                        int aprobados = 0;
                        int reprobados = 0;

                        // Mostrar información de cada estudiante
                        for (Estudiante est : listaEstudiantes) {
                            System.out.println(est.toString());

                            // Contar aprobados y reprobados
                            if (est.aprobar()) {
                                aprobados++;
                            } else {
                                reprobados++;
                            }
                        }

                        // Mostrar totales
                        System.out.println("\n--- ESTADÍSTICAS ---");
                        System.out.println("Cantidad de aprobados: " + aprobados);
                        System.out.println("Cantidad de reprobados: " + reprobados);
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}