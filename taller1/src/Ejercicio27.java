/*
 * 27.	Crea un programa que solicite al usuario una frase y luego muestre las palabras ordenadas alfabéticamente
 */

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejercicio27 {
    String frase;
        
    public void ordenarAlfabeticamente() {
        frase = JOptionPane.showInputDialog(null, "Ingrese una frase");
        char[] stringToChart = frase.toCharArray();

        Arrays.sort(stringToChart);
        String sortedString = new String(stringToChart);

        JOptionPane.showMessageDialog(null, "frase original ---> " + frase);
        JOptionPane.showMessageDialog(null, "frase ordenada  ---> " + sortedString );

    }
}
