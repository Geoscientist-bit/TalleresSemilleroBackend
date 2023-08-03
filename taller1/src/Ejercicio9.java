/*
 * 9.	Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.
 */

import javax.swing.JOptionPane;

public class Ejercicio9 {
    int num;

    public void factorial() {
        int result = 1;

        for (int i = 1; i < num; i++) {
            result = result * (i + 1);

        }
        JOptionPane.showMessageDialog(null,"El factorial de " + num + " es "+ result);

    }
}
