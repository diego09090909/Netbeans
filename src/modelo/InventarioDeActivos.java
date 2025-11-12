package modelo;

/**
 *
 * @author diego
 */
public class InventarioDeActivos extends Producto {

    private String tipoActivo;  // "utencilio de limpieza, utencilio de comida"

    public InventarioDeActivos() {
    }

    public InventarioDeActivos(String tipoActivo, String idProducto, String nombre, int cantidad, int precio) {
        super(idProducto, nombre, cantidad, precio);
        this.tipoActivo = tipoActivo;
    }

    public String getTipoActivo() {
        return tipoActivo;
    }

    public void setTipoActivo(String tipoActivo) {
        this.tipoActivo = tipoActivo;
    }

    @Override
    public String toString() {
        return "InventarioDeActivos{" + "tipoActivo=" + tipoActivo + '}';
    }

}
