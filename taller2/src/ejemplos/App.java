package ejemplos;

public class App {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("jhon", "1234", 20);
        Estudiante estudiante2 = new Estudiante("juan", "2021", 30);
        Estudiante estudiante3 = new Estudiante("juana", "1453", 26);
        
        System.out.println(estudiante1.getName());
        System.out.println(estudiante2.getAge());
        System.out.println(estudiante3.getNumberId());

        ModuloInscripcion systemInscription = new ModuloInscripcion();
        systemInscription.inscribirEstudiante(estudiante1);
        systemInscription.inscribirEstudiante(estudiante2);
        systemInscription.inscribirEstudiante(estudiante3);

    }
}
