import controlador.*;
import modelo.*;
import vista.*;

public class App {
    public static void main(String[] args) {
        BaseDeDatos baseDatos = new BaseDeDatos();
        InventarioVista vista = new InventarioVista();
        ControladorInventario controlador = new ControladorInventario(baseDatos, vista);
        controlador.iniciar();
    }
}