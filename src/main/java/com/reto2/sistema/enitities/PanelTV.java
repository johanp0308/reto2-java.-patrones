package com.reto2.sistema.enitities;

import com.reto2.sistema.enitities.asbtracs.DispositivoManipulacionTV;

public class PanelTV extends DispositivoManipulacionTV{

    @Override
    public void encender() {
        System.out.println("Encendiendo.");

    }

    @Override
    public void apagar() {
        System.out.println("Apagando.");

    }

    @Override
    public void manipularVolumen() {
        System.out.println("Manipular Volumen.");
    }

    @Override
    public void cambiarEntrada() {
        System.out.println("Entrada Cambiada.");
    }
    
}
