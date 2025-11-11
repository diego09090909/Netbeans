
package Controlador;

/**
 *
 * @author k-ort
 */
public class RegistroActivos {
    
        public boolean agregarActivo(){
        try {
            
            
            
            return true;
            
        } catch (Exception e) {
            System.out.println("Error al agregar nuevo activo..." + e.getMessage());
            return false;
        }
    }
    
    
}
