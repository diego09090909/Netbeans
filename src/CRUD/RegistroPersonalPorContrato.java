
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
            
            String query = "INSET INTO Contrato (rut, nombre, appaterno, apmaterno, fecha_inicio, fecha_termino,tipo_horario,sueldo)values(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, contrato.getSueldo());
            stmt.setString(2, contrato.getRut());
            stmt.setString(3, contrato.getNombre());
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
                cont.setNombre(rs.getString("nombre"));
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
    
        public boolean actualizar(PersonalPorContrato contrato) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE empresa SET rut = ?,nombre=?,fono_fijo =?,direccion=?,contrato_indefinido =?,fecha_inicio=?,fecha_termino=? WHERE rut =?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, contrato.getRut());
            stmt.setString(2, contrato.getNombre());
            stmt.setString(3, contrato.getFono());
            stmt.setString(4, contrato.getDireccion());
            stmt.setBoolean(5, contrato.isEsIndefinido());
            stmt.setDate(6, new java.sql.Date(contrato.getFechaDeInicio().getTime()));
            stmt.setDate(7, new java.sql.Date(contrato.getFechaDeTermino().getTime()));
            

            if (contrato.getFechaDeTermino() != null) {
                stmt.setDate(9, new java.sql.Date(contrato.getFechaDeTermino().getTime()));
            } else {
                stmt.setNull(9, java.sql.Types.DATE);
            }
            stmt.setString(10, contrato.getRut());
            int filas = stmt.executeUpdate();

            stmt.close();
            cnx.close();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar el Libro: " + e.getMessage());
            return false;
        }
    }
        
        public PersonalPorContrato buscarPorRut(String rut) {
        PersonalPorContrato contrato = new PersonalPorContrato();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM empresa WHERE rut = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, rut);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                contrato.setRut(rs.getString("rut"));
                contrato.setNombre(rs.getString("nombre"));
                contrato.setFono(rs.getString("fono_fijo"));
                contrato.setDireccion(rs.getString("direccion"));

                contrato.setEsIndefinido(rs.getBoolean("contrato_indefinido"));
                contrato.setHonorario(rs.getBoolean("por_honorario"));
                contrato.setFechaDeInicio(rs.getDate("fecha_inicio"));
                contrato.setFechaDeTermino(rs.getDate("fecha_termino"));

            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al listar el libro: " + e.getMessage());

        }
        return contrato;
    }

}
