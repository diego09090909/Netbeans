package modelo;

import java.util.Date;

/**
 *
 * @author diego
 */
public class Empresa {

    private String rut;
    private String nombre;
    private String fonoFijo;
    private int cantCasino;
    private int cantEmpleados;
    private String direccion;
    private boolean contratoIndefinido;
    private Date fechaInicio;
    private Date fechaTermino;

    public Empresa() {
    }

    public Empresa(String rut, String nombre, String fonoFijo, int cantCasino, int cantEmpleados, String direccion, boolean contratoIndefinido, Date fechaInicio, Date fechaTermino) {
        this.rut = rut;
        this.nombre = nombre;
        this.fonoFijo = fonoFijo;
        this.cantCasino = cantCasino;
        this.cantEmpleados = cantEmpleados;
        this.direccion = direccion;
        this.contratoIndefinido = contratoIndefinido;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFonoFijo() {
        return fonoFijo;
    }

    public void setFonoFijo(String fonoFijo) {
        this.fonoFijo = fonoFijo;
    }

    public int getCantCasino() {
        return cantCasino;
    }

    public void setCantCasino(int cantCasino) {
        this.cantCasino = cantCasino;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isContratoIndefinido() {
        return contratoIndefinido;
    }

    public void setContratoIndefinido(boolean contratoIndefinido) {
        this.contratoIndefinido = contratoIndefinido;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    @Override
    public String toString() {
        return "Empresa{" + "rut=" + rut + ", nombre=" + nombre + ", fonoFijo=" + fonoFijo + ", cantCasino=" + cantCasino + ", cantEmpleados=" + cantEmpleados + ", direccion=" + direccion + ", contratoIndefinido=" + contratoIndefinido + ", fechaInicio=" + fechaInicio + ", fechaTermino=" + fechaTermino + '}';
    }

   

    
    
    

}
