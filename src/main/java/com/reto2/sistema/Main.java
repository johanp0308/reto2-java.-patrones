package com.reto2.sistema;

import com.reto2.sistema.enitities.ControlInflarojo;
import com.reto2.sistema.enitities.PanelTV;
import com.reto2.sistema.enitities.adapters.SmartphoneAdapter;
import com.reto2.sistema.enitities.asbtracs.DispositivoManipulacionTV;

public class Main {
    public static void main(String[] args) {
        DispositivoManipulacionTV dispositivo1 = new PanelTV();
        DispositivoManipulacionTV dispositivo2 = new ControlInflarojo();
        DispositivoManipulacionTV dispositivo3 = new SmartphoneAdapter();

        System.out.println("-----------Panel TV--------------");
        dispositivo1.encender();
        dispositivo1.apagar();
        System.out.println("--------Control Inflarojo--------");
        dispositivo2.encender();
        dispositivo2.apagar();
        System.out.println("----------Smarth Phone----------");
        dispositivo3.encender();
        dispositivo3.apagar();
        System.out.println("---------------------------------");

    }
}