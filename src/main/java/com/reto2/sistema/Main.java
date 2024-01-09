package com.reto2.sistema;

import com.reto2.sistema.entities.Biblioteca;
import com.reto2.sistema.entities.Libro;
import com.reto2.sistema.entities.Revista;
import com.reto2.sistema.entities.util.TiposRevista;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarRecurso(new Revista(0, "Papi rico", true, 1, TiposRevista.TECNOLOGIA));
        biblioteca.agregarRecurso(new Revista(1, "Papi sabroso", true, 1, TiposRevista.MODA));
        biblioteca.agregarRecurso(new Revista(2, "Papi loco", false, 1, TiposRevista.PROGRAMACION));
        biblioteca.agregarRecurso(new Revista(3, "Papi melo", false, 1, TiposRevista.FASHION));

        biblioteca.agregarRecurso(new Libro(4, "El viejo y el mar", false, "Marco Peolio"));
        biblioteca.agregarRecurso(new Libro(5, "Maria", false, "Jorge Isaac"));
        biblioteca.agregarRecurso(new Libro(6, "Forlaca", true, "Pumba"));
        biblioteca.agregarRecurso(new Libro(7, "El asolador", true, "Pachon"));


        
        System.out.println(biblioteca.buscarRecursoPorId(1));
        biblioteca.prestarRecurso(0);
        System.out.println(biblioteca.buscarRecursoPorTitulo("El viejo y el mar"));
        System.out.println(biblioteca.buscarRecursoPorId(0));
        
    }
}