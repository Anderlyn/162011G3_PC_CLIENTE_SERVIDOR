
package proyectoSorteoUsuarios;
import java.util.Random;


public class Administrador extends usuarioLoteria{
    private int idJunta;

    public Administrador() {
        super();
    }

    public Administrador(int numeroTelefono, String nombreUsuario, String correoElectronico,String tipoUsuario,
            int idJunta) {
        super(numeroTelefono, nombreUsuario, correoElectronico,tipoUsuario);
        this.idJunta=idJunta;
        
    }

    public int getIdJunta() {
        return idJunta;
    }

    public void setIdJunta(int idJunta) {
        this.idJunta = idJunta;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idJunta=" + idJunta + '}';
    }
    public int generarNloteriatiempos(){
        Random rd = new Random();
        int numero = rd.nextInt(100);
        return numero;    
    }
    public int generarSerieloteriaLotto(){
        Random rd = new Random();
        int numero = rd.nextInt(1000);
        return numero;  
    }
    
    public boolean generarReventadolotto(){
        Random numAleatorio = new Random();
        boolean reventado = numAleatorio.nextBoolean();
        return reventado;        
    }
   
    public int publicarR3Monasos(){
        Random rd = new Random();
        int numero = rd.nextInt(999);
        return numero;
    }
    
        
}
