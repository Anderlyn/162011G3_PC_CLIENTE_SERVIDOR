/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sorteos.Sorteos;
import sorteos.listaResultados;

/**
 *
 * @author als_trash
 */
public class HiloResultados extends Thread {
    private Sorteos sorteoGenerico;
    private AdministradorInicio frame = null;
    public HiloResultados(Sorteos sorteoGenerico){
        this.sorteoGenerico = sorteoGenerico;
    }
    public HiloResultados(Sorteos sorteoGenerico, AdministradorInicio frame){
        this.sorteoGenerico = sorteoGenerico;
        this.frame = frame;
    }
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            sorteoGenerico.calcularResultado();
            listaResultados.resultados.add(this.sorteoGenerico);
            if(this.frame != null){
                JOptionPane.showMessageDialog(this.frame, "Nuevo resultado añadido!");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloResultados.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    
}
