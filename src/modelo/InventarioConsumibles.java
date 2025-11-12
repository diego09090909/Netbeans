package modelo;

import java.util.Date;

/**
 *
 * @author diego
 */
public class InventarioConsumibles extends Producto {

    private Date fechaVencimiento;

    public InventarioConsumibles() {
    }

    public InventarioConsumibles(Date fechaVencimiento, String idProducto, String nombre, int cantidad, int precio) {
        super(idProducto, nombre, cantidad, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "InventarioConsumibles{" + "fechaVencimiento=" + fechaVencimiento + '}';
    }

}
