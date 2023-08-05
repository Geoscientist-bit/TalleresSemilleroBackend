/*
 * 29.	Encontrar el número más grande: Crea un programa que encuentre el número más grande en un arreglo de enteros.
 */

import javax.swing.JOptionPane;

public class Ejercicio29 {
    int[] arrayEnt = { 8, 10, 1, 5, 6, 7, 20 };
    
    public void buscarNumMayor() {
        int numMayor = arrayEnt[0];
        for (int i = 0; i < arrayEnt.length; ++i) {
            if (numMayor < arrayEnt[i]) {
                numMayor = arrayEnt[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El numero mayor es " + numMayor);
        
    }
}
