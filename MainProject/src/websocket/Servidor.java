package websocket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Observable;

public class Servidor extends Observable implements Runnable{
    public ServerSocket servidor =null;
    public DataInputStream entrada;
    private static String password = "hola1234";
    public void stop() throws IOException{
        this.servidor.close();
    }
    
    @Override
    public void run() {
        try {
            servidor = new ServerSocket(6000);
        } catch (IOException ex) {
            System.out.println("Error al crear el Server Socket!");
        }
        while (true) {
            try {
                Socket socket = servidor.accept();
                entrada = new DataInputStream(socket.getInputStream());
                String mensaje = entrada.readUTF(); 
                this.setChanged();
                if(mensaje.equals(password)){
                    this.notifyObservers("true");
                }else{
                    this.notifyObservers("false");
                }
                this.clearChanged();
                socket.close();
            } catch (IOException ex) {
                System.out.println("Error en el servidor: "+ex.getMessage());                
            }            
        }
    }
}
