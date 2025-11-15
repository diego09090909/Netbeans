package modelo;

/**
 *
 * @author k-ort
 */
public class Inventario {

    protected int idProducto;
    protected String codigo;
    protected String nombre;
    protected String descripcion;
    protected String tipo; // ACTIVO o CONSUMIBLE
    protected int stockActual;
    protected int stockMinimo;
    protected String ubicacion;
    protected String estado; // DISPONIBLE, AGOTADO, INACTIVO

    // Constructor vacío
    public Inventario() {
    }

    // Constructor
    public Inventario(int idProducto, String codigo, String nombre, String descripcion, String tipo,
            int stockActual, int stockMinimo, String ubicacion, String estado) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
