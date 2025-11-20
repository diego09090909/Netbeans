package modelo;

/**
 *
 * @author k-ort
 */
public class MinutaDetalleIngredientes {

    private Minuta idMinuta;
    private MinutaDetalle idDetalle;
    private int idIngrediente;
    private double cantidad;
    private String unidadMedida;

    public MinutaDetalleIngredientes() {
    }

    public MinutaDetalleIngredientes(Minuta idMinuta, MinutaDetalle idDetalle, int idIngrediente, double cantidad, String unidadMedida) {
        this.idMinuta = idMinuta;
        this.idDetalle = idDetalle;
        this.idIngrediente = idIngrediente;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
    }

    public Minuta getIdMinuta() {
        return idMinuta;
    }

    public void setIdMinuta(Minuta idMinuta) {
        this.idMinuta = idMinuta;
    }

    public MinutaDetalle getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(MinutaDetalle idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
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

    @Override
    public String toString() {
        return "MinutaDetalleIngredientes{" + "idMinuta=" + idMinuta + ", idDetalle=" + idDetalle + ", idIngrediente=" + idIngrediente + ", cantidad=" + cantidad + ", unidadMedida=" + unidadMedida + '}';
    }

}
