
package CRUD;

import bd.Conexion;
import modelo.Inventario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author k-ort
 */

public class InventarioPP {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(Inventario inv) {
        String sql = "INSERT INTO inventario (codigo, nombre, descripcion, tipo, stock_actual, stock_minimo, ubicacion, estado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Conexion conn = new Conexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, inv.getCodigo());
            ps.setString(2, inv.getNombre());
            ps.setString(3, inv.getDescripcion());
            ps.setString(4, inv.getTipo());
            ps.setInt(5, inv.getStockActual());
            ps.setInt(6, inv.getStockMinimo());
            ps.setString(7, inv.getUbicacion());
            ps.setString(8, inv.getEstado());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar inventario... " + e.getMessage());
            return false;
        }
    }

    public ArrayList<Inventario> listar() {
        ArrayList<Inventario> lista = new ArrayList<>();
        String sql = "SELECT * FROM inventario";

        try {
            Conexion conn = new Conexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Inventario inv =new Inventario(
                        rs.getInt("id_producto"),
                        rs.getString("codigo"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getString("tipo"),
                        rs.getInt("stock_actual"),
                        rs.getInt("stock_minimo"),
                        rs.getString("ubicacion"),
                        rs.getString("estado")
                ) {};
                lista.add(inv);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar inventario... " + e.getMessage());
        }

        return lista;
    }

    public boolean actualizar(Inventario inv) {
        String sql = "UPDATE inventario SET codigo=?, nombre=?, descripcion=?, tipo=?, stock_actual=?, "
                + "stock_minimo=?, ubicacion=?, estado=? WHERE id_producto=?";
        try {
            Conexion conn = new Conexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, inv.getCodigo());
            ps.setString(2, inv.getNombre());
            ps.setString(3, inv.getDescripcion());
            ps.setString(4, inv.getTipo());
            ps.setInt(5, inv.getStockActual());
            ps.setInt(6, inv.getStockMinimo());
            ps.setString(7, inv.getUbicacion());
            ps.setString(8, inv.getEstado());
            ps.setInt(9, inv.getIdProducto());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar inventario... " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM inventario WHERE id_producto=?";

        try {
            Conexion conn = new Conexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar inventario... " + e.getMessage());
            return false;
        }
    }
}

