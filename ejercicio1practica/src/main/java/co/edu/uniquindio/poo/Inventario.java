package co.edu.uniquindio.poo;

import java.util.*;
public class Inventario {
    private String lugar;
    private ArrayList<Producto> listProductos;

    public Inventario(String lugar){

        this.lugar=lugar;
        this.listProductos=new ArrayList<>();
    }
    public Producto buscarProductoPorCodigo(String codigo){
        for(Producto l: listProductos){
            if(l.getCodigo().equals(codigo)){
                return l;
            }
        }
        return null;
    }

    public boolean agregarProductos(String codigo){
        Producto producto = buscarProductoPorCodigo(codigo);
        if(producto == null){
            return false;
        }
        for(Producto p: listProductos){
            if(p.getCodigo().equals(codigo)){
                return false;
            }
        }
        listProductos.add(producto);
        return true;
    }

    public ArrayList<Vestimenta> listarProductosVestimenta(){
        ArrayList<Vestimenta> listaVestimentas = new ArrayList<>();
        for(Producto p :listProductos){
            if(p instanceof Vestimenta){
                listaVestimentas.add((Vestimenta) p);
            }
        }
        return listaVestimentas;
    }
    public ArrayList<Libro> listarProductosLibro(){
        ArrayList<Libro> listaLibros = new ArrayList<>();
        for(Producto p :listProductos){
            if(p instanceof Libro){
                listaLibros.add((Libro) p);
            }
        }
        return listaLibros;
    }
    public ArrayList<DispositivoElectronico> listarProductosDispositivosElectronicos(){
        ArrayList<DispositivoElectronico> listaDispositivoElectronicos = new ArrayList<>();
        for(Producto p :listProductos){
            if(p instanceof DispositivoElectronico){
                listaDispositivoElectronicos.add((DispositivoElectronico) p);
            }
        }
        return listaDispositivoElectronicos;
    }
    public double calcularValorTotalInvetarioDisponible(){
        double valorTotal=0;
        for(Producto p:listProductos){
            if(p.getEstado() == TipoEstado.DISPONIBLE){
                valorTotal+= p.getPrecio();
            }
        }
        return valorTotal;
    }
    public void informeporCategoria(){
        int cantidadLibros=0;
        double valorAcumuladoLibros=0;

        int cantidadVestimentas=0;
        double valorAcumuladoVestimentas=0;

        int cantidadDispositivosElectronicos=0;
        double valorAcumuladoDispositivosElectronicos=0;

        for(Producto p:listProductos){
            if(p instanceof Libro){
                valorAcumuladoLibros+=p.getPrecio();
                cantidadLibros++;
            }
            else if(p instanceof Vestimenta){
                valorAcumuladoVestimentas+=p.getPrecio();
                cantidadVestimentas++;
            }
            else if(p instanceof DispositivoElectronico){
                valorAcumuladoDispositivosElectronicos+=p.getPrecio();
                cantidadDispositivosElectronicos++;
            }

        }

        System.out.println("La cantidad de libros que hay es " + cantidadLibros + "con un precio acumulado de " + valorAcumuladoLibros + " pesos");

        System.out.println("La cantidad de Vestimentas que hay es " + cantidadVestimentas + "con un precio acumulado de " + valorAcumuladoVestimentas + " pesos");

        System.out.println("La cantidad de Dispositivos Electronicos que hay es " + cantidadDispositivosElectronicos + "con un precio acumulado de " + valorAcumuladoDispositivosElectronicos + " pesos");
    }

    public double descuentoProductosElectronicos(){

        final double descuento=0.20;
        int numeroMeses=8;
        double precioFinal=0;

        for(Producto p:listProductos){
            if(p instanceof DispositivoElectronico){
                DispositivoElectronico dispositivoElectronico = (DispositivoElectronico) p;

                if(dispositivoElectronico.getGarantiaMeses() > numeroMeses){
                    precioFinal+= dispositivoElectronico.getPrecio()-(dispositivoElectronico.getPrecio()*descuento);
                }
            }
        }
        return precioFinal;

    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(ArrayList<Producto> listProductos) {
        this.listProductos = listProductos;
    }
    
}
