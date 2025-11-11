package modelo;

/**
 *
 * @author diego
 */
public class Personal {

    private String rut;
    private String cargo;
    private String appaterno;
    private String apmaterno;
    private String nombres;
    private String fono;
    private String direccion;
    private int sueldo;
    private String contrato;

    public Personal() {
    }

    public Personal(String rut, String cargo, String appaterno, String apmaterno, String nombres, String fono, String direccion, int sueldo, String contrato) {
        this.rut = rut;
        this.cargo = cargo;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.nombres = nombres;
        this.fono = fono;
        this.direccion = direccion;
        this.sueldo = sueldo;
        this.contrato = contrato;
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

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Personal{" + "rut=" + rut + ", cargo=" + cargo + ", appaterno=" + appaterno + ", apmaterno=" + apmaterno + ", nombres=" + nombres + ", fono=" + fono + ", direccion=" + direccion + ", sueldo=" + sueldo + ", contrato=" + contrato + '}';
    }

}
