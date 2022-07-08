/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class TransporteAereo {
    private String aereo;
    private double tarifa;
    
    public void establecerAereo(String n){
        aereo = n;
    }
    
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    public String obtenerAereo(){
        return aereo;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
    
}
