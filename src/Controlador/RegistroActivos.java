
package Controlador;

import modelo.InventarioDeActivos;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author k-ort
 */
public class RegistroActivos {
    
        public boolean agregarActivo(InventarioDeActivos InventarioDeActivos){
          
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO inventariodeactivos(id_producto,nombre,cantidad,precio,tipo_activo)values(?????)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, InventarioDeActivos.getIdProducto());
            stmt.setString(2, InventarioDeActivos.getNombre());
            stmt.setInt(3, InventarioDeActivos.getCantidad());
            stmt.setInt(4, InventarioDeActivos.getPrecio());
            stmt.setString(5, InventarioDeActivos.getTipoActivo());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al agregar nuevo Activo..." + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(String idProducto) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM inventariodeactivos WHERE id_producto = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, idProducto);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al elminiar Activo... " + e.getMessage());
            return false;
        }
    }

    public boolean actualizar(InventarioDeActivos InventarioDeActivos) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE inventariodeactivos SET nombre = ?,cantidad=?,precio =?,tipo_activo=? WHERE id_producto =?";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.setString(1, InventarioDeActivos.getNombre());
            stmt.setInt(2, InventarioDeActivos.getCantidad());
            stmt.setInt(3, InventarioDeActivos.getPrecio());
            stmt.setString(4,InventarioDeActivos.getTipoActivo());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al actualizar el Activo... " + e.getMessage());
            return false;
        }
    }

    public List<InventarioDeActivos> buscarTodos() {
        List<InventarioDeActivos> lista = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM inventariodeactivos order by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                InventarioDeActivos InvAct = new InventarioDeActivos();
                InvAct.setIdProducto(rs.getString("id_producto"));
                InvAct.setNombre(rs.getString("nombre"));
                InvAct.setCantidad(rs.getInt("cantidad"));
                InvAct.setPrecio(rs.getInt("precio"));
                InvAct.setTipoActivo("tipo_activo");

                lista.add(InvAct);
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al listar los Activos... " + e.getMessage());

        }
        return lista;
    }
    
    public InventarioDeActivos buscarPorId(String idProducto)
    {
        InventarioDeActivos InvAct = new InventarioDeActivos();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
           
            
            String query = "SELECT * FROM InventarioDeActivos WHERE idProducto = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, idProducto);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
              
                InvAct.setIdProducto(rs.getString("idProducto"));
                InvAct.setNombre(rs.getString("nombre"));
                InvAct.setCantidad(rs.getInt("cantidad"));
                InvAct.setPrecio(rs.getInt("Precio"));
                InvAct.setTipoActivo("tipo_activo");
              
            }
            
            rs.close();
            stmt.close();
            cnx.close();
            
            
        } catch (SQLException e) {
            System.out.println("Error al listar el Activo... " +e.getMessage());
           
        }
        return InvAct;
    }
}
