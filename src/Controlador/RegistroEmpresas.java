
package Controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import modelo.Empresa;

/**
 *
 * @author diego
 */
public class RegistroEmpresas {
    
      public boolean agregarEmpresas(Empresa empresa){
          
        Date date;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            
            String query ="INSERT INTO empresa(rut,nombre,fono_fijo,direccion,cant_empleado, cant_casino, contrato_indefinido,fecha_inicio,fecha_termino)values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, empresa.getRut());
            stmt.setString(2, empresa.getNombre());
            stmt.setString(3, empresa.getFonoFijo());
            stmt.setString(4, empresa.getDireccion());
            stmt.setInt(5, empresa.getCantEmpleados());
            stmt.setInt(6, empresa.getCantCasino());
            stmt.setBoolean(7, empresa.isContratoIndefinido());
            stmt.setDate(8, new java.sql.Date(empresa.getFechaInicio().getTime()));
            stmt.setDate(9, new java.sql.Date(empresa.getFechaTermino().getTime()));
            
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error al agregar nueva empresa..." + e.getMessage());
            return false;
        }
    }
    
}
