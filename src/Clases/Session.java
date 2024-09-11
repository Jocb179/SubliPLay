package Clases;

public class Session {
    private static String usuario;

    public static void setUsuario(String nombreUsuario) {
        usuario = nombreUsuario;
    }

    public static String getUsuario() {
        return usuario;
    }
}
