package CRUD;

import bd.Conexion;
import modelo.MinutaDetalle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author k-ort
 */
public class MinutaDetallePP {

    public boolean insertar(MinutaDetalle md) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO minuta_detalle (id_minuta, id_detalle, comida, plato_principal, acompanamiento, postre, bebida, observaciones) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = cnx.prepareStatement(query);

            // id_minuta viene del objeto Minuta asociado
            stmt.setInt(1, md.getIdMinuta().getIdMinuta());
            stmt.setInt(2, md.getIdDetalle());
            stmt.setString(3, md.getComida());
            stmt.setString(4, md.getPlatoPrincipal());
            stmt.setString(5, md.getAcompanamiento());
            stmt.setString(6, md.getPostre());
            stmt.setString(7, md.getBebida());
            stmt.setString(8, md.getObservaciones());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al insertar detalle: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizar(MinutaDetalle md) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE minuta_detalle SET comida = ?, plato_principal = ?, acompanamiento = ?, postre = ?, bebida = ?, observaciones = ? WHERE id_detalle = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, md.getComida());
            stmt.setString(2, md.getPlatoPrincipal());
            stmt.setString(3, md.getAcompanamiento());
            stmt.setString(4, md.getPostre());
            stmt.setString(5, md.getBebida());
            stmt.setString(6, md.getObservaciones());
            stmt.setInt(7, md.getIdDetalle());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al actualizar detalle: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int idDetalle) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM minuta_detalle WHERE id_detalle = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idDetalle);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al eliminar detalle: " + e.getMessage());
            return false;
        }
    }

    public MinutaDetalle buscarPorId(int idDetalle) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM minuta_detalle WHERE id_detalle = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idDetalle);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                MinutaDetalle md = new MinutaDetalle(
                        rs.getInt("id_detalle"),
                        rs.getString("comida"),
                        rs.getString("plato_principal"),
                        rs.getString("acompanamiento"),
                        rs.getString("postre"),
                        rs.getString("bebida"),
                        rs.getString("observaciones")
                );
                rs.close();
                stmt.close();
                cnx.close();
                return md;
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al buscar detalle: " + e.getMessage());
        }

        return null;
    }

    public List<MinutaDetalle> listar() {
        List<MinutaDetalle> lista = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM minuta_detalle";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                MinutaDetalle md = new MinutaDetalle(
                        rs.getInt("id_detalle"),
                        rs.getString("comida"),
                        rs.getString("plato_principal"),
                        rs.getString("acompanamiento"),
                        rs.getString("postre"),
                        rs.getString("bebida"),
                        rs.getString("observaciones")
                );
                lista.add(md);
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al listar detalles: " + e.getMessage());
        }

        return lista;
    }

}
