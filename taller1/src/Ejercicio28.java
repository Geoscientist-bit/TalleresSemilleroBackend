/*
 * 28.	Suma de elementos: Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros.
 */

import javax.swing.JOptionPane;

public class Ejercicio28 {
    int[] numEnt = { 1, 2, 3, 4, 5, 6 };
    int num, num2, result = 0;

    public void sumarElementos() {
        // for (int i : numEnt) {
        //     num = num + numEnt[i];
        //     System.out.println(numEnt[i]);
        //     result = num + numEnt[i + 1];
        //     //System.out.println(result);

        // }

        for (int i = 0; i < numEnt.length; i++) {
            result += numEnt[i];
            
        }
        JOptionPane.showMessageDialog(null, "La suma de los enteros es " + result);
    }
}
