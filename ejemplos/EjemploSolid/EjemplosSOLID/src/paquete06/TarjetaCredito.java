/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author ronni
 */
public class TarjetaCredito {

    private String nombre;
    private String codigo;
    private double cupoMaximo;

    public TarjetaCredito(String a, String b, double c) {
        nombre = a;
        codigo = b;
        cupoMaximo = c;
    }

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerCodigo(String a) {
        codigo = a;
    }

    public void establecerCupoMaximo(double a) {
        cupoMaximo = a;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCodigo() {
        return codigo;
    }

    public double obtenerCupoMaximo() {
        return cupoMaximo;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nTipo Tarjeta: %s\nCódigo:%s\nCupo Máximo:%.2f",
                nombre, codigo, cupoMaximo);
        return cadena;
    }

}
