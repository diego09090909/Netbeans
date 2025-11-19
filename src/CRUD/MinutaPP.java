package CRUD;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Minuta;

/**
 *
 * @author k-ort
 */
public class MinutaPP {

    public boolean insertar(Minuta m) {
        Date fecha = m.getFecha();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO minuta (id_minuta, tipo, fecha, nombre, descripcion) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, m.getIdMinuta());
            stmt.setString(2, m.getTipo());
            stmt.setDate(3, new java.sql.Date(fecha.getTime()));
            stmt.setString(4, m.getNombre());
            stmt.setString(5, m.getDescripcion());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al insertar minuta: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int idMinuta) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM minuta WHERE id_minuta = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idMinuta);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al eliminar minuta: " + e.getMessage());
            return false;
        }
    }

    public Minuta buscarPorId(int idMinuta) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM minuta WHERE id_minuta = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idMinuta);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Minuta m = new Minuta(
                        rs.getInt("id_minuta"),
                        rs.getString("tipo"),
                        rs.getDate("fecha"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
                rs.close();
                stmt.close();
                cnx.close();
                return m;
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al buscar minuta: " + e.getMessage());
        }

        return null;
    }

    public List<Minuta> listar() {
        List<Minuta> lista = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM minuta";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Minuta m = new Minuta(
                        rs.getInt("id_minuta"),
                        rs.getString("tipo"),
                        rs.getDate("fecha"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
                lista.add(m);
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al listar minutas: " + e.getMessage());
        }

        return lista;
    }

    public boolean actualizar(Minuta m) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE minuta SET tipo = ?, fecha = ?, nombre = ?, descripcion = ? WHERE id_minuta = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, m.getTipo());
            stmt.setDate(2, new java.sql.Date(m.getFecha().getTime()));
            stmt.setString(3, m.getNombre());
            stmt.setString(4, m.getDescripcion());
            stmt.setInt(5, m.getIdMinuta());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al actualizar minuta: " + e.getMessage());
            return false;
        }
    }

}
