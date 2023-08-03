/*
 * 16.	Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario. 
 */

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio16 {
    int numEnt, num1, num2, num3;
    ArrayList<Integer> enteros = new ArrayList<Integer>();
    

    public void sucesionFibonacci() {
        num1 = 0;
        num2 = 1;
        numEnt = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero "));

        if (numEnt < 0) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero positivo");
        }else if(numEnt == 0 || numEnt == 1){
            JOptionPane.showMessageDialog(null, "la sucesion de fibonnaci de " + numEnt + " es "+ numEnt);
        }else{
            for (int i = 0; i <= numEnt; i++) {
                num3 = num1 + num2;
                System.out.print(" " + num3);
                enteros.add(num3);

                num1 = num2;
                num2 = num3;

            }
            JOptionPane.showMessageDialog(null, "La lista de los números de la sucesión: " + enteros);
        }
    }
}
