/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        String nombre = "C:\\Users\\ronni\\OneDrive\\Escritorio\\"
                + "EscrituraPelis.txt";
        Escritura p2 = null;

        System.out.println("\n\tNETFLIX");

        ArrayList<GeneradorPeliculas> generador = new ArrayList<>();
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());
        generador.add(gp);

        System.out.println("---------------------------\n\tAMAZON MOVIE");

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());
        generador.add(gp2);
        System.out.println("---------------------------\n\tSTAR PLUS");

        APIStarPlus api3 = new APIStarPlus();
        api3.establecerApiKey("123455");

        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println(gp3.obtenerUrl());
        generador.add(gp3);

        System.out.println("---------------------------\n\tDIRECTV GO");

        APIDirectvGo api4 = new APIDirectvGo();
        api4.establecerApiKey("123455");

        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println(gp4.obtenerUrl());
        generador.add(gp4);

        // ------Escritura de Archivos------
        for (int i = 0; i < generador.size(); i++) {
            p2 = new Escritura(nombre, generador.get(i));
            p2.establecerRegistro(generador.get(i));
            p2.establecerSalida();
        }
        p2.cerrarArchivo();
        Lectura p3 = new Lectura(nombre);

        p3.establecerListaGeneradorPeliculas();
        System.out.println(p3);
        p3.cerrarArchivo();

    }

}
