package Model;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> inventario = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Registrar Producto ===");
            System.out.print("Ingrese el código: ");
            String codigo = sc.nextLine();

            System.out.print("Ingrese el nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el precio: ");
            float precio = sc.nextFloat();

            System.out.print("Ingrese la cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            // Crear producto y agregar al inventario
            Producto p = new Producto(codigo, nombre, precio, cantidad);
            inventario.add(p);

            System.out.println("\nProducto agregado:");
            System.out.println(p.mostrarProducto());

            // Preguntar si desea continuar
            System.out.print("\n¿Desea ingresar otro producto? (s/n): ");
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            } else if (respuesta.equalsIgnoreCase("s")) {
                continuar = true;
            } else {
                System.out.println("Respuesta no válida. Se finalizará el registro.");
                continuar = false;
            }
        }

        // Mostrar todos los productos registrados
        System.out.println("\n=== Inventario Final ===");
        for (Producto prod : inventario) {
            System.out.println(prod);
        }

        sc.close();
    }
}