/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorteos;

import java.util.Random;

/**
 *
 * @author Davis
 */
public class Utils {
    static Random aleatorio = new Random();
    static public int generarAleatorio(int tope){
        return aleatorio.nextInt(tope);
    }
}
