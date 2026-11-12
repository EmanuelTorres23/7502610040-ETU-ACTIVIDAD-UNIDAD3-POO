package taller19.Ejercicio1;

public class PruebaAutenticacion {
    public static void main(String[] args) {
        GestorAutenticacion gestorLocal = new GestorAutenticacion(new AutenticacionLocal());
        gestorLocal.iniciarSesion("admin", "1234");
        gestorLocal.iniciarSesion("admin", "0000");

        GestorAutenticacion gestorOAuth = new GestorAutenticacion(new AutenticacionOAuth());
        gestorOAuth.iniciarSesion("ana@correo.com", "token-valido");
        gestorOAuth.iniciarSesion("ana@correo.com", "token-falso");
    }
}