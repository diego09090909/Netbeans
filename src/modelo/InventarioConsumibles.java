package modelo;

import java.util.Date;

/**
 *
 * @author diego
 */
public class InventarioConsumibles extends Inventario {

    private String unidadMedida;
    private double costoUnitario;
    private Date fechaVencimiento;
    private String proveedor;

    public InventarioConsumibles() {
    }

    public InventarioConsumibles(String unidadMedida, double costoUnitario, Date fechaVencimiento, String proveedor, int idProducto, String codigo, String nombre, String descripcion, String tipo, int stockActual, int stockMinimo, String ubicacion, String estado) {
        super(idProducto, codigo, nombre, descripcion, tipo, stockActual, stockMinimo, ubicacion, estado);
        this.unidadMedida = unidadMedida;
        this.costoUnitario = costoUnitario;
        this.fechaVencimiento = fechaVencimiento;
        this.proveedor = proveedor;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

}
