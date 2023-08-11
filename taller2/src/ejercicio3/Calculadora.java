/*
 * 3. Calculadora Simple:
Crea una clase Calculadora que contenga métodos para realizar operaciones matemáticas básicas, como suma, resta, multiplicación y división.

 */

package ejercicio3;

import javax.swing.JOptionPane;

public class Calculadora {
    private float num1, num2;

    public Calculadora(float num1, float numb2) {
        this.num1 = num1;
        this.num2 = numb2;
    }    


    public float getNum1() {
        return num1;
    }


    public void setNum1(float num1) {
        this.num1 = num1;
    }


    public float getNum2() {
        return num2;
    }


    public void setNum2(float num2) {
        this.num2 = num2;
    }


    public void add() {
        JOptionPane.showMessageDialog(null, "the result of the sum is --> " + (this.getNum1() + this.getNum2()));
    }
    
    public void substract() {
        JOptionPane.showMessageDialog(null, "the result of the substract is --> " + (this.getNum1() - this.getNum2()));
    }

    public void multiply() {
        JOptionPane.showMessageDialog(null, "the result of the multiply is --> " + (this.getNum1() * this.getNum2()));
    }
    
    public void divide() {
        JOptionPane.showMessageDialog(null, "the result of the divide is --> " + (this.getNum1() / this.getNum2()));
    }
}
