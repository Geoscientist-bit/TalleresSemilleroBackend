/*
 *12.	Realiza un programa que pida al usuario un número entero y determine si es un número primo o no
 
 @author Jhon Edison Muñoz
  */

import javax.swing.JOptionPane;

public class Ejercicio12 {
    int num;

    public void determinarSiEsPrimo() {
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero"));
        
        if (num ==2 || num % 2 == 0) {      //segun la criba de Eratostenes
            JOptionPane.showMessageDialog(null,"El numero ingresado no es primo");
        } else {
            JOptionPane.showMessageDialog(null,"El numero ingresado es primo");
        }
        
    }
}
