/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import javax.swing.JOptionPane;

/**
 *
 * @author rgonzalezrasero
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                float numero1;
                float numero2;
                
     numero1 = Float.parseFloat(JOptionPane.showInputDialog("numero1"));
     numero2 = Float.parseFloat(JOptionPane.showInputDialog("numero2"));
                
                float suma=numero1+numero2;
                float resta=numero1-numero2;
                float multiplicacion=numero1*numero2;
                float division=numero1/numero2;
       
               
                
  System.out.println("suma = "+ suma +" resta = "+ resta +" multiplicacion ="+ multiplicacion +" division ="+division);
     
     
           
     
    }
    
}
