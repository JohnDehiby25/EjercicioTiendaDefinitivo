package co.edu.uniquindio.poo;

public abstract class Producto {
    
    protected String nombre;
    protected String codigo;
    protected double precio;
    protected TipoEstado estado;

    public Producto(String nombre,String codigo,double precio, TipoEstado estado){

        this.nombre=nombre;
        this.codigo=codigo;
        this.precio=precio;
        this.estado=estado;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoEstado getEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }
    
}
