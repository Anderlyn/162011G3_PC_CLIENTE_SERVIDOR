/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteos;

import java.util.Random;

/**
 *
 * @author AMD
 */
public class Lotto extends Sorteos{
    private int resultado, numeroJugado;    
    public Lotto(){
        super();
    }


    public Lotto(String fecha){
        super(fecha);
    }
    
    public Lotto(String fecha, int numeroJugado) {
       super(fecha);
        this.numeroJugado = numeroJugado;
    }
    
    

    @Override
    public void calcularResultado(){
        this.resultado = Utils.generarAleatorio(100);
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getNumeroJugado() {
        return numeroJugado;
    }

    public void setNumeroJugado(int numeroJugado) {
        this.numeroJugado = numeroJugado;
    }

    @Override
    public String toString() {
        return "Lotto{" + "resultado=" + resultado + ", numeroJugado=" + numeroJugado + '}';
    }
    
    
      
}
