/*
 * 35.	Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar del 1 al  10. Usa para esto una matriz
 */

import javax.swing.JOptionPane;

public class Ejercicio35 {
    int number;
    
    public void multiplicationTable() {
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "enter a integer number"));
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = "  + (i * number));
        }
    }
}
