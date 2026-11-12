package taller18.Ejercicio2;

public class CuentaCorriente implements Transferible, Retirable, PagoFacturable {
    @Override
    public void transferir(double monto) {
        System.out.println("Transferencia de $" + monto + " realizada.");
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de $" + monto + " realizado.");
    }

    @Override
    public void pagarFactura(String numeroFactura) {
        System.out.println("Factura " + numeroFactura + " pagada.");
    }
}