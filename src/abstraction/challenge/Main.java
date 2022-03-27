package abstraction.challenge;

public class Main {
    public static void main(String[] args) {
        Shape shape;
        shape = new Rectangle(10.11,52.05);
        shape.area();
        shape = new Triangle(10.25,25.25);
        shape.area();
        shape = new Circle(10.55);
        shape.area();
    }
}
