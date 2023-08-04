/*
 * 22.	Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda) 
 */

import javax.swing.JOptionPane;

public class Ejercicio22 {
       
    public void palindromo() {

        String cadena, cadenaInv = "";

        cadena = JOptionPane.showInputDialog(null, "Ingresa un texto");
        cadena = cadena.toLowerCase().replace("á", "a").replace("í", "i").replace("ó", "o").replace(" ", "");
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInv += cadena.charAt(i);

        }
        if (cadena.equals(cadenaInv)) {
            System.out.println("Es Palíndrome");
            JOptionPane.showMessageDialog(null, "el texto es Palíndrome" );
        } else {
            JOptionPane.showMessageDialog(null, "el texto no es Palíndrome" );
        }
    }
    

}
