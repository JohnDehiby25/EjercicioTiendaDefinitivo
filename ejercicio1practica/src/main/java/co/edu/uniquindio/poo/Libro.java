package co.edu.uniquindio.poo;
import javax.swing.*;

public class Libro extends Producto implements IDescripcion{
    
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(String nombre,String codigo,double precio, TipoEstado estado, String titulo, String autor, int numeroPaginas){

        super(nombre, codigo, precio, estado);

        this.titulo=titulo;
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarDescripcionDetallada() {
        JOptionPane.showMessageDialog(null,
        "El libro tiene de título: " + this.titulo + "\n" +
        "Autor: " + this.autor + "\n" +
        "Numero de Paginas: " + this.numeroPaginas);
    }

    
}
