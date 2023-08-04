/*
 * 25.	Pide al usuario una frase y muestra cada palabra por separado 
 */

import javax.swing.JOptionPane;

public class Ejercicio25 {
    String cadenaText;

    public void separarText() {
        cadenaText = JOptionPane.showInputDialog("Ingrese un texto");
        String[] textSeparado = cadenaText.split(" ");

        JOptionPane.showMessageDialog(null, textSeparado);

    }
}
