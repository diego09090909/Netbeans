
package CRUD;

import bd.Conexion;
import modelo.MinutaDetalle;
import java.sql.PreparedStatement;
import java.sql.Connection;

/**
 *
 * @author k-ort
 */
public class MinutaDetallePP {


    public boolean insertar(MinutaDetalle d) {
        String sql = "INSERT INTO minuta_detalle (id_minuta, comida, plato_principal, acompanamiento, postre, bebida, observaciones) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = (Connection) new Conexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, d.getIdMinuta());
            ps.setString(2, d.getComida());
            ps.setString(3, d.getPlatoPrincipal());
            ps.setString(4, d.getAcompanamiento());
            ps.setString(5, d.getPostre());
            ps.setString(6, d.getBebida());
            ps.setString(7, d.getObservaciones());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Error al insertar detalle de minuta: " + e.getMessage());
            return false;
        }
    }
}

