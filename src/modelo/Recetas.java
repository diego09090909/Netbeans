package modelo;

/**
 *
 * @author diego
 */
public class Recetas {

    private String id_comida;
    private String nombre;
    private String tipo;
    private int preciPlato;

    public Recetas() {
    }

    public Recetas(String id_comida, String nombre, String tipo, int preciPlato) {
        this.id_comida = id_comida;
        this.nombre = nombre;
        this.tipo = tipo;
        this.preciPlato = preciPlato;
    }

    public String getId_comida() {
        return id_comida;
    }

    public void setId_comida(String id_comida) {
        this.id_comida = id_comida;
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

    public int getPreciPlato() {
        return preciPlato;
    }

    public void setPreciPlato(int preciPlato) {
        this.preciPlato = preciPlato;
    }

    @Override
    public String toString() {
        return "Recetas{" + "id_comida=" + id_comida + ", nombre=" + nombre + ", tipo=" + tipo + ", preciPlato=" + preciPlato + '}';
    }

}
