package co.edu.uniquindio.poo;

public class Vestimenta extends Producto{
    
    private String talla;
    private String color;
    private TipoPrenda tipoPrenda;

    public Vestimenta(String nombre,String codigo,double precio, TipoEstado estado, String talla, String color, TipoPrenda tipoPrenda){

        super(nombre, codigo, precio, estado);
        this.talla=talla;
        this.color=color;
        this.tipoPrenda=tipoPrenda;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(TipoPrenda tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    
}
