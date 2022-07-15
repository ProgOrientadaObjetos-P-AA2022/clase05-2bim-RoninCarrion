/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ronni
 */
public class Principal2 {

    public static void main(String[] args) {
        String nombre = "C:\\Users\\ronni\\OneDrive\\Escritorio\\"
                + "Pelis.txt";

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

        try {
            ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(nombre));
            for (GeneradorPeliculas a:generador) {
                archivo.writeObject(a);   
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error\n" + e);
        }

    }
}
