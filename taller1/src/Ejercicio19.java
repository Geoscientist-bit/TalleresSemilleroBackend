/*
 * 19.	Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas 
 */

import javax.swing.JOptionPane;

public class Ejercicio19 {
    String nombre = "";

    public void convertirNombre() {
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
        

        JOptionPane.showMessageDialog(null, "El nombre en minusculas es " + nombre.toLowerCase());

        JOptionPane.showMessageDialog(null, "El nombre en mayusculas es " + nombre.toUpperCase());


        
    }
}
