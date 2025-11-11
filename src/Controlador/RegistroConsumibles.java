
package Controlador;

/**
 *
 * @author k-ort
 */
public class RegistroConsumibles {
    
        public boolean agregarConsumibles(){
        try {
            
            
            
            return true;
            
        } catch (Exception e) {
            System.out.println("Error al agregar nuevo consumible..." + e.getMessage());
            return false;
        }
    }
    
    
}
