package taller18.Ejercicio3;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Conducible bicicleta = new Bicicleta();
        bicicleta.conducir();

        Camion camion = new Camion();
        camion.conducir();
        camion.cargarMercancias("Cemento");
    }
}