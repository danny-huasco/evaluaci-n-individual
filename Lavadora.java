/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.evaluacion2;

/**
 *
 * @author Daniel
 */
public class Lavadora extends Electrodomestico implements Usables{
    //implementar atributos y metodos
    int carga;

    public Lavadora() {
        super();
        this.carga = Usables.CARGADEFECTO;
    }

    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
        this.carga = Usables.CARGADEFECTO;
    }

    public Lavadora(int carga, double precioBase, String color, char consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public double precioFinal(){
        double precio;
        
        precio = super.precioFinal();
        if(this.carga>30){
            precio+=50;
        }
        return precio;
    }
    
}
