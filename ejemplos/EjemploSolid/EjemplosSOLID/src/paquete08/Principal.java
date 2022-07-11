/*
 * I — Interface segregation principle (Principio de segregación de interfaces)
 */
package paquete08;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        EvaluacionEnsayo ensayo = new EvaluacionEnsayo();
        ensayo.establecerNumeroProblemas(10);
        ensayo.establecerTotalProblemas(20);
        ensayo.establecerPromedioEnsayo();
        System.out.println(ensayo.obtenerPromedioEnsayo());
        
        EvaluacionObjetiva evaluacionObjetiva = new EvaluacionObjetiva();
        evaluacionObjetiva.establecerNumeroPreguntas(10);
        evaluacionObjetiva.establecerTotalPreguntas(30);
        evaluacionObjetiva.establecerPromedioObjetivas();
        System.out.println(evaluacionObjetiva.obtenerPromedioObjetivas());
        
    }
}
