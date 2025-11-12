
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author diego
 */
public class Conexion {
    
        public Connection obtenerConexion() {
        
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ bd_produccion_casino", "root","");
            
            System.out.println("Conexion exitosa!");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro de conexion " + e.getMessage());
        }
        return connection;
    }
    
    
}
