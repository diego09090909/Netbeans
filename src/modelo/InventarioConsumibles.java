package modelo;

import java.util.Date;

/**
 *
 * @author diego
 */
public class InventarioConsumibles {

    private String idProducto;
    private String nombre;
    private int cantidad;
    private int precio;
    private Date fechaVencimiento;

    public InventarioConsumibles() {
    }

    public InventarioConsumibles(String idProducto, String nombre, int cantidad, int precio, Date fechaVencimiento) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
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

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "InventarioConsumibles{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", fechaVencimiento=" + fechaVencimiento + '}';
    }

}
