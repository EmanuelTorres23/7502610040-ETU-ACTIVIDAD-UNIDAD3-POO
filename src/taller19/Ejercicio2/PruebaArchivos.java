package taller19.Ejercicio2;

public class PruebaArchivos {
    public static void main(String[] args) {
        GestorArchivos gestorLocal = new GestorArchivos(new AlmacenamientoLocal());
        gestorLocal.guardarArchivo("notas.txt", "Parcial 1: 4.5");
        gestorLocal.leerArchivo("notas.txt");

        GestorArchivos gestorNube = new GestorArchivos(new AlmacenamientoNube());
        gestorNube.guardarArchivo("informe.txt", "Informe mensual");
        gestorNube.leerArchivo("informe.txt");
    }
}