/*
 * 10.	Ejercicio 10: Crea un programa que muestre los primeros 20 números de la serie Fibonacci. La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …
 */


public class Ejercicio10 {
    int num1 = 0, num2 = 1, num3 = 0, count = 20;
   
    public void fibonacci() {
        
        for (int i = 2; i <= count; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            
            num1 = num2;
            num2 = num3;
          
        }
        
    }
}
