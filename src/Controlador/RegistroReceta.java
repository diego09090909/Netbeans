package Controlador;

import bd.Conexion;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import modelo.Recetas;

/**
 *
 * @author diego
 */
public class RegistroReceta {

    public boolean agregarReceta(Recetas receta) {
        Date date;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            date = receta.getFechaCreacion();

            String query = "INSERT INTO receta(id,nombre,tipo,precio_plato,fecha_creacion,activo)values(?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, receta.getId());
            stmt.setString(2, receta.getNombre());
            stmt.setString(3, receta.getTipo());
            stmt.setInt(4, receta.getPrecioPlato());
            stmt.setDate(5, new java.sql.Date(date.getTime()));
            stmt.setBoolean(6, receta.isActivo());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al agregar Receta: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int id) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM receta WHERE id = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);
            int filasAfectadas = stmt.executeUpdate();

            stmt.close();
            cnx.close();

            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.out.println("Error al elminiar Receta: " + e.getMessage());
            return false;
        }
    }

    public List<Recetas> listarTodos() {

        List<Recetas> listaRecetas = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM receta order by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Recetas rec = new Recetas();
                rec.setId(rs.getInt("id"));
                rec.setNombre(rs.getString("nombre"));
                rec.setTipo(rs.getString("tipo"));
                rec.setPrecioPlato(rs.getInt("precio_plato"));
                rec.setFechaCreacion(rs.getDate("fecha_creacion"));
                rec.setActivo(rs.getBoolean("activo"));

                listaRecetas.add(rec);

            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al listar los RECETAS: " + e.getMessage());
        }
        return listaRecetas;
    }

    public boolean actualizar(Recetas receta) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE receta SET id = ?,nombre=?,tipo=?,precio_plato=?,fecha_creacion=? WHERE id =?";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.setString(1, receta.getNombre());
            stmt.setString(2, receta.getTipo());
            stmt.setInt(3, receta.getPrecioPlato());
            stmt.setDate(4, new java.sql.Date(receta.getFechaCreacion().getTime()));
            stmt.setInt(5, receta.getId());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al actualizar el Receta: " + e.getMessage());
            return false;
        }
    }

    public Recetas buscarPorId(int id) {
        Recetas rec = new Recetas();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM receta WHERE id = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                rec.setId(rs.getInt("id"));
                rec.setNombre(rs.getString("nombre"));
                rec.setTipo(rs.getString("tipo"));
                rec.setPrecioPlato(rs.getInt("precio_plato"));
                rec.setFechaCreacion(rs.getDate("fecha_creacion"));
                rec.setActivo(rs.getBoolean("activo"));

            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al buscar la Receta: " + e.getMessage());

        }
        return rec;
    }

}
