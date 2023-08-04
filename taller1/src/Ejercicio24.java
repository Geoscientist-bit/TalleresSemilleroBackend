/*
 * 24.	Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra
 */

import javax.swing.JOptionPane;

public class Ejercicio24 {
    String cadena;

    public void reemplazarLetra() {
        cadena = JOptionPane.showInputDialog(null, "Ingrese el texto");
        cadena = cadena.replace("a", "j").replace("e", "n");

        JOptionPane.showMessageDialog(null,cadena);

     }
}
