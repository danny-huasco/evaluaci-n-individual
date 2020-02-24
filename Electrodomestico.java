/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.evaluacion2;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public abstract class Electrodomestico implements Usables{
    double precioBase;
    String color;
    char consumoEnergetico;
    int peso;

    public Electrodomestico() {
        this.color = Usables.COLORDEFECTO;
        this.consumoEnergetico = Usables.CONSUMODEFECTO;
        this.peso = Usables.PESODEFECTO;
        this.precioBase = Usables.PRECIODEFECTO;
    }

    public Electrodomestico(double precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = Usables.COLORDEFECTO;
        this.peso = Usables.PESODEFECTO;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = this.comprobarColor(color);
        this.consumoEnergetico = this.comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    private char comprobarConsumoEnergetico(char letra){
        if(letra!='A' && letra!='B' && letra!='C' && letra!='D' && letra!='E' && letra!='F'){
            if(letra!='a' && letra!='b' && letra!='c' && letra!='d' && letra!='e' && letra!='f'){
                letra = Usables.CONSUMODEFECTO; 
            }
        }
        return letra;
    }
    
    private String comprobarColor(String color){
        color = color.toUpperCase();
       
        for (COLOR value : Usables.COLOR.values()) {
            if (value.toString().equals(color)) {
                return color;            
            }//else... retornar color por defecto
        }        
        return color;
    }
    @Override
    public double precioFinal(){
        Scanner sc = new Scanner(System.in);
        String letra;
        int kilos;
        System.out.println("ingrese letra descriptiva de consumo energetico");
        letra = sc.next();
        letra = letra.toUpperCase();
        switch(letra){
            case "A":
                this.precioBase+= 100;
                break;
            case "B":
                this.precioBase+= 80;
                break;
            case "C":
                this.precioBase+= 60;
                break;
            case "D":
                this.precioBase+= 50;
                break;
            case "E":
                this.precioBase+= 30;
                break;
            case "F":
                this.precioBase+= 10;
                break;
            default:
                System.out.println("opción incorrecta, se usará valor por defecto");
                this.consumoEnergetico=Usables.CONSUMODEFECTO;
                this.precioBase+= 10;
        }
        System.out.println("ingrese peso en kg del articulo");
        kilos = sc.nextInt();
        
        if(kilos>=0 && kilos<=19){
            this.precioBase+=10;                           
        }else{
            if(kilos>=20 && kilos<=49){
                this.precioBase+=50;
            }else{
                if(kilos>=50 && kilos<=79){
                    this.precioBase+=80;
                }else{
                    if(kilos>=80){
                        this.precioBase+=100;
                    }
                }
            }
        }
     return precioBase;   
    }
    
}
