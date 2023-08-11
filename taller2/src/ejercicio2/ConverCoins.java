/*
 * 2. Conversor de Monedas:
Crea una clase ConversorMonedas que contenga métodos para convertir una cantidad de dinero de una moneda a otra, por ejemplo, de dólares a euros o de pesos a dólares.

 */


package ejercicio2;

import javax.swing.JOptionPane;

public class ConverCoins {
    private float coins = 0;
    private float oneDollar = 3975.87f;
    private float oneEUR = 4363f;
    
    public float getCoins() {
        return coins;
    }
    
    
    public void setCoins(int coins) {
        this.coins = coins;
    }
    

    public float getOneDollar() {
        return oneDollar;
    }


    public void setOneDollar(float oneDollar) {
        this.oneDollar = oneDollar;
    }


    public float getOneEUR() {
        return oneEUR;
    }


    public void setOneEUR(float oneEUR) {
        this.oneEUR = oneEUR;
    }


    public void convertDollar(float pesosCOL) {
        this.coins = pesosCOL;
        JOptionPane.showMessageDialog(null, this.coins + " pesos to dollars is " + (this.coins * this.oneDollar));
    }

    public void convertEUR(float pesosCOL) {
        this.coins = pesosCOL;
        JOptionPane.showMessageDialog(null, this.coins + " pesos to EUR is " + (this.coins * this.oneEUR));
    }

}
