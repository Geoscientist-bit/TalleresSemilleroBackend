/*
 * 31.	Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo, el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros de manera ascendente.
 */



public class Ejercicio31 {
    int[] intNumbers = { 1, 3, 5, 6, 7, 8, 2, 10, 3 };
    int aux, lengthArray = intNumbers.length;
    
    public void BubbleOrdering() {
        for (int i = 1; i < lengthArray; i++) {
            int j = 0;
            while (j < lengthArray - 1) {
                if (intNumbers[j] > intNumbers[j + 1]) {
                    aux = intNumbers[j];
                    intNumbers[j] = intNumbers[j + 1];
                    intNumbers[j + 1] = aux;
                }
                j = j + 1;
            }
        }
        //I want to show the orderly array
        for (int i : intNumbers) {
            System.out.print(i + " ");
            ;
        }
        
    }
    
}
