package taller19.Ejercicio3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte en Excel con los datos: " + datos);
    }
}