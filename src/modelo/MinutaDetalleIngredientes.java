
package modelo;


/**
 *
 * @author k-ort
 */
public class MinutaDetalleIngredientes {

    private int idIngrediente;
    private int idDetalle;
    private int idProducto;
    private double cantidad;
    private String unidadMedida;

    public MinutaDetalleIngredientes() {
    }

    public MinutaDetalleIngredientes(int idIngrediente, int idDetalle, int idProducto, double cantidad, String unidadMedida) {
        this.idIngrediente = idIngrediente;
        this.idDetalle = idDetalle;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
    
    
}
