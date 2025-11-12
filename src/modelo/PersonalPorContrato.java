
package modelo;

import java.util.Date;

/**
 *
 * @author diego
 */
public class PersonalPorContrato extends Personal{
    
   private int sueldo;
   private Date fechaDeInicio;
   private Date fechaDeTermino;
   private boolean esIndefinido;

    public PersonalPorContrato() {
    }

    public PersonalPorContrato(int sueldo, Date fechaDeInicio, Date fechaDeTermino, boolean esIndefinido, String rut, String cargo, String appaterno, String apmaterno, String nombres, String fono, String direccion, String tipoHorario) {
        super(rut, cargo, appaterno, apmaterno, nombres, fono, direccion, tipoHorario);
        this.sueldo = sueldo;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeTermino = fechaDeTermino;
        this.esIndefinido = esIndefinido;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Date getFechaDeTermino() {
        return fechaDeTermino;
    }

    public void setFechaDeTermino(Date fechaDeTermino) {
        this.fechaDeTermino = fechaDeTermino;
    }

    public boolean isEsIndefinido() {
        return esIndefinido;
    }

    public void setEsIndefinido(boolean esIndefinido) {
        this.esIndefinido = esIndefinido;
    }

    @Override
    public String toString() {
        return super.toString() + "PersonalPorContrato{" + "sueldo=" + sueldo + ", fechaDeInicio=" + fechaDeInicio + ", fechaDeTermino=" + fechaDeTermino + ", esIndefinido=" + esIndefinido + '}';
    }
   
}
