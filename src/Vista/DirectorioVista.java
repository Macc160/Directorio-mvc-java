package vista;

import java.util.List;
import java.util.Scanner;
import modelo.Empleado;

public class DirectorioVista {

    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== DIRECTORIO DE EMPLEADOS ===");
        System.out.println("1. Agregar empleado");
        System.out.println("2. Buscar empleado");
        System.out.println("3. Mostrar todos los empleados");
        System.out.println("4. Eliminar empleado");
        System.out.println("5. Salir");
        System.out.print("Seleccione: ");
        return scanner.nextInt();
    }

    public Empleado pedirDatos() {
        scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        return new Empleado(nombre, cedula, cargo, salario);
    }

    public String pedirCedula() {
        scanner.nextLine();
        System.out.print("Ingrese cédula: ");
        return scanner.nextLine();
    }

    public void mostrarEmpleado(Empleado e) {
        if (e == null) System.out.println("Empleado no encontrado.");
        else System.out.println(e);
    }

    public void mostrarEmpleados(List<Empleado> lista) {
        if (lista.isEmpty()) System.out.println("No hay empleados.");
        else lista.forEach(System.out::println);
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
