package Clases;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import store.Menu;

public class CLogin {
    public void ValidarUsuario(JTextField email, JPasswordField contraseña){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            Clases.CConexion objetoConexion = new Clases.CConexion();
            con = objetoConexion.estableceConexion();
            String consulta = "SELECT * FROM Usuarios WHERE Email = ? AND Contraseña = ?";
            ps = con.prepareStatement(consulta);
            
            String contra = String.valueOf(contraseña.getPassword());
            
            ps.setString(1, email.getText());
            ps.setString(2, contra);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                String nombreUsuario = rs.getString("Nombre");
                JOptionPane.showMessageDialog(null, "El usuario es correcto");
                Session.setUsuario(nombreUsuario); 
                Menu objetoMenu = new Menu();
                objetoMenu.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(email.getParent())).dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Los datos son incorrectos, vuelva a intentar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.toString());
            }
        }
    }
    
    public void RegistrarUsuario(String nombre, String email, String contraseña) {
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            Clases.CConexion objetoConexion = new Clases.CConexion();
            con = objetoConexion.estableceConexion();
            String consulta = "INSERT INTO Usuarios (Nombre, Email, Contraseña) VALUES (?, ?, ?)";
            ps = con.prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setString(2, email);
            ps.setString(3, contraseña);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar usuario: " + e.toString());
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.toString());
            }
        }
    }
}
