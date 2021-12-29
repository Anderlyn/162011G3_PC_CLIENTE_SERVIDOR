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
public class TresMonasos extends Sorteos {
    private String Modalidad;
    private int[] resultado;
    private int[] numeroJugado;

    
    public TresMonasos(){
        super();
    }

    public TresMonasos(String fecha) {
        super(fecha);
    }

    public TresMonasos(String fecha, String Modalidad, int[] numeroJugado) {
        super(fecha);
        this.Modalidad = Modalidad;
        this.numeroJugado = numeroJugado;
    }

    
    @Override
    public void calcularResultado(){
        this.resultado =  new int[3];
        this.resultado[0] = Utils.generarAleatorio(10);
        this.resultado[1] = Utils.generarAleatorio(10);
        this.resultado[2] = Utils.generarAleatorio(10);
    }
    
    @Override
    public String toString() {
        return "TresMonasos{" + "Modalidad=" + Modalidad + ", resultado=" + resultado + ", numeroJugado=" + numeroJugado + '}';
    }

    public String getModalidad() {
        return Modalidad;
    }

    public void setModalidad(String Modalidad) {
        this.Modalidad = Modalidad;
    }

    public int[] getResultado() {
        return resultado;
    }

    public void setResultado(int[] resultado) {
        this.resultado = resultado;
    }

    public int[] getNumeroJugado() {
        return numeroJugado;
    }

    public void setNumeroJugado(int[] numeroJugado) {
        this.numeroJugado = numeroJugado;
    }
    
    

    
    
    
}
