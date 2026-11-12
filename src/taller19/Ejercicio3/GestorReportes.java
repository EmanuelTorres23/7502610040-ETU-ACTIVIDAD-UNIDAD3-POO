package taller19.Ejercicio3;

public class GestorReportes {
    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void crearReporte(String datos) {
        generador.generarReporte(datos);
    }
}