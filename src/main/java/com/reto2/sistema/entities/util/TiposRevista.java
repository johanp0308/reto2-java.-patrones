package com.reto2.sistema.entities.util;

public enum TiposRevista {
    
    MODA("moda"),TECNOLOGIA("tecnologia"),PROGRAMACION("programacion"),FASHION("fashions");

    private String tipo;

    private TiposRevista(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

}
