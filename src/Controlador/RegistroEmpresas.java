package Controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import modelo.Empresa;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author diego
 */
public class RegistroEmpresas {

    public boolean agregarEmpresas(Empresa empresa) {

        Date date;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO empresa(rut,nombre,fono_fijo,direccion,cant_empleado, cant_casino, contrato_indefinido,fecha_inicio,fecha_termino)values(?,?,?,?,?,?,?,?,?)";
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

    public boolean eliminar(String rut) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM empresa WHERE rut = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, rut);

            int filasAfectadas = stmt.executeUpdate();

            stmt.close();
            cnx.close();

            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar Empresa: " + e.getMessage());
            return false;
        }
    }

    public List<Empresa> listarTodos() {

        List<Empresa> listaEmpresa = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM empresa order by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Empresa emp = new Empresa();
                emp.setRut(rs.getString("rut"));
                emp.setNombre(rs.getString("nombre"));
                emp.setFonoFijo(rs.getString("fono_fijo"));
                emp.setDireccion(rs.getString("direccion"));
                emp.setCantEmpleados(rs.getInt("cant_empleado"));
                emp.setCantCasino(rs.getInt("cant_casino"));
                emp.setContratoIndefinido(rs.getBoolean("contrato_indefinido"));
                emp.setFechaInicio(rs.getDate("fecha_inicio"));
                emp.setFechaTermino(rs.getDate("fecha_termino"));
                
                listaEmpresa.add(emp);

            }
            rs.close();
            stmt.close();
            cnx.close();
            

        } catch (SQLException e) {
             System.out.println("Error al listar los EMPRESAS: " +e.getMessage());
        }
        return listaEmpresa;
    }

}
