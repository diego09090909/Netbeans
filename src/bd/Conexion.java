package bd;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static boolean mensajeMostrado = false; // ✅ Controla si ya se mostró el mensaje
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

            if (!mensajeMostrado) {
                JOptionPane.showMessageDialog(null, "Conexión exitosa!");
                mensajeMostrado = true;
            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión... " + e.getMessage());
        }

        return connection;
    }
}

