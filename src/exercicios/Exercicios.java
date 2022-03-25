    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Exercicios {

    /**
     * @param args the command line arguments
     */
 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        System.out.println ("Digite um número inteiro: ");
        Scanner entrada = new Scanner (System.in);
        int num1 = entrada.nextInt();
        
        
            int i = 1;
            int resultado = 0;
            
            while (i <= num1){
                resultado += i;
                i = i + 1;
  
                System.out.println (resultado);
            }
            
            
            
        
        
        
        
        
    }
    
}
