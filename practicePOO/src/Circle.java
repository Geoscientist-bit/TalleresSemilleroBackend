public class Circle extends Shape {

    private Double radius;
    
    public Circle(Double radius) {
        super("circle");
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {        
        //throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
        return Math.PI * Math.pow(radius, 2); //I implement the method
    }
    
}
