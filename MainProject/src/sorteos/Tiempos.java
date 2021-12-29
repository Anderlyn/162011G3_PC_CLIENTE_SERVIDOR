/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteos;

/**
 *
 * @author AMD
 */
public class Tiempos extends Sorteos {
    boolean reventado;
    int resultados[], numeroJugado[];
    
    public Tiempos(){
        super();
    }

    public Tiempos(String fecha) {
        super(fecha);
    }

    public Tiempos(String fecha, int[] numeroJugado, boolean reventado) {
        super(fecha);
        this.reventado = reventado;
        this.numeroJugado = numeroJugado;
    }

    public boolean isReventado() {
        return reventado;
    }

    public int[] getResultados() {
        return resultados;
    }

    public void setResultados(int[] resultados) {
        this.resultados = resultados;
    }

    public int[] getNumeroJugado() {
        return numeroJugado;
    }

    public void setNumeroJugado(int[] numeroJugado) {
        this.numeroJugado = numeroJugado;
    }


    @Override
    public String toString() {
        return "tiempos{" + "reventado=" + reventado + '}';
    }

    @Override
    public void calcularResultado() {
        this.resultados = new int[2];
        this.resultados[0] = Utils.generarAleatorio(100);
        this.resultados[1] = Utils.generarAleatorio(100);
    }
        
}
