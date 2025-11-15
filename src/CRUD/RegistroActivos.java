
package CRUD;

import bd.Conexion;
import modelo.InventarioDeActivos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author k-ort
 */
public class RegistroActivos {


    public boolean insertar(InventarioDeActivos activo) {
        String sql = "INSERT INTO inventario_activos (id_producto, marca, modelo, numero_serie, fecha_adquisicion, valor_inicial, vida_util, responsable) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = (Connection) new Conexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, activo.getIdProducto());
            ps.setString(2, activo.getMarca());
            ps.setString(3, activo.getModelo());
            ps.setString(4, activo.getNumeroSerie());
            ps.setDate(5, activo.getFechaAdquisicion());
            ps.setDouble(6, activo.getValorInicial());
            ps.setInt(7, activo.getVidaUtil());
            ps.setString(8, activo.getResponsable());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar activo: " + e.getMessage());
            return false;
        }
    }
}

