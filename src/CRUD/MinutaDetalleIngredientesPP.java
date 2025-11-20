package CRUD;

import bd.Conexion;
import modelo.MinutaDetalleIngredientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Minuta;
import modelo.MinutaDetalle;

/**
 *
 * @author k-ort
 */
public class MinutaDetalleIngredientesPP {

    // INSERTAR
    public boolean insertar(MinutaDetalleIngredientes mdi) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO detalle_ingrediente (id_ingrediente, id_minuta, id_detalle, cantidad, unidad_medida) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.setInt(1, mdi.getIdIngrediente());
            stmt.setInt(2, mdi.getIdMinuta().getIdMinuta());       // extraemos el int desde el objeto Minuta
            stmt.setInt(3, mdi.getIdDetalle().getIdDetalle());     // extraemos el int desde el objeto MinutaDetalle
            stmt.setDouble(4, mdi.getCantidad());
            stmt.setString(5, mdi.getUnidadMedida());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al insertar ingrediente: " + e.getMessage());
            return false;
        }
    }

    public MinutaDetalleIngredientes buscarPorIdDetalle(int idDetalle) {
        MinutaDetalleIngredientes mdi = null;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM detalle_ingrediente WHERE id_detalle = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idDetalle);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Minuta m = new Minuta();
                m.setIdMinuta(rs.getInt("id_minuta"));

                MinutaDetalle d = new MinutaDetalle();
                d.setIdDetalle(rs.getInt("id_detalle"));

                mdi = new MinutaDetalleIngredientes(
                        m,
                        d,
                        rs.getInt("id_ingrediente"),
                        rs.getDouble("cantidad"),
                        rs.getString("unidad_medida")
                );
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al buscar ingrediente: " + e.getMessage());
        }
        return mdi;
    }

    // LISTAR TODOS
    public List<MinutaDetalleIngredientes> listarTodos() {
        List<MinutaDetalleIngredientes> lista = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM detalle_ingrediente";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Minuta m = new Minuta();
                m.setIdMinuta(rs.getInt("id_minuta"));

                MinutaDetalle d = new MinutaDetalle();
                d.setIdDetalle(rs.getInt("id_detalle"));

                MinutaDetalleIngredientes mdi = new MinutaDetalleIngredientes(
                        m,
                        d,
                        rs.getInt("id_ingrediente"),
                        rs.getDouble("cantidad"),
                        rs.getString("unidad_medida")
                );
                lista.add(mdi);
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al listar ingredientes: " + e.getMessage());
        }
        return lista;
    }

    
    public boolean actualizar(MinutaDetalleIngredientes mdi) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE detalle_ingrediente SET id_ingrediente=?, id_minuta=?, cantidad=?, unidad_medida=? WHERE id_detalle=?";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.setInt(1, mdi.getIdIngrediente());
            stmt.setInt(2, mdi.getIdMinuta().getIdMinuta());
            stmt.setDouble(3, mdi.getCantidad());
            stmt.setString(4, mdi.getUnidadMedida());
            stmt.setInt(5, mdi.getIdDetalle().getIdDetalle());

            int filas = stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar ingrediente: " + e.getMessage());
            return false;
        }
    }

   
    public boolean eliminar(int idDetalle) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM detalle_ingrediente WHERE id_detalle=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idDetalle);

            int filas = stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar ingrediente: " + e.getMessage());
            return false;
        }
    }

}
