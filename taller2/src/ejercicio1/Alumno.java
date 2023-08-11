/*
 * 1. Registro de Alumnos:
Crea una clase Alumno con propiedades como nombre, edad y calificaciones. Luego, crea una clase SistemaAlumnos que permite agregar alumnos,asignar calificaciones , calcular el promedio de sus calificaciones y mostrar la información de cada alumno.

 */

package ejercicio1;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Alumno {
    private String nombre;
    private int edad;
    ArrayList<Double> calificaciones = new ArrayList<>();
    ArrayList<String> calificaciones2 = new ArrayList<>();

    public Alumno(String nombreEst, int edad) {
        
        this.setNombre(nombreEst);
        this.setEdad(edad);

        // this.nombre = nombre;
        // this.edad = edad;
        
        System.out.println("Alumno agregado");

    }
    

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public void agregarCalificaciones() {
        

        int cantCalif = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas calificaciones desea ingresar"));

        for (int i = 1; i < cantCalif; i++) {
            calificaciones.add(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese calificacion")));
            System.out.println(calificaciones);
        }

        Double suma = 0.0;
        Double promedio = 0.0;

        for (Double data : calificaciones) {
            suma += data;
            System.out.println(suma);
        }
        
        promedio = suma / calificaciones2.size();
       

        JOptionPane.showMessageDialog(null, " nombre " + this.getNombre() + " edad " + this.getEdad() + " promedio " + promedio);


    }

    // public void mostrarDatos() {
        
    // }


}
