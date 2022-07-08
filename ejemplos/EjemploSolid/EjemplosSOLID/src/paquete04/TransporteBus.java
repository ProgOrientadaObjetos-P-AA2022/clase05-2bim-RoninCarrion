/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class TransporteBus extends Transporte {

    private String cooperativaBus;

    public void establecerCooperativaBus(String n) {
        cooperativaBus = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }

    public String obtenerCooperativaBus() {
        return cooperativaBus;
    }

}
