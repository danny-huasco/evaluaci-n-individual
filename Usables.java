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
public interface Usables {
    //uso de constantes y metodo precioFinal()
    String COLORDEFECTO = "BLANCO";
    char CONSUMODEFECTO = 'F';
    double PRECIODEFECTO = 100;
    int PESODEFECTO = 5;
    int CARGADEFECTO = 5;
    enum COLOR{BLANCO, NEGRO, ROJO, AZUL, GRIS}
    
    public double precioFinal();
}
