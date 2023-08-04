/*
 * 21.	Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella 
 */

import javax.swing.JOptionPane;

public class Ejercicio21 {
    String text;
    char letter;
    
    public void searchWord() {
        int count = 0;
        int pos = 0;
        
        text = JOptionPane.showInputDialog(null, "Ingrese un texto");
        letter = JOptionPane.showInputDialog(null, "Ingrese el caracter").charAt(0);
        pos = text.indexOf(letter);
        
        while (pos != -1) {
            count++;
            pos = text.indexOf(letter, ++pos); // +1 para que empiece a en la posicion siguiente
        }
        
        JOptionPane.showMessageDialog(null, " la cantidad que se repite " + letter + " es " + count);

        
        

    }
}
