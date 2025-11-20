
package modelo;

import CRUD.RegistroPersonalPorContrato;
import java.util.Date;

/**
 *
 * @author diego
 */
public class PersonalPorContrato extends Personal{
    
   private int sueldo;
   private Date fechaDeInicio;
   private Date fechaDeTermino;
  

    public PersonalPorContrato() {
    }

    public PersonalPorContrato(int sueldo, Date fechaDeInicio, Date fechaDeTermino, String rut, String cargo, String nombre, String fono, String direccion, String tipoHorario, Date fechaNacimiento, boolean contratoIndefinido, boolean honorario) {
        super(rut, cargo, nombre, fono, direccion, tipoHorario, fechaNacimiento, contratoIndefinido, honorario);
        this.sueldo = sueldo;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeTermino = fechaDeTermino;
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

    @Override
    public String toString() {
        return "PersonalPorContrato{" + "sueldo=" + sueldo + ", fechaDeInicio=" + fechaDeInicio + ", fechaDeTermino=" + fechaDeTermino + '}';
    }
    

}