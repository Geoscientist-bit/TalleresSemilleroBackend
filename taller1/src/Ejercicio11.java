/*
 * 11.	Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. El usuario debe ingresar las longitudes de los tres lados.
 * 
 * @author Jhon Edison Muñoz
 *  
 */

import javax.swing.JOptionPane;

public class Ejercicio11 {
    Double a, b, c, s, area ;

    public void calcularAreaHeron() {
        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el lado a del triangulo"));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el lado b del triangulo"));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el lado c del triangulo"));
        
        s = (a + b + c) / 2;
        area = Math.sqrt(s*(s - a)*(s -b)*(s - c));
        JOptionPane.showMessageDialog(null, "el are del triangulo por medio de la formaula de Heron es " + area);
    }
}
