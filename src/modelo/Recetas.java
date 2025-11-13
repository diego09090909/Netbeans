package modelo;

import java.util.Date;

/**
 *
 * @author diego
 */
public class Recetas {

    private int id;
    private String nombre;
    private String tipo;
    private int precioPlato;
    private Date fechaCreacion;
    private boolean activo;

    public Recetas() {
    }

    public Recetas(int id, String nombre, String tipo, int precioPlato, Date fechaCreacion, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioPlato = precioPlato;
        this.fechaCreacion = fechaCreacion;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecioPlato() {
        return precioPlato;
    }

    public void setPrecioPlato(int precioPlato) {
        this.precioPlato = precioPlato;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Recetas{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", precioPlato=" + precioPlato + ", fechaCreacion=" + fechaCreacion + ", activo=" + activo + '}';
    }
    

  

}
