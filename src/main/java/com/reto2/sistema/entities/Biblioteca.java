package com.reto2.sistema.entities;

import java.util.ArrayList;
import java.util.List;

import com.reto2.sistema.entities.util.BibliotecaAccion;

public class Biblioteca implements BibliotecaAccion{
    
    private List<Recurso> listaRecursos;



    public Biblioteca() {
        this.listaRecursos = new ArrayList<>();
    }

    
    @Override
    public void prestarRecurso(int id) {
        Recurso recurso = buscarRecursoPorId(id);
        if(recurso != null){
            recurso.setDisponible(false);
        } 
    }

    @Override
    public void devolverRecurso(int id) {
        Recurso recurso = buscarRecursoPorId(id);
        if(recurso != null){
            recurso.setDisponible(true);
        }
    }
    
    @Override
    public Recurso buscarRecursoPorTitulo(String titulo) {
        for (Recurso recurso: listaRecursos) {
            if(recurso.getTitulo().equals(titulo)){
                return recurso;
            }
        }
        return null;
    }


    @Override
    public Recurso buscarRecursoPorId(int id) {
        for (Recurso recurso: listaRecursos) {
            if(recurso.getId() == id){
                return recurso;
            }
        }
        return null;
    }


    @Override
    public void agregarRecurso(Recurso recurso) {
        if(recurso != null){
            listaRecursos.add(recurso);
        }else{
            System.out.println("Objeto vacio");
        }
    }



}
