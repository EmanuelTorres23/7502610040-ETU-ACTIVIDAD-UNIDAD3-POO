package taller19.Ejercicio3;

public class PruebaReportes {
    public static void main(String[] args) {
        GestorReportes gestorPDF = new GestorReportes(new ReportePDF());
        gestorPDF.crearReporte("Ventas de enero");

        GestorReportes gestorExcel = new GestorReportes(new ReporteExcel());
        gestorExcel.crearReporte("Ventas de enero");
    }
}