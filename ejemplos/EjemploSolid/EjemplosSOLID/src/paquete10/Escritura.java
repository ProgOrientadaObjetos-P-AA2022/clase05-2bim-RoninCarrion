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
public class Escritura {

    private String nombreArchivo;
    private ObjectOutputStream salida; // envía los datos a un archivo
    private GeneradorPeliculas registro;
    private ArrayList<GeneradorPeliculas> lista;
    private String mensaje;

    public Escritura(String nombreArc, GeneradorPeliculas re) {
        nombreArchivo = nombreArc;
        registro = re;
        establecerLista(); // obtener los valores (objetos)
                                    // que tiene el archivo.
        // System.out.println(obtenerListaProfesores().size());
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerLista().size() > 0) {
                for (int i = 0; i < obtenerLista().size(); i++) {
                    establecerRegistro(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }

    public void establecerMensaje(String a) {
        mensaje = a;
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    // agrega registros al archivo
    public void establecerRegistro(GeneradorPeliculas p) {
        registro = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registro); // envía el registro como salida
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerLista() {
        Lectura l = new Lectura(obtenerNombreArchivo());
        l.establecerListaGeneradorPeliculas();
        lista = l.obtenerListaPeliculas();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }

    public String obtenerMensaje() {
        return mensaje;
    }
    
    public ArrayList<GeneradorPeliculas> obtenerLista() {
        return lista;
    }

    public ObjectOutputStream obtenerSalida(){
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
