package taller18.Ejercicio2;

public class PruebaOperaciones {
    public static void main(String[] args) {
        Retirable cajero = new CajeroAutomatico();
        cajero.retirar(50000);

        CuentaCorriente cuenta = new CuentaCorriente();
        cuenta.transferir(200000);
        cuenta.retirar(100000);
        cuenta.pagarFactura("FAC-2024-01");
    }
}