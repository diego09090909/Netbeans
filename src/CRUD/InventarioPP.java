package CRUD;

import bd.Conexion;
import modelo.Inventario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InventarioPP {

    public boolean insertar(Inventario inv) {
        String query = "INSERT INTO inventario (id_producto, codigo, nombre, descripcion, tipo, stock_actual, stock_minimo, ubicacion, estado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, inv.getIdProducto());
            stmt.setString(2, inv.getCodigo());
            stmt.setString(3, inv.getNombre());
            stmt.setString(4, inv.getDescripcion());
            stmt.setString(5, inv.getTipo());
            stmt.setInt(6, inv.getStockActual());
            stmt.setInt(7, inv.getStockMinimo());
            stmt.setString(8, inv.getUbicacion());
            stmt.setString(9, inv.getEstado());

            int filas = stmt.executeUpdate();

            stmt.close();
            cnx.close();

            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar inventario... " + e.getMessage());
            return false;
        }
    }

    public ArrayList<Inventario> listar() {
        ArrayList<Inventario> lista = new ArrayList<>();
        String query = "SELECT * FROM inventario";

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Inventario inv = new Inventario(
                        rs.getInt("id_producto"),
                        rs.getString("codigo"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getString("tipo"),
                        rs.getInt("stock_actual"),
                        rs.getInt("stock_minimo"),
                        rs.getString("ubicacion"),
                        rs.getString("estado")
                );
                lista.add(inv);
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al listar inventario... " + e.getMessage());
        }

        return lista;
    }

    public boolean actualizar(Inventario inv) {
        String query = "UPDATE inventario SET codigo=?, nombre=?, descripcion=?, tipo=?, stock_actual=?, "
                + "stock_minimo=?, ubicacion=?, estado=? WHERE id_producto=?";

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, inv.getCodigo());
            stmt.setString(2, inv.getNombre());
            stmt.setString(3, inv.getDescripcion());
            stmt.setString(4, inv.getTipo());
            stmt.setInt(5, inv.getStockActual());
            stmt.setInt(6, inv.getStockMinimo());
            stmt.setString(7, inv.getUbicacion());
            stmt.setString(8, inv.getEstado());
            stmt.setInt(9, inv.getIdProducto());

            int filas = stmt.executeUpdate();

            stmt.close();
            cnx.close();

            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar inventario... " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int id) {
        String query = "DELETE FROM inventario WHERE id_producto=?";

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);

            int filas = stmt.executeUpdate();

            stmt.close();
            cnx.close();

            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar inventario... " + e.getMessage());
            return false;
        }
    }

    public Inventario buscarPorId(int idProducto) {
        Inventario inve = new Inventario();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM inventario WHERE id_producto = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idProducto);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                inve.setIdProducto(idProducto);
                inve.setCodigo(rs.getString("codigo"));
                inve.setNombre(rs.getString("nombre"));
                inve.setDescripcion(rs.getString("descripcion"));
                inve.setTipo(rs.getString("tipo"));
                inve.setStockActual(rs.getInt("stock_actual"));
                inve.setStockMinimo(rs.getInt("stock_minimo"));
                inve.setUbicacion(rs.getString("ubicacion"));
                inve.setEstado(rs.getString("estado"));
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al buscar inventario por ID: " + e.getMessage());
        }

        return inve;
    }
}
