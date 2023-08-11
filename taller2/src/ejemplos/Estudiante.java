package ejemplos;

public class Estudiante extends Persona {
    public static int countID = 0;
    protected int id;
    String codigo;

    public Estudiante(String name, String numberId, int age) {
        super(name, numberId, age);
        this.id = countID++;
        this.codigo = this.getName() + this.id;
    }

  


}
