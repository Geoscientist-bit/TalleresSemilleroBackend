/*
 * 17.	Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango.
 */

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio17 {
    int num1Ent, num2Ent, rango;
    ArrayList<Integer> arregloEnteros = new ArrayList<>();

    public void comparacion() {
        num1Ent = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
        num2Ent = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo número"));

        if (num1Ent < num2Ent) {
            for (int i = num1Ent; i < num2Ent; ++i) {
                if (i == 2 || i % 2 != 0) {
                    arregloEnteros.add(i);
                }
            }
            JOptionPane.showMessageDialog(null, "Los números primos entre " + num1Ent + " y " + num2Ent + " son " + arregloEnteros);
        }else if(num2Ent < num1Ent){
              for (int i = num2Ent; i < num1Ent; ++i) {
                if (i == 2 || i % 2 != 0) {
                    arregloEnteros.add(i);
                }
            }
            JOptionPane.showMessageDialog(null, "Los números primos entre " + num2Ent + " y " + num1Ent+ " son " + arregloEnteros);
        } else {
            JOptionPane.showMessageDialog(null, "Los números ingresados no son validos");
        }
       
    }
}
