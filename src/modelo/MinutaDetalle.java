package modelo;

/**
 *
 * @author k-ort
 */
public class MinutaDetalle {

    private Minuta idMinuta;
    private int idDetalle;
    private String comida; // ALMUERZO, DESAYUNO, etc.
    private String platoPrincipal;
    private String acompanamiento;
    private String postre;
    private String bebida;
    private String observaciones;

    public MinutaDetalle() {
    }

    public MinutaDetalle(Minuta idMinuta, int idDetalle, String comida, String platoPrincipal, String acompanamiento, String postre, String bebida, String observaciones) {
        this.idMinuta = idMinuta;
        this.idDetalle = idDetalle;
        this.comida = comida;
        this.platoPrincipal = platoPrincipal;
        this.acompanamiento = acompanamiento;
        this.postre = postre;
        this.bebida = bebida;
        this.observaciones = observaciones;
    }

    public MinutaDetalle(int idDetalle, String comida, String platoPrincipal, String acompanamiento, String postre, String bebida, String observaciones) {

        this.idDetalle = idDetalle;
        this.comida = comida;
        this.platoPrincipal = platoPrincipal;
        this.acompanamiento = acompanamiento;
        this.postre = postre;
        this.bebida = bebida;
        this.observaciones = observaciones;}

    public Minuta getIdMinuta() {
        return idMinuta;
    }

    public void setIdMinuta(Minuta idMinuta) {
        this.idMinuta = idMinuta;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
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

    @Override
    public String toString() {
        return "MinutaDetalle{" + "idMinuta=" + idMinuta + ", idDetalle=" + idDetalle + ", comida=" + comida + ", platoPrincipal=" + platoPrincipal + ", acompanamiento=" + acompanamiento + ", postre=" + postre + ", bebida=" + bebida + ", observaciones=" + observaciones + '}';
    }
    
    }
