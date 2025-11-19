package CRUD;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author diego
 */
public class RegistroUsuario {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public boolean guardar(Usuario usu) {
        String query = "INSERT INTO usuario (ingreso_nombre, ingreso_contrasenia) VALUES (?, ?)";

        try {
            Conexion conexion = new Conexion();
            conn = conexion.obtenerConexion();
            ps = conn.prepareStatement(query);

            ps.setString(1, usu.getNombre());
            ps.setString(2, usu.getContrasena());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Error al registrar usuario... " + e.getMessage());
            return false;
        }
    }
}

