abstract public class Shape{
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println("Shape's Name: " + getName());
    }

    public abstract Double calculateArea();     // this is a method without body

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}