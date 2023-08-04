/*
 * 20.	Realiza un programa que solicite al usuario una cadena y luego invierta su orden 
 */

import javax.swing.JOptionPane;

public class Ejercicio20 {
    String cadena, cadenaInv = "";

    public void invertirOrdenCadena() {
        cadena = JOptionPane.showInputDialog(null, "Ingresa un texto");
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInv += cadena.charAt(i);

        }
        JOptionPane.showMessageDialog(null, "La cadena invertida es " + cadenaInv);
    }
    
}
