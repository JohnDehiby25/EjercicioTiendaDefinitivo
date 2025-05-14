package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class DispositivoElectronico extends Producto implements IDescripcion{
    
    private String marca;
    private String modelo;
    private int garantiaMeses;

    public DispositivoElectronico(String nombre,String codigo,double precio, TipoEstado estado, String marca, String modelo, int garantiaMeses){

        super(nombre, codigo, precio, estado);

        this.marca=marca;
        this.modelo=modelo;
        this.garantiaMeses=garantiaMeses;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
    
    public void mostrarDescripcionDetallada(){

        JOptionPane.showMessageDialog(null, 
        "El dispositivo electronico es de marca " + this.marca + 
        "con modelo " + this.modelo + " y una garantia de " + this.garantiaMeses
        + " meses"
        
        );
    }
    
}
