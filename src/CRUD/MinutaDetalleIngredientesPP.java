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

/**
 *
 * @author k-ort
 */
public class MinutaDetalleIngredientesPP {

    public boolean insertar(MinutaDetalleIngredientes mdi) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO detalle_ingrediente (id_ingrediente, cantidad, unidad_medida) VALUES (?, ?, ?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, mdi.getIdIngrediente());
            stmt.setDouble(2, mdi.getCantidad());
            stmt.setString(3, mdi.getUnidadMedida());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al insertar ingrediente: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizar(MinutaDetalleIngredientes mdi) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE detalle_ingrediente SET cantidad = ?, unidad_medida = ? WHERE id_ingrediente = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setDouble(1, mdi.getCantidad());
            stmt.setString(2, mdi.getUnidadMedida());
            stmt.setInt(3, mdi.getIdIngrediente());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al actualizar ingrediente: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int idIngrediente) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM detalle_ingrediente WHERE id_ingrediente = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idIngrediente);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al eliminar ingrediente: " + e.getMessage());
            return false;
        }
    }

    public List<MinutaDetalleIngredientes> listar() {
        List<MinutaDetalleIngredientes> lista = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM minuta_detalle_ingrediente";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                MinutaDetalleIngredientes mdi = new MinutaDetalleIngredientes(
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

    public MinutaDetalleIngredientes buscarPorId(int idIngrediente) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM minuta_detalle_ingredientes WHERE id_ingrediente = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idIngrediente);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                MinutaDetalleIngredientes mdi = new MinutaDetalleIngredientes(
                        rs.getInt("id_ingrediente"),
                        rs.getDouble("cantidad"),
                        rs.getString("unidad_medida")
                );
                rs.close();
                stmt.close();
                cnx.close();
                return mdi;
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al buscar por ID Ingrediente: " + e.getMessage());
        }

        return null;
    }

    public List<MinutaDetalleIngredientes> listarPorMinuta(int idMinuta) {
        List<MinutaDetalleIngredientes> lista = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM minuta_detalle_ingredientes WHERE id_minuta = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idMinuta);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                MinutaDetalleIngredientes mdi = new MinutaDetalleIngredientes(
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
            System.out.println("Error al listar por ID Minuta: " + e.getMessage());
        }

        return lista;
    }

    public List<MinutaDetalleIngredientes> listarPorDetalle(int idDetalle) {
        List<MinutaDetalleIngredientes> lista = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM minuta_detalle_ingredientes WHERE id_detalle = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idDetalle);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                MinutaDetalleIngredientes mdi = new MinutaDetalleIngredientes(
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
            System.out.println("Error al listar por ID Detalle: " + e.getMessage());
        }

        return lista;
    }

}
