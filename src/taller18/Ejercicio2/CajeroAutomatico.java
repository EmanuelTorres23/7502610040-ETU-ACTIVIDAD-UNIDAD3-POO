package taller18.Ejercicio2;

public class CajeroAutomatico implements Retirable {
    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de $" + monto + " realizado en cajero.");
    }
}