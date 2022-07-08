/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

// Cambios - 8 - julio - 2022

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        ArrayList <Transporte> t = new ArrayList<>();
        
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransvia tv = new TransporteTransvia();
        tv.establecerCooperativaTaxi("EcoEcoLive");
        tv.establecerTarifa();
        
        t.add(bus);
        t.add(taxi);
        t.add(tv);
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(t);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        
    }
}
