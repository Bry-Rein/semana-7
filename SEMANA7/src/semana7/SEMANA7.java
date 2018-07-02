/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class SEMANA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int miArray1[] = new int [10];
        int miArray2[] = new int [10];
        int miArray3[] = new int [10];
        
       for (int i= 0; i < miArray1.length; i++){
           
           miArray1[i]= random.nextInt(99);
           miArray2[i]= random.nextInt(99);
           miArray3[i]= (miArray1[i])*(miArray2[i]);
       }
   
    System.out.println("Arreglo1:" + Arrays.toString(miArray1));
    System.out.println("Arreglo2:" + Arrays.toString(miArray2));
    System.out.println("Arreglo3:" + Arrays.toString(miArray3));
    
    }
}

