package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CConexion {
    Connection conectar;
    String dbPath = "Data/sqlite.db"; 
    public Connection estableceConexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            String cadena = "jdbc:sqlite:" + dbPath;
            conectar = DriverManager.getConnection(cadena);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas en la conexión: " + e.toString());
        }
        return conectar;
    }
}
