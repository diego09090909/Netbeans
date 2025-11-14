package bd;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import vista.Form_MenuPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CInicio {

    public void validarUsuario(JTextField txtUsuario, JPasswordField txtContrasenia) {

        Conexion objetoConexion = new Conexion();
        Connection conexion = objetoConexion.obtenerConexion();

        String sql = "SELECT * FROM usuario WHERE ingresoUsuario = ? AND ingresoContrasenia = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, txtUsuario.getText());
            ps.setString(2, String.valueOf(txtContrasenia.getPassword()));

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión correcto");

                    Form_MenuPrincipal menu = new Form_MenuPrincipal();
                    menu.setVisible(true);
                    
                    ((java.awt.Window) txtUsuario.getTopLevelAncestor()).dispose();
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "Usuario o contraseña incorrectos\nVuelva a intentarlo");
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al validar usuario: " + e.getMessage());
        }

    }

}
