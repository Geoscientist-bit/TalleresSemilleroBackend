
/*8.	Realiza un programa que simule un juego de adivinar un número. El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.

 * @author Jhon Edison Muñoz
 */

import javax.swing.JOptionPane;

public class Ejercicio8 {
    String num;
    int numConv, numAle = 0;
    
    
    public void adivinarNum() {
        numAle = (int) (Math.random() * 100 + 1);
        System.out.println(numAle);

        // numConv = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero"));
        while (numAle != numConv) {
            
            numConv = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero"));
            
            if (numAle == numConv) {
                JOptionPane.showMessageDialog(null, "¡Has adivinado!");
            } else if(numAle > numConv){
                JOptionPane.showMessageDialog(null, "¡El numero es mas alto!");
            } else if (numAle < numConv) {
                JOptionPane.showMessageDialog(null, "¡El numero es menor!");
            }

        }
        
        
    }
}
