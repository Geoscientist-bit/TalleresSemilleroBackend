/*
 * 23.	Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene
 */

import javax.swing.JOptionPane;

public class Ejercicio23 {
    String text;
    char letter;
    
    public void countWords() {
        int count = 1;
        int pos = 0;

        text = JOptionPane.showInputDialog(null, "Ingrese un texto");
        //letter = JOptionPane.showInputDialog(null, "Ingrese el caracter").charAt(0);
        
        pos = text.indexOf(" ");

        while (pos != -1) {
            count++;
            pos = text.indexOf(" ", ++pos); // +1 para que empiece a en la posicion siguiente
        }

        JOptionPane.showMessageDialog(null, " la cantidad de palabras es " + count);
    }

}
