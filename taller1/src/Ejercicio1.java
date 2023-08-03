/*
 * 1.	Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división.
 */

// import javax.swing.JOptionPane;

public class Ejercicio1 {
    String num1, num2;
    int sumar, resta, mult;
    Double division;

    public void sumar(String num1, String num2) {
        // num1 = JOptionPane.showInputDialog("Introduce el primer numero");
        // num2 = JOptionPane.showInputDialog("Ingrese el segundo numero");

        sumar = Integer.parseInt(num1) + Integer.parseInt(num2);

        System.out.println("El resultado de la suma es " + sumar);
    }

    public void restar(String num1, String num2) {
        resta = Integer.parseInt(num1) - Integer.parseInt(num2);

        System.out.println("La resta entre " + num1 + " y " + num2 + " es: " + resta);
    }

    public void multiplicar(String num1, String num2) {
        mult = Integer.parseInt(num1) * Integer.parseInt(num2);

        System.out.println("La mulptiplicacion entre " + num1 + " y " + num2 + " es: " + mult);
    }

    public void dividir(String num1, String num2) {
        division = Double.parseDouble(num1) / Double.parseDouble(num2);

        System.out.println("La division entre " + num1 + " y " + num2 + " es: " + division);
    }
        



}