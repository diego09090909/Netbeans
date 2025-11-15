package CRUD;

import bd.Conexion;
import modelo.InventarioConsumibles;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author k-ort
 */
public class RegistroConsumibles {

    public boolean insertar(InventarioConsumibles c) {
        String sql = "INSERT INTO inventario_consumibles (id_producto, unidad_medida, costo_unitario, fecha_vencimiento, proveedor) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = (Connection) new Conexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, c.getIdProducto());
            ps.setString(2, c.getUnidadMedida());
            ps.setDouble(3, c.getCostoUnitario());
            ps.setDate(4, (Date) c.getFechaVencimiento());
            ps.setString(5, c.getProveedor());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar consumible... " + e.getMessage());
            return false;
        }
    }
}
