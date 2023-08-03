/*
 * 15.	Crea un programa que pida al usuario un número entero y determine si es un número capicúa. Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.
 */

import javax.swing.JOptionPane;

public class Ejercicio15 {
    String numString;

    public void capicua() {
        numString = JOptionPane.showInputDialog(null, "IIngrese el número");
        if (numString.equals(new StringBuilder().append(numString).reverse().toString())) {
            JOptionPane.showMessageDialog(null, "capicua");
        };
    }
    
}
