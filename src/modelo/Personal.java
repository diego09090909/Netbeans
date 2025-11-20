package modelo;

import java.util.Date;

/**
 *
 * @author diego
 */
public abstract class Personal {

    private String rut;
    private String cargo;
    private String nombre;
    private String fono;
    private String direccion;
    private String tipoHorario;
    private Date fechaNacimiento;
    private boolean contratoIndefinido;
    private boolean honorario;

    public Personal() {
    }

    public Personal(String rut, String cargo, String nombre, String fono, String direccion, String tipoHorario, Date fechaNacimiento, boolean contratoIndefinido, boolean honorario) {
        this.rut = rut;
        this.cargo = cargo;
        this.nombre = nombre;
        this.fono = fono;
        this.direccion = direccion;
        this.tipoHorario = tipoHorario;
        this.fechaNacimiento = fechaNacimiento;
        this.contratoIndefinido = contratoIndefinido;
        this.honorario = honorario;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoHorario() {
        return tipoHorario;
    }

    public void setTipoHorario(String tipoHorario) {
        this.tipoHorario = tipoHorario;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isContratoIndefinido() {
        return contratoIndefinido;
    }

    public void setContratoIndefinido(boolean contratoIndefinido) {
        this.contratoIndefinido = contratoIndefinido;
    }

    public boolean isHonorario() {
        return honorario;
    }

    public void setHonorario(boolean honorario) {
        this.honorario = honorario;
    }

    @Override
    public String toString() {
        return "Personal{" + "rut=" + rut + ", cargo=" + cargo + ", nombre=" + nombre + ", fono=" + fono + ", direccion=" + direccion + ", tipoHorario=" + tipoHorario + ", fechaNacimiento=" + fechaNacimiento + ", contratoIndefinido=" + contratoIndefinido + ", honorario=" + honorario + '}';
    }

    
}
