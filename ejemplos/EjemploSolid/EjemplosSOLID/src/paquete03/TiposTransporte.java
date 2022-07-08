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
public class TiposTransporte {

    private double promedioTarifas;
    private TransporteTaxi ttaxi;
    private TransporteBus ttbus;
    private TransporteTransvia transvia;
    private TransporteAereo aereo;
    private TransporteMaritimo maritimo;

    public void establecerTransporteTaxi(TransporteTaxi taxi) {
        ttaxi = taxi;
    }

    public void establecerTransporteBus(TransporteBus a) {
        ttbus = a;
    }

    public void establecerTransvia(TransporteTransvia a) {
        transvia = a;
    }

    public void establecerAereo(TransporteAereo a) {
        aereo = a;
    }

    public void establecerMaritimo(TransporteMaritimo a) {
        maritimo = a;
    }

    public TransporteTaxi obtenerTransporteTaxi() {
        return ttaxi;
    }

    public TransporteBus obtenerTransporteBus() {
        return ttbus;
    }

    public double obtenerPromedioTarifas() {
        return promedioTarifas;
    }

    public TransporteTransvia obtenerTransvia() {
        return transvia;
    }

    public TransporteAereo obtenerAereo() {
        return aereo;
    }

    public TransporteMaritimo obtenerMaritimo() {
        return maritimo;
    }

    public void establecerPromedioTarifas() {
        promedioTarifas = (obtenerTransporteBus().obtenerTarifa()
                + obtenerTransporteTaxi().obtenerTarifa() + 
                obtenerTransvia().obtenerTarifa()+
                obtenerAereo().obtenerTarifa() + 
                obtenerMaritimo().obtenerTarifa())/5;

    }

}
