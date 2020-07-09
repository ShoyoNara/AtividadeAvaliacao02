
package atividade02;

import javax.swing.JOptionPane;

/**
 *
 * @author samuc
 */
public class Atividade02 {

    /**
     * Crie um algoritmo que leia um número inteiro e mostre como resultado o 
     * dobro de um número caso ele seja positivo e o seu triplo caso seja 
     * negativo, mostre o resultado o resultado.
     */
    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor do numerozinho: "));
        
        
        if(numero >= 0){
            
            numero = numero * 2;
            
            JOptionPane.showMessageDialog(null, "O valor do numerozinho foi positivo, então ele sera Dobrado e seu valor final foi de: "+numero);
            
        }else{
            numero = numero * 3;
            
            JOptionPane.showMessageDialog(null, "O Valor do numerozinho inserido foi negativo, então seu valor sera Triplicado e seu valor final será de: "+numero);
        }
        
        
        
        
        
        
        
        
        
    }
    
}
