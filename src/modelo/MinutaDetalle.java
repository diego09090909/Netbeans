package modelo;


/**
 *
 * @author k-ort
 */
public class MinutaDetalle {

    private int idDetalle;
    private int idMinuta;
    private String comida; // ALMUERZO, DESAYUNO, etc.
    private String platoPrincipal;
    private String acompanamiento;
    private String postre;
    private String bebida;
    private String observaciones;

    public MinutaDetalle() {
    }

    public MinutaDetalle(int idDetalle, int idMinuta, String comida, String platoPrincipal, String acompanamiento, String postre, String bebida, String observaciones) {
        this.idDetalle = idDetalle;
        this.idMinuta = idMinuta;
        this.comida = comida;
        this.platoPrincipal = platoPrincipal;
        this.acompanamiento = acompanamiento;
        this.postre = postre;
        this.bebida = bebida;
        this.observaciones = observaciones;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdMinuta() {
        return idMinuta;
    }

    public void setIdMinuta(int idMinuta) {
        this.idMinuta = idMinuta;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getPlatoPrincipal() {
        return platoPrincipal;
    }

    public void setPlatoPrincipal(String platoPrincipal) {
        this.platoPrincipal = platoPrincipal;
    }

    public String getAcompanamiento() {
        return acompanamiento;
    }

    public void setAcompanamiento(String acompanamiento) {
        this.acompanamiento = acompanamiento;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
