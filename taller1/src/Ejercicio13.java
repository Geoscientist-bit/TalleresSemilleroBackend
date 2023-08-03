/*
 * 13.	Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales 
 * 
 * @author Jhon Edison Muñoz
 */

import javax.swing.JOptionPane;

public class Ejercicio13 {
    Double numDec, redondeado;

    public void numeroRedondeado() {
        numDec = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un número entero"));
        redondeado = Math.ceil(numDec);
        JOptionPane.showMessageDialog(null, "Número redondeado => " + redondeado);
    }
    
}
