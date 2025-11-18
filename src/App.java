import modelo.BaseDeDatos;
import vista.DirectorioVista;
import controlador.ControladorDirectorio;

public class App {
    public static void main(String[] args) {
        BaseDeDatos modelo = new BaseDeDatos();
        DirectorioVista vista = new DirectorioVista();
        ControladorDirectorio controlador = new ControladorDirectorio(modelo, vista);

        controlador.iniciar();
    }
}
