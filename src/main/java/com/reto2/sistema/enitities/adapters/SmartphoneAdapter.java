package com.reto2.sistema.enitities.adapters;

import com.reto2.sistema.enitities.Smartphone;
import com.reto2.sistema.enitities.asbtracs.DispositivoManipulacionTV;

public class SmartphoneAdapter extends DispositivoManipulacionTV{

    Smartphone smartphone;

    public SmartphoneAdapter(){
        this.smartphone = new Smartphone();
    }


    @Override
    public void encender() {
        smartphone.iniciarAplicacion();
        smartphone.escanearDispositivosEnLaRed();
        smartphone.selecionarDispositivo();
        smartphone.iniciarDispositivo();
    }

    @Override
    public void apagar() {
        smartphone.detenerDispositivo();
    }

    @Override
    public void manipularVolumen() {
        smartphone.manipularVolumen();
    }

    @Override
    public void cambiarEntrada() {
        smartphone.iniciarAplicacion();
    }
    
}
