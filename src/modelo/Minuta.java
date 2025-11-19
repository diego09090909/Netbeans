package modelo;

import java.util.Date;

/**
 *
 * @author k-ort
 */
public  class Minuta {

    protected int idMinuta;
    protected String tipo; // DIARIA o MENSUAL
    protected Date fecha;
    protected String nombre;
    protected String descripcion;

    public Minuta() {
    }

    public Minuta(int idMinuta, String tipo, Date fecha, String nombre, String descripcion) {
        this.idMinuta = idMinuta;
        this.tipo = tipo;
        this.fecha = fecha;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdMinuta() {
        return idMinuta;
    }

    public void setIdMinuta(int idMinuta) {
        this.idMinuta = idMinuta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
