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

    private String nombreArchivo;
    private ObjectOutputStream salida; // envía los datos a un archivo
    private ArrayList<GeneradorPeliculas> lista;
    private String mensaje;

    public Principal2(String nombreArc, ArrayList<GeneradorPeliculas> re) {

        nombreArchivo = nombreArc;
        lista = re;

        establecerLista(); // obtener los valores (objetos)
        // que tiene el archivo.
        // System.out.println(obtenerListaProfesores().size());

 // fin de catch
    }

    public void establecerMensaje(String a) {
        mensaje = a;
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    // agrega generadors al archivo
    public void establecerSalida() {
        try {
            for (int i = 0; i < lista.size(); i++) {
                salida.writeObject(lista.get(i)); // envía el generador como salida  
            }

        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    // en el atributo listaProfesores obtenemos los generadors 
    // del archivo
    public void establecerLista() {
        Principal3 l = new Principal3(obtenerNombreArchivo());
        l.establecerListaGeneradorPeliculas();
        lista = l.obtenerListaGeneradorPeliculas();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerMensaje() {
        return mensaje;
    }

    public ArrayList<GeneradorPeliculas> obtenerLista() {
        return lista;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");

        } // fin de catch
    }
}
