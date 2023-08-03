/*
 * 18.	Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contraseña.
 */

import javax.swing.JOptionPane;

public class Ejercicio18 {
    int numAle;

    public void generarContraseña() {
        char[] mayusculas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L' };
        char[] minusculas = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' };
        char[] numeros = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

        StringBuilder characters = new StringBuilder();
        characters.append(mayusculas);
        characters.append(minusculas);
        characters.append(numeros);

        StringBuilder password = new StringBuilder();

        
        for (int i = 0; i < 8; i++) {
            int cantCharacters = characters.length();
            int numberRandom = (int) (Math.random() * cantCharacters);

            password.append((characters.toString().charAt(numberRandom)));

        }
        
        JOptionPane.showMessageDialog(null, "Sugerencia de contraseña " + password);
    }
    
}
