/*
 * 32.	Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y muestre su índice (o un mensaje si no se encuentra).
 */

import javax.swing.JOptionPane;

public class Ejercicio32 {
    int[] intNumbers = { 1, 3, 5, 7, 8, 9, 4 };
    int pos = -1;
    
    public void searchIndex() {
        int numberInput = Integer.parseInt(JOptionPane.showInputDialog(null, "enter the number you wish to search for  ")) ;

        for (int i = 0; i < intNumbers.length; i++) {
            if (intNumbers[i] == numberInput) {
                pos = i;                
            }
        }
        if (pos == -1) {
            JOptionPane.showMessageDialog(null, " index not found ");
        } else {
            JOptionPane.showMessageDialog(null, " the position is " + pos);
        }
    }
}
