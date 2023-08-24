public class Triangle extends Shape {
    private double base, heigth;

    public Triangle(double base, double heigth) {
        super("Triangle");
        this.base = base;
        this.heigth = heigth;
    }

    @Override
    public Double calculateArea() {
        return (base * heigth) / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    
}
