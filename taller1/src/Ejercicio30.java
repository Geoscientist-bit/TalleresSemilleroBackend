/*
 * 30.	Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo.
 */


public class Ejercicio30 {
    int[] arrayEnt = { 1, 1, 2, 3, 4, 5, 5, 1 };
    int[] arrResult = new int[arrayEnt.length];

    public void eliminarRepetidos() {
        boolean repeat;
        int j, top = 0;
        
        for (int i = 0; i < arrayEnt.length; ++i) {
            repeat = false;
            j = 0;
            while (!repeat && (j < top)) {      // true && 0 < 0 -- true && 
                if (arrayEnt[i] == arrResult[j]) {
                    repeat = true;
                }
                j++;
            }
            if (!repeat) {                      // repeat == true
                arrResult[top] = arrayEnt[i];   //arrResult[0] = arrayEnt[0] --> arrResult[0] = 1
                top++;                          //top = 1
            }

        }
        System.out.println("original array");

        for (int k = 0; k < arrayEnt.length; k++) {
            System.out.print(arrayEnt[k] + " ");
        }

        System.out.println("");

        System.out.println(" Array without repeated elements ");

        for (int k = 0; k < top; k++) {
            System.out.print(arrResult[k] + " ");
        }
        
      
    }
    
}
