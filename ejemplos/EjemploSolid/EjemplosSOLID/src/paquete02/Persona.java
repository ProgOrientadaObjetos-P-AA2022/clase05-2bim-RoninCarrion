/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String n, int e) {
        nombre = n;
        edad = e;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerEdad(int n) {
        edad = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }
}
