
package CRUD;

import bd.Conexion;
import java.sql.Connection;
import modelo.MinutaDetalleIngredientes;
import java.sql.PreparedStatement;

/**
 *
 * @author k-ort
 */
public class MinutaDetalleIngredientesPP {
    


    public boolean insertar(MinutaDetalleIngredientes ing) {
        String sql = "INSERT INTO minuta_detalle_ingredientes (id_detalle, id_producto, cantidad, unidad_medida) "
                + "VALUES (?, ?, ?, ?)";

        try (Connection conn = (Connection) new Conexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, ing.getIdDetalle());
            ps.setInt(2, ing.getIdProducto());
            ps.setDouble(3, ing.getCantidad());
            ps.setString(4, ing.getUnidadMedida());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Error al insertar ingrediente de minuta: " + e.getMessage());
            return false;
        }
    }
}
