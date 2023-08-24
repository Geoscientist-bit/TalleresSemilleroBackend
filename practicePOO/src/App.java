public class App {
    public static void main(String[] args) throws Exception {
        Circle circle1 = new Circle(10d);
        Triangle triangle1 = new Triangle(10, 20);

        System.out.println(circle1.calculateArea());
        System.out.println(triangle1.calculateArea());
        circle1.showInfo();
        triangle1.showInfo();
    }
}
