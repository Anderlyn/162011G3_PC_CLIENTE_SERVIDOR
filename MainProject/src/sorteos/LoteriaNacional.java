
package sorteos;

public class LoteriaNacional extends Sorteos {
    int[] numeroJugado;
    int[] resultado;
    
    public LoteriaNacional(){
        super();
    }

    public LoteriaNacional(String fecha) {
        super(fecha);
    }

    public LoteriaNacional(String fecha, int[] numeroJugado){
        super(fecha);
        this.numeroJugado = numeroJugado;
    }

    public int[] getNumeroJugado() {
        return numeroJugado;
    }

    public void setNumeroJugado(int[] numeroJugado) {
        this.numeroJugado = numeroJugado;
    }

    public int[] getResultado() {
        return resultado;
    }

    public void setResultado(int[] resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "LoteriaNacional{" + "numeroJugado=" + numeroJugado + ", resultado=" + resultado + '}';
    }

    @Override
    public void calcularResultado() {
        this.resultado = new int[2];
        this.resultado[0] = Utils.generarAleatorio(1000);
        this.resultado[1] = Utils.generarAleatorio(100);
    }

    
    
    
        
}
