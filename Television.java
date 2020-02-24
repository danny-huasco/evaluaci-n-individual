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
public class Television extends Electrodomestico implements Usables {
    //implementar atributos y metodos
    int resolucion;
    boolean sintTDT;

    public Television() {
        super();
        this.resolucion = 20;
        this.sintTDT=false;
    }

    public Television(double precioBase, int peso) {
        super(precioBase, peso);
        this.color = Usables.COLORDEFECTO;
        this.consumoEnergetico= Usables.CONSUMODEFECTO;
        this.resolucion = 20;
        this.sintTDT=false;
    }

    public Television(int resolucion, boolean sintTDT, double precioBase, String color, char consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintTDT = sintTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintTDT() {
        return sintTDT;
    }

    public void setSintTDT(boolean sintTDT) {
        this.sintTDT = sintTDT;
    }
    
    @Override
     public double precioFinal(){
        double precio;
        
        precio = super.precioFinal();
        if(this.resolucion>40){
            precio+= precio*0.3;
        }
        
        if(this.sintTDT == true){
            precio+=50;
        }            
            
        return precio;
    }
}
