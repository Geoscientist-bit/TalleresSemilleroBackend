
/*
 * 6.	Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.
 */

import javax.swing.JOptionPane;

public class Ejercicio6 {
    int num;
    
    public void verificarNum() {
      
        
        if (num > 0) {
            JOptionPane.showMessageDialog(null, "El numero es positivo");
        }else if (num < 0) {
            JOptionPane.showMessageDialog(null, "El numero es negativo");
        }else if (num == 0) {
            JOptionPane.showMessageDialog(null, "El numero es cero");
            
        } else {
            JOptionPane.showMessageDialog(null, "El valor ingresado no es valido");
        }

        
    }
}
