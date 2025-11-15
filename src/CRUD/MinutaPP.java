package CRUD;

import bd.Conexion;
import java.sql.Connection;
import modelo.Minuta;
import java.sql.PreparedStatement;
import java.sql.Date;

/**
 *
 * @author k-ort
 */
public class MinutaPP {

    public boolean insertar(Minuta m) {
        String sql = "INSERT INTO minutas (tipo, fecha, nombre, descripcion) VALUES (?, ?, ?, ?)";

        try (Connection conn = (Connection) new Conexion(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, m.getTipo());
            ps.setDate(2, (Date) m.getFecha());
            ps.setString(3, m.getNombre());
            ps.setString(4, m.getDescripcion());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Error al insertar minuta... " + e.getMessage());
            return false;
        }
    }
}
