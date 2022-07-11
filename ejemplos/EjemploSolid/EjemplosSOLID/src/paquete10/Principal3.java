/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author ronni
 */
public class Principal3 {

    private ObjectInputStream entrada;
    private ArrayList<GeneradorPeliculas> generador;
    private String nombreArchivo;
    private String identificador;
    private GeneradorPeliculas GeneradorPeliculasBuscado;

    public Principal3(String n) {
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            try // abre el archivo
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } // fin de try
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo.");

            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerListaGeneradorPeliculas() {
        // 
        generador = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    GeneradorPeliculas registro = (GeneradorPeliculas) entrada.readObject();
                    generador.add(registro);
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo

                } catch (IOException e) {
                    System.err.println("Error al leer el archivo: " + e);
                } catch (ClassNotFoundException e) {
                    System.err.println("No se pudo crear el objeto: " + e);
                } catch (Exception e) {
                    System.err.println("No hay datos en el archivo: " + e);
                    break;
                }
            }
        }

    }

    public void establecerIdentificador(String a) {
        identificador = a;
    }


    public ArrayList<GeneradorPeliculas> obtenerListaGeneradorPeliculas() {
        return generador;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerIdentificador() {
        return identificador;
    }

    public GeneradorPeliculas obtenerGeneradorPeliculasBuscado() {
        return GeneradorPeliculasBuscado;
    }

    @Override
    public String toString() {
        String cadena = "\t\tLISTA DE PELICULAS\n";
        for (int i = 0; i < obtenerListaGeneradorPeliculas().size(); i++) {
            System.out.println(i);
            cadena = String.format("%s%s; %s; %s\n", cadena,
                    obtenerListaGeneradorPeliculas().get(i),
                    obtenerListaGeneradorPeliculas().get(i),
                    obtenerListaGeneradorPeliculas().get(i));
        }
        return cadena;
    }

    // cierra el archivo y termina la aplicación
    public void cerrarArchivo() {
        try // cierra el archivo y sale
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método cerrarArchivo
}
