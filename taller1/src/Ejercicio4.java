/*
 *4.	Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad. 
 */

import javax.swing.JOptionPane;

public class Ejercicio4 {
    String edad;
    int edadConv;

    public void calcularEdad(){
        edadConv = Integer.parseInt(edad);
        if (edadConv >= 18) {
            JOptionPane.showMessageDialog(null, "Usted es mayor de edad");
        } else {
            JOptionPane.showMessageDialog(null, "Es menor de edad");
        }
    }
}
