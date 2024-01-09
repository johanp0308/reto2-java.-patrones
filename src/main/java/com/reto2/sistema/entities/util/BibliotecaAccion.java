package com.reto2.sistema.entities.util;

import com.reto2.sistema.entities.Recurso;

public interface BibliotecaAccion {
    void prestarRecurso(int id);
    void devolverRecurso(int id);
    Recurso buscarRecursoPorTitulo(String titulo);
    Recurso buscarRecursoPorId(int id);
    void agregarRecurso(Recurso recurso);
}
