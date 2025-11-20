package CRUD;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.PersonalPorContrato;

public class RegistroPersonalPorContrato {

    public boolean agregarRegistroPersonalPorContrato(PersonalPorContrato contrato) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO contrato (rut, nombre, fecha_inicio, fecha_termino, tipo_horario, sueldo) VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.setString(1, contrato.getRut());
            stmt.setString(2, contrato.getNombre());
            stmt.setDate(3, new java.sql.Date(contrato.getFechaDeInicio().getTime()));

            if (contrato.getFechaDeTermino() != null) {
                stmt.setDate(4, new java.sql.Date(contrato.getFechaDeTermino().getTime()));
            } else {
                stmt.setNull(4, java.sql.Types.DATE);
            }

            stmt.setString(5, contrato.getTipoHorario());
            stmt.setInt(6, contrato.getSueldo());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al agregar Personal: " + e.getMessage());
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

            String query = "SELECT * FROM contrato ORDER BY nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                PersonalPorContrato cont = new PersonalPorContrato();

                cont.setRut(rs.getString("rut"));
                cont.setNombre(rs.getString("nombre"));
                cont.setFechaDeInicio(rs.getDate("fecha_inicio"));
                cont.setFechaDeTermino(rs.getDate("fecha_termino"));
                cont.setTipoHorario(rs.getString("tipo_horario"));
                cont.setSueldo(rs.getInt("sueldo"));

                listaContrato.add(cont);
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al listar el personal con contrato: " + e.getMessage());
        }
        return listaContrato;
    }

    public boolean actualizar(PersonalPorContrato contrato) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE contrato SET nombre=?, fecha_inicio=?, fecha_termino=?, tipo_horario=?, sueldo=? WHERE rut=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, contrato.getNombre());
            stmt.setDate(2, new java.sql.Date(contrato.getFechaDeInicio().getTime()));
            if (contrato.getFechaDeTermino() != null) {
                stmt.setDate(3, new java.sql.Date(contrato.getFechaDeTermino().getTime()));
            } else {
                stmt.setNull(3, java.sql.Types.DATE);
            }
            stmt.setString(4, contrato.getTipoHorario());
            stmt.setInt(5, contrato.getSueldo());
            stmt.setString(6, contrato.getRut());

            int filas = stmt.executeUpdate();

            stmt.close();
            cnx.close();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar el contrato: " + e.getMessage());
            return false;
        }
    }
  

    public PersonalPorContrato buscarPorRut(String rut) {
        PersonalPorContrato contrato = null;

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM contrato WHERE rut = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, rut);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                contrato = new PersonalPorContrato();
                contrato.setRut(rs.getString("rut"));
                contrato.setNombre(rs.getString("nombre"));
                contrato.setFechaDeInicio(rs.getDate("fecha_inicio"));
                contrato.setFechaDeTermino(rs.getDate("fecha_termino"));
                contrato.setTipoHorario(rs.getString("tipo_horario"));
                contrato.setSueldo(rs.getInt("sueldo"));
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al buscar contrato: " + e.getMessage());
        }
        return contrato;
    }

}
