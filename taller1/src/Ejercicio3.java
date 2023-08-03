/*
 * 3.	Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.
 */

import javax.swing.JOptionPane;

public class Ejercicio3 {

    String radio;
    Double radioConv, areaCirculo, perimetroCirculo;
    
    public void calcularAreaCirculo() {
        
        radioConv = Double.parseDouble(radio);
        areaCirculo = Math.PI * Math.pow(radioConv, 2);
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + areaCirculo );
        //System.out.println("El área del círculo es: " + areaCirculo);
    }

    public void calcularPerimetroCirculo() {
        radioConv = Double.parseDouble(radio);
        perimetroCirculo = 2 * Math.PI * radioConv;
        //System.out.println("El perímetro del circulo es: " + perimetroCirculo);
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es: " + areaCirculo );
    }
    
}
