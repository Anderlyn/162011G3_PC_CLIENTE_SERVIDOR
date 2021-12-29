
package sorteos;


public class Sorteos implements CalculoResultados {
    private int numeroGanador;
    private String fecha;

    public Sorteos(){
        
    }
    
    public Sorteos(String fecha){
        this.fecha=fecha;
    
    }
    public int getNumeroGanador() {
        return numeroGanador;
    }

    public void setNumeroGanador(int numeroGanador) {
        this.numeroGanador = numeroGanador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "sorteos{" + "numeroGanador=" + numeroGanador + ", serieGanador=" + ", fecha=" + fecha + ", reventado=" + '}';
    }

    @Override
    public void calcularResultado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
