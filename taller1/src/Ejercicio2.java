/*
 * 2.	Escribe un programa que pida al usuario un número entero y determine si es par o impar.
 */

import javax.swing.JOptionPane;

public class Ejercicio2 {
    String num1;
    int numero1;    
    

    public void parImpar(String num1) {
        numero1 = Integer.parseInt(num1);        
        
        if (numero1 % 2 == 0) {
            //System.out.println("El numero " + numero1 + "es par");
            JOptionPane.showMessageDialog(null, "El numero " + numero1 + " es par");
        } else {
            //System.out.println("El numero " + numero1 + "no es par");
            JOptionPane.showMessageDialog(null, "El numero " + numero1 + " no es par");
        }

       

    }

}
