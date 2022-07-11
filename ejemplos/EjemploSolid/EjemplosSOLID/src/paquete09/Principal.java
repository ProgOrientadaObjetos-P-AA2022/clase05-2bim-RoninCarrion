/*
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete09;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());
        // -----------------------------------------
        APINetflix api2 = new APINetflix();
        api2.establecerApiKey("102392");

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());
    }
}
