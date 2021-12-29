/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websocket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author als_trash
 */
public class Cliente implements Runnable {
    private String password;
    public Cliente(String password){
        this.password = password;
    }
    
    @Override
    public void run() {
        try {
            Socket sc = new Socket("127.0.0.1", 6000);
            DataOutputStream out=new DataOutputStream(sc.getOutputStream());
            out.writeUTF(this.password);
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
