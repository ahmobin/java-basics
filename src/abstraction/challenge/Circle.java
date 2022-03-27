package abstraction.challenge;

public class Circle extends Shape{
    double radius = dimensionOne = dimensionTwo;

    Circle(double radius){
        super(radius, radius);
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Circle area : " + result);
    }
}
