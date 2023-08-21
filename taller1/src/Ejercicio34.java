/*
 *34.	Rotación de elementos: Implementa un programa que rote los elementos de un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones. 
 */

import javax.swing.JOptionPane;

public class Ejercicio34 {
    int[] number = { 1, 2, 3, 4, 5, 7, 8, 2 };
    int aux = 0;

    public void rotate() {
        System.out.println("Array original ");
        for (int num : number) {
            System.out.print(num + " ");
        }

        int arrayPosition = Integer.parseInt(JOptionPane.showInputDialog(null, "enter number position"));
        int arrayPositionToChange = Integer
                .parseInt(JOptionPane.showInputDialog(null, "enter number position to change "));
        aux = number[arrayPosition];
        number[arrayPosition] = number[arrayPositionToChange];
        number[arrayPositionToChange] = aux;        

        System.out.println("Arrray rotated ");
        for (int i : number) {
            System.out.print(i + " ");
            
        }
    }
    
}
