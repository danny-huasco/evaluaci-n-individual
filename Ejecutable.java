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
public class Ejecutable {
    
    
    public static void main(String[] args){
 
        Electrodomestico[] array = new Electrodomestico[10];
        int acumT=0, acumL=0, acumE=0;
        for(int i=0; i<10; i++){
            if(i<5){
                array[i] = new Lavadora();
            }else{
                array[i] = new Television();
            }
        }
        
        for(int i=0;i<10;i++){
            System.out.println(array[i].precioFinal());            
        }
        
        for(int i=0;i<10;i++){
            acumE+= array[i].getPrecioBase();
            if(array[i] instanceof Lavadora){
                acumL+= array[i].getPrecioBase();
            }
            if(array[i] instanceof Television){
                acumT+= array[i].getPrecioBase();
            }
        }
        System.out.println("montos acumulados:");
        System.out.print("\nElectrodomesticos: "+ acumE);
        System.out.print("\nTelevisores: "+ acumT);
        System.out.print("\nLavadoras: "+ acumL);
    }
}