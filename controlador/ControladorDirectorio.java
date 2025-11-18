package controlador;

import modelo.*;
import vista.*;

public class ControladorDirectorio {

    private BaseDeDatos modelo;
    private DirectorioVista vista;

    public ControladorDirectorio(BaseDeDatos modelo, DirectorioVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            int op = vista.mostrarMenu();

            switch (op) {
                case 1:
                    modelo.agregar(vista.pedirDatos());
                    vista.mostrarMensaje("Empleado agregado.");
                    break;

                case 2:
                    vista.mostrarEmpleado(modelo.buscar(vista.pedirCedula()));
                    break;

                case 3:
                    vista.mostrarEmpleados(modelo.buscarTodos());
                    break;

                case 4:
                    if (modelo.eliminar(vista.pedirCedula()))
                        vista.mostrarMensaje("Empleado eliminado.");
                    else
                        vista.mostrarMensaje("Empleado no encontrado.");
                    break;

                case 5:
                    salir = true;
                    break;

                default:
                    vista.mostrarMensaje("Opción inválida.");
            }
        }
    }
}
