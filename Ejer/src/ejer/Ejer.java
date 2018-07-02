/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.ir.SplitReturn;

/**
 *
 * @author ulacit
 */
public class Ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, int SplitReturn) {
          BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
       int sr = SplitReturn;
       String nombre;
       System.out.println("introduzca el nombre");
        try {
            nombre = sc.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Ejer.class.getName()).log(Level.SEVERE, null, ex);
        }
       System.out.println(SplitReturn); 
    }
    
}

   
