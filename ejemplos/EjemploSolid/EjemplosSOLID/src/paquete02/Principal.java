/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        ArrayList <Persona> persona = new ArrayList<>();
        Persona a = new Persona("Ronin Carrión", 17);
        Persona b = new Persona("Daniel Burneo", 18);
        Persona c = new Persona("José Miguel Iñahuazo", 17);
        Persona d = new Persona("Gabriela Álvarez", 19);
        
        persona.add(a);
        persona.add(b);
        persona.add(c);
        persona.add(d);
        
        OperacionesEstudiantes op = new OperacionesEstudiantes();
        op.establecerEstudiante(persona);
        op.establecerPromedioEdades();
        
        System.out.println(op);
        
        
    }
}
