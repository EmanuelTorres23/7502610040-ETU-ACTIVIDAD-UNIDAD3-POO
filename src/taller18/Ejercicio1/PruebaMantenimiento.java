package taller18.Ejercicio1;

public class PruebaMantenimiento {
    public static void main(String[] args) {
        Reparable tecnico = new TecnicoMecanico();
        Limpiable personal = new PersonalLimpieza();

        tecnico.repararEquipo();
        personal.limpiarArea();
    }
}