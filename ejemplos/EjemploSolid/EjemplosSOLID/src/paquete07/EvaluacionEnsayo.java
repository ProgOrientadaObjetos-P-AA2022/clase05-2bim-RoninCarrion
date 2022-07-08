/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;


/**
 *
 * @author reroes
 */
public class EvaluacionEnsayo extends Evaluacion{
    private int numeroProblemas;
    private double totalProblemas;
    
    public void establecerNumeroProblemas(int n){
        numeroProblemas = n;
    }
    
    public void establecerTotalProblemas(double n){
        totalProblemas = n;
    }
    
    public int obtenerNumeroProblemas(){
        return numeroProblemas;
    }
    
    public double obtenerTotalProblemas(){
        return totalProblemas;
    }
    
    
    public void establecerPromedioObjetivas(){
        throw new RuntimeException("Sin implementar establecerPromedioObjetivas");
    }
    
    public double obtenerPromedioObjetivas(){
        throw new RuntimeException("Sin implementar obtenerPromedioObjetivas");
    }
    
    public void establecerPromedioEnsayo(){
          
          promedioEnsayo = obtenerTotalProblemas()/obtenerNumeroProblemas();

    }
    
    public double obtenerPromedioEnsayo(){
          return promedioEnsayo;

    }
}
