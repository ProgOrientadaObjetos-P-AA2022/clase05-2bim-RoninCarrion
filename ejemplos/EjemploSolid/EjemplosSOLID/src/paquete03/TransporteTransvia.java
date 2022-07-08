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
public class TransporteTransvia {
    private String transvia;
    private double tarifa;
    
    public void establecerTransporteTransvia(String n){
        transvia = n;
    }
    
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    public String obtenerTransvia(){
        return  transvia;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
    
}
