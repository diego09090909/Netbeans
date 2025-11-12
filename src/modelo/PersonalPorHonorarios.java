
package modelo;

/**
 *
 * @author diego
 */
public class PersonalPorHonorarios extends Personal {
    private int valorPorHora;

    public PersonalPorHonorarios() {
    }

    public PersonalPorHonorarios(int valorPorHora, String rut, String cargo, String appaterno, String apmaterno, String nombres, String fono, String direccion, String tipoHorario) {
        super(rut, cargo, appaterno, apmaterno, nombres, fono, direccion, tipoHorario);
        this.valorPorHora = valorPorHora;
    }

    public int getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(int valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return super.toString() + "PersonalPorHonorarios{" + "valorPorHora=" + valorPorHora + '}';
    }
     
}
