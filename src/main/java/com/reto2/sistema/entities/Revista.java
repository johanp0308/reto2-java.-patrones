package com.reto2.sistema.entities;

import com.reto2.sistema.entities.util.TiposRevista;
import java.util.Objects;

public class Revista extends Recurso{
    
    private int numero;
    private TiposRevista tiposRevista;


    public Revista(int id, String titulo, boolean disponible, int numero) {
        super(id,titulo,disponible);

    }

    public Revista(int id, String titulo, boolean disponible, int numero, TiposRevista tiposRevista) {
        super(id,titulo,disponible);
        this.numero = numero;
        this.tiposRevista = tiposRevista;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TiposRevista getTiposRevista() {
        return this.tiposRevista;
    }

    public void setTiposRevista(TiposRevista tiposRevista) {
        this.tiposRevista = tiposRevista;
    }

    public Revista numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Revista tiposRevista(TiposRevista tiposRevista) {
        setTiposRevista(tiposRevista);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Revista)) {
            return false;
        }
        Revista revista = (Revista) o;
        return numero == revista.numero && Objects.equals(tiposRevista, revista.tiposRevista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, tiposRevista);
    }

    

    @Override
    public String toString() {
        return "{" +
            " id='" + super.getId() + "'"+
            " titulo='" + super.getTitulo() + "'" +
            " disponible='" + (super.getDisponible() == true ? "si" : "no") +"'"+
            " numero='" + getNumero() + "'" +
            ", tiposRevista='" + getTiposRevista() + "'" +
            "}";
    }
    

}
