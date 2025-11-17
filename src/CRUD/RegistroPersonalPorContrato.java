
package CRUD;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.PersonalPorContrato;


/**
 *
 * @author ikari
 */
public class RegistroPersonalPorContrato {
    
    public boolean agregarRegistroPersonalPorContrato(PersonalPorContrato contrato){
     
        Date date;
        try{
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "INSET INTO honorarios (rut, nombres, appaterno, apmaterno, fecha_inicio, fecha_termino,tipo_horario,sueldo)values(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, contrato.getSueldo());
            stmt.setString(2, contrato.getRut());
            stmt.setString(3, contrato.getNombres());
            stmt.setString(4, contrato.getAppaterno());
            stmt.setString(5, contrato.getApmaterno());
            stmt.setString(6,contrato.getTipoHorario());
            stmt.setDate(7, new java.sql.Date(contrato.getFechaDeInicio().getTime()));
            stmt.setDate(8, new java.sql.Date(contrato.getFechaDeTermino().getTime()));
            stmt.setBoolean(9, true);
                        
            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        }catch (SQLException e) {
            System.out.println("Error al agregar Personal" + e.getMessage());
            return false;
        }
    }
    
        public boolean eliminar(String rut) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM contrato WHERE rut = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, rut);

            int filasAfectadas = stmt.executeUpdate();

            stmt.close();
            cnx.close();

            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar Personal: " + e.getMessage());
            return false;
        }
    }
        public List<PersonalPorContrato> listarTodos() {

        List<PersonalPorContrato> listaContrato = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM empresa order by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                
                PersonalPorContrato cont = new PersonalPorContrato();
                
                cont.setRut(rs.getString("rut"));
                cont.setNombres(rs.getString("nombre"));
                cont.setAppaterno(rs.getString("appaterno"));
                cont.setApmaterno(rs.getString("apmaterno"));
                cont.setFechaDeInicio(rs.getDate("fecha_incio"));
                cont.setFechaDeTermino(rs.getDate("fecha_termino"));
                cont.setTipoHorario(rs.getString("tipo_horario"));
                cont.setSueldo(rs.getInt("sueldo"));
                
                listaContrato.add(cont);

            }
            rs.close();
            stmt.close();
            cnx.close();
            

        } catch (SQLException e) {
             System.out.println("Error al listar el personal con contrato: " +e.getMessage());
        }
        return listaContrato;
    }

}
