package taller18.Ejercicio3;

public class Camion implements Conducible, TransportadorMercancias {
    @Override
    public void conducir() {
        System.out.println("El camión está en marcha.");
    }

    @Override
    public void cargarMercancias(String mercancia) {
        System.out.println("El camión está cargando: " + mercancia);
    }
}