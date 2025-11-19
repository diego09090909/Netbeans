package CRUD;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class RegistroUsuario {

    public boolean guardar(Usuario usu) {
    String query = "INSERT INTO usuario (ingreso_usuario, ingreso_contrasenia) VALUES (?, ?)";

    try {
        Conexion con = new Conexion();
        Connection cnx = con.obtenerConexion();

        PreparedStatement stmt = cnx.prepareStatement(query);
        stmt.setString(1, usu.getNombre());
        stmt.setString(2, usu.getContrasena());

        int filas = stmt.executeUpdate();

        stmt.close();
        cnx.close();

        return filas > 0;

    } catch (SQLException e) {
        System.out.println("Error al registrar usuario: " + e.getMessage());
        return false;
    }
}
    public boolean validarUsuario(Usuario u) {
    boolean acceso = false;

    try {
        Conexion con = new Conexion();
        Connection cnx = con.obtenerConexion();

        String query = "SELECT * FROM usuario WHERE ingreso_usuario = ? AND ingreso_contrasenia = ?";
        PreparedStatement stmt = cnx.prepareStatement(query);
        stmt.setString(1, u.getNombre());
        stmt.setString(2, u.getContrasena());

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            acceso = true;
        }

        rs.close();
        stmt.close();
        cnx.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al validar usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    return acceso;
}


    
}
