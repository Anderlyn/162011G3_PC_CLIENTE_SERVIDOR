package proyectoSorteoUsuarios;

import java.util.Random;
import sorteos.Utils;


public class Jugador extends usuarioLoteria {

    private int tarjetaCredito;
    private int sinpeMovil;
    private float Credito=0;

    public Jugador() {
        super();
    }


    public Jugador(int numeroTelefono, String nombreUsuario, String correoElectronico,String tipoUsuario,
            int tarjetaCredito, int sinpeMovil) {
        super(numeroTelefono, nombreUsuario, correoElectronico,tipoUsuario);
        this.tarjetaCredito = tarjetaCredito;
        this.sinpeMovil = sinpeMovil;
        this.Credito = 0;
    }

    public int getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(int tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public int getSinpeMovil() {
        return sinpeMovil;
    }

    public void setSinpeMovil(int sinpeMovil) {
        this.sinpeMovil = sinpeMovil;
    }

    public float getCredito() {
        return Credito;
    }

    public void setCredito(float Credito) {
        this.Credito = Credito;
    }
    public int[] jugarTiempos(){
        int[] numero = new int[2];
        numero[0] = Utils.generarAleatorio(100);
        numero[1] = Utils.generarAleatorio(100);
        return numero;    
    }
    public int jugarLotto(){
        int num1 = Utils.generarAleatorio(100);
        return num1;  
    }
    public int[] jugarLoteriaNacional(){
        int[] numeros = new int[2];
        numeros[0] = Utils.generarAleatorio(1000);
        numeros[1] = Utils.generarAleatorio(100);
        return numeros;
    }
   
   
    public int[] jugar3Monasos(){
        int[] numero =  new int[3];
        numero[0] = Utils.generarAleatorio(10);
        numero[1] = Utils.generarAleatorio(10);
        numero[2] = Utils.generarAleatorio(10);
        return numero;
    }
    public void comprobarResultados(){
        
    }
    public float retirarFondos(){
        float fondos=getCredito();
    
        return fondos;
    }
   
}

    
    
    
