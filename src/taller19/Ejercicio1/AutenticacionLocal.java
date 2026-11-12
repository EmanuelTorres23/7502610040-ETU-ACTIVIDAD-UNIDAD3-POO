package taller19.Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        return usuario.equals("admin") && credencial.equals("1234");
    }
}