
package CRUD;


import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import modelo.PersonalPorHonorarios ;
import java.util.ArrayList;


/**
 *
 * @author ikari
 */
public class RegistroPersonalPorHonorarios {

    public boolean agregarRegistroPersonalPorContrato(PersonalPorHonorarios honorarios){
             
        Date date;
        try{
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "INSET INTO honorarios (rut, nombre, appaterno, apmaterno,tipo_horario,valor_hora)values(?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setString(1, honorarios.getRut());
            stmt.setString(2, honorarios.getNombres());
            stmt.setString(3, honorarios.getAppaterno());
            stmt.setString(4, honorarios.getApmaterno());
            stmt.setString(5, honorarios.getTipoHorario());
            stmt.setInt(6, honorarios.getValorPorHora());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        }catch (SQLException e) {
            System.out.println("Error al agregar Personal de Honorarios" + e.getMessage());
            return false;
        }
    }
        public boolean eliminar(String rut) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM honorarios WHERE rut = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, rut);

            int filasAfectadas = stmt.executeUpdate();

            stmt.close();
            cnx.close();

            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar Personal de Honorarios: " + e.getMessage());
            return false;
        }
    }
    public List<PersonalPorHonorarios> listarTodos() {

        List<PersonalPorHonorarios> listaHonorario = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM empresa order by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
            PersonalPorHonorarios honor = new PersonalPorHonorarios();

            honor.setRut(rs.getString("rut"));
            honor.setNombres(rs.getString("nombre"));
            honor.setAppaterno(rs.getString("appaterno"));
            honor.setAppaterno(rs.getString("apmaterno"));
            honor.setTipoHorario(rs.getString("tipo_horario"));
            honor.setValorPorHora(rs.getInt("valor_hora"));
     
            listaHonorario.add(honor);

            }
            rs.close();
            stmt.close();
            cnx.close();
            

        } catch (SQLException e) {
             System.out.println("Error al listar personal : " +e.getMessage());
        }
        return listaHonorario;
    }
}
