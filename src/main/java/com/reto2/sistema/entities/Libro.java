package com.reto2.sistema.entities;
import java.util.Objects;

public class Libro extends Recurso{
    
    private String autor;


    public Libro() {
    }

    public Libro(int id,String titulo,boolean disponible,String autor) {
        super(id,titulo,disponible);
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Libro autor(String autor) {
        setAutor(autor);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) o;
        return Objects.equals(autor, libro.autor);
    }


    public Libro(String autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    

    @Override
    public String toString() {
        return "{" +
            " id='" + super.getId() + "'"+
            " titulo='" + super.getTitulo() + "'" +
            " disponible='" + (super.getDisponible() == true ? "si" : "no") +"'"+
            " autor='" + getAutor() + "'" +
            "}";
    }
    

}
