/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();

        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();

        TransporteAereo m = new TransporteAereo();
        m.establecerAereo("Yahuarcuna");
        taxi.establecerTarifa();

        TransporteMaritimo a = new TransporteMaritimo();
        a.establecerTransporteMaritimo("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransvia tt = new TransporteTransvia();
        a.establecerTransporteMaritimo("24 de mayo");
        taxi.establecerTarifa();

        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransporteBus(bus);
        tipos.establecerTransporteTaxi(taxi);
        tipos.establecerTransvia(tt);
        tipos.establecerAereo(m);
        tipos.establecerMaritimo(a);
        tipos.establecerPromedioTarifas();

        System.out.printf("Promedio de Tarifas: %.2f",
                tipos.obtenerPromedioTarifas());

    }
}
