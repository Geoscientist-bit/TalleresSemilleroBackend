package ejercicio1;
public class SistemaAlumnos {
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("jhon", 20);
        System.out.println(alumno1.getNombre());
        alumno1.agregarCalificaciones();

        Alumno alumno2 = new Alumno("grace", 25);
        alumno2.agregarCalificaciones();
        

    }
}
