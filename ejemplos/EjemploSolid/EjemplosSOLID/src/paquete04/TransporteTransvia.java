/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.ArrayList;


/**
 *
 * @author reroes
 */
public class TransporteTransvia extends Transporte {
    private String transvia;
    
    
    public void establecerCooperativaTaxi(String n){
        transvia = n;
    }
    
    
    @Override
    public void establecerTarifa(){
        tarifa = 2 + 0.5;
    }
    
    
    public String obtenerCooperativaTaxi(){
        return transvia;
    }  
}
