/*
 * 14.	Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.
 */

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio14 {
    int numPos, suma;
    ArrayList<Integer> numsDiv = new ArrayList<Integer>();

    public void numPerfecto() {
        numPos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero positivo"));

        for (int i = 1; i < numPos; i++) {
            if (numPos % i == 0) {
                numsDiv.add(i);
            }
        }

        for (int i : numsDiv) {
            suma += i;
        }

        if (suma == numPos) {
            JOptionPane.showMessageDialog(null, "El número es perfecto");
        } else {
            JOptionPane.showMessageDialog(null, "El número no es perfecto");
        }
        
    }
}
