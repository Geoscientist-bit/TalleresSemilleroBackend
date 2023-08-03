/*
 *7.Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10. 
 */

public class Ejercicio7 {
    int num, result;

    public void tablaMultiplicar(){
        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
    
}
