
package bd;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Conexion {
             
        Connection connection = null;
        
        String usuario = "root";
        String contrasenia = "";
        String bd = "bd_produccion_casino";
        String ip = "localhost";
        String puerto = "3306";
        
        String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd; 
        
        public Connection obtenerConexion() {

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            connection = DriverManager.getConnection(cadena, usuario, contrasenia);
            
            JOptionPane.showMessageDialog(null,"Conexion exitosa!");
            
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Error de conexion..." + e.getMessage());
        }
        return connection;
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
