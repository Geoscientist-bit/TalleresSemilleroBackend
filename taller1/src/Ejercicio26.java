/*
 * 26.	Escribe un programa que pida al usuario una cadena y muestre cuántos caracteres tiene sin contar los espacios en blanco 
 */

import javax.swing.JOptionPane;

public class Ejercicio26 {
    String cadenaText;
    
    public void countCharacters() {
        //int contador = 0;
        int pos;
        cadenaText = JOptionPane.showInputDialog(null, "Ingrese el texto");
        cadenaText = cadenaText.replace(" ", "");
        pos = cadenaText.length();
        
        JOptionPane.showMessageDialog(null, " la cantidad de palabras es " + pos);
    }
}
