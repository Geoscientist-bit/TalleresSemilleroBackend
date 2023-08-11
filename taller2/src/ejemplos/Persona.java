package ejemplos;

public class Persona {
    private String name;
    private String numberId;
    private int age;

    public Persona(String name, String numberId, int age) {
        this.name = name;
        this.numberId = numberId;
        this.age = age; 
    }
    

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getNumberId() {
        return numberId;
    }



    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }





}
