package taller19.Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        return usuario.equals("ana@correo.com") && credencial.equals("token-valido");
    }
}