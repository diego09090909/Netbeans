package modelo;

/**
 *
 * @author k-ort
 */
public abstract class Producto {

    protected String idProducto;
    protected String nombre;
    protected int cantidad;
    protected int precio;

    public Producto() {
    }

    public Producto(String idProducto, String nombre, int cantidad, int precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }

}
