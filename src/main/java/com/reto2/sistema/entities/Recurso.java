package com.reto2.sistema.entities;
import java.util.Objects;

public abstract class Recurso {
    private int id;
    private String titulo;
    private boolean disponible;

    public Recurso() {
    }

    public Recurso(int id, String titulo, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Recurso id(int id) {
        setId(id);
        return this;
    }

    public Recurso titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    public Recurso disponible(boolean disponible) {
        setDisponible(disponible);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Recurso)) {
            return false;
        }
        Recurso recurso = (Recurso) o;
        return id == recurso.id && Objects.equals(titulo, recurso.titulo) && disponible == recurso.disponible;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, disponible);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", disponible='" + isDisponible() + "'" +
            "}";
    }
    
}
