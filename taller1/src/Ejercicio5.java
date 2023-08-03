/*
 * 5.	Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.
 */

import javax.swing.JOptionPane;

public class Ejercicio5 {
    String num1, num2;
    int num1Conv, num2Conv;

    public void determinarElmayor() {
        num1Conv = Integer.parseInt(num1);
        num2Conv = Integer.parseInt(num2);

        if (num1Conv > num2Conv) {
            JOptionPane.showMessageDialog(null, "El numero " + num1Conv + " es el numero mayor");
        } else if (num2Conv > num1Conv) {
            JOptionPane.showMessageDialog(null, "El numero " + num2Conv + " es el numero mayor");
        } else {
            JOptionPane.showMessageDialog(null, "lo numeros son iguales");
        } {
            
        }
    }
    
}
