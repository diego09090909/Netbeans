package Controlador;

import modelo.InventarioConsumibles;
import bd.Conexion;
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
public class RegistroConsumibles {

    public boolean agregarConsumibles(InventarioConsumibles InventarioConsumibles) {

        Date date;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO InventarioDeActivos(idProducto,nombre,cantidado,precio,fechaVencimiento)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, InventarioConsumibles.getIdProducto());
            stmt.setString(2, InventarioConsumibles.getNombre());
            stmt.setInt(3, InventarioConsumibles.getCantidad());
            stmt.setInt(4, InventarioConsumibles.getPrecio());
            stmt.setDate(5, new java.sql.Date(InventarioConsumibles.getFechaVencimiento().getTime()));

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al agregar nuevo Producto..." + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(String idProducto) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM InventarioConsumibles WHERE idProducto = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, idProducto);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al elminiar Producto... " + e.getMessage());
            return false;
        }
    }

    public boolean actualizar(InventarioConsumibles InventarioConsumibles) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE InventarioConsumibles SET nombre = ?,cantidadr=?,precio =?,fechaVencimiento=? WHERE idProducto =?";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.setString(1, InventarioConsumibles.getNombre());
            stmt.setInt(2, InventarioConsumibles.getCantidad());
            stmt.setInt(3, InventarioConsumibles.getPrecio());
            stmt.setDate(4, new java.sql.Date(InventarioConsumibles.getFechaVencimiento().getTime()));

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al actualizar el Producto... " + e.getMessage());
            return false;
        }
    }

    public List<InventarioConsumibles> buscarTodos() {
        List<InventarioConsumibles> lista = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM InventarioConsumibles order by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                InventarioConsumibles InvCons = new InventarioConsumibles();
                InvCons.setIdProducto(rs.getString("idProducto"));
                InvCons.setNombre(rs.getString("nombre"));
                InvCons.setCantidad(rs.getInt("cantidad"));
                InvCons.setPrecio(rs.getInt("precio"));
                InvCons.setFechaVencimiento(rs.getDate("fechaVencimiento"));

                lista.add(InvCons);
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al listar los Productos... " + e.getMessage());

        }
        return lista;
    }
    
    public InventarioConsumibles buscarPorId(String idProducto)
    {
        InventarioConsumibles InvCons = new InventarioConsumibles();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
           
            
            String query = "SELECT * FROM InventarioConsumibles WHERE idProducto = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, idProducto);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
              
                InvCons.setIdProducto(rs.getString("idProducto"));
                InvCons.setNombre(rs.getString("nombre"));
                InvCons.setCantidad(rs.getInt("cantidad"));
                InvCons.setPrecio(rs.getInt("Precio"));
                InvCons.setFechaVencimiento(rs.getDate("fechaVencimiento"));
              
            }
            
            rs.close();
            stmt.close();
            cnx.close();
            
            
        } catch (SQLException e) {
            System.out.println("Error al listar el Producto... " +e.getMessage());
           
        }
        return InvCons;
    }
}
