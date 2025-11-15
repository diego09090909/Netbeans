package modelo;

import java.sql.Date;

/**
 *
 * @author diego
 */
public class InventarioDeActivos extends Inventario {

    private String marca;
    private String modelo;
    private String numeroSerie;
    private java.sql.Date fechaAdquisicion;
    private double valorInicial;
    private int vidaUtil;
    private String responsable;

    public InventarioDeActivos() {
    }

    public InventarioDeActivos(String marca, String modelo, String numeroSerie, Date fechaAdquisicion, double valorInicial, int vidaUtil, String responsable, int idProducto, String codigo, String nombre, String descripcion, String tipo, int stockActual, int stockMinimo, String ubicacion, String estado) {
        super(idProducto, codigo, nombre, descripcion, tipo, stockActual, stockMinimo, ubicacion, estado);
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.fechaAdquisicion = fechaAdquisicion;
        this.valorInicial = valorInicial;
        this.vidaUtil = vidaUtil;
        this.responsable = responsable;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

}
