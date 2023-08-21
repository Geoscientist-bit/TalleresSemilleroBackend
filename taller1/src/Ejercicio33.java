/*
 * 33.	Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada elemento en un arreglo.
 */

import java.util.Arrays;

public class Ejercicio33 {
    int[] intNumbers = { 1, 2, 2, 2, 2, 3, 4, 5, 5, 6, 7, 7 };
    
    public void frecuency() {
        
        Arrays.sort(intNumbers);
        int aux = intNumbers[0];
        int count = 0;            
        for (int i = 0; i < intNumbers.length; ++i) {
            if (aux == intNumbers[i]) {
                count++;
            } else {
                System.out.println("the number " + aux + " is repeated " + count + " times");
                count = 1;
                aux = intNumbers[i];
            }
        }
    }
}
