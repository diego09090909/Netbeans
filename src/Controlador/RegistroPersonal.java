
package Controlador;

/**
 *
 * @author k-ort
 */
public class RegistroPersonal {
    
    public boolean agregarPersonal(){
        try {
            
            
            
            return true;
            
        } catch (Exception e) {
            System.out.println("Error al agregar nuevo personal..." + e.getMessage());
            return false;
        }
    }
    
}
