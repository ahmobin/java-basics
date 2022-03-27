package abstraction.challenge;

public class Rectangle extends Shape{

    Rectangle(double dimensionOne, double dimensionTwo){
        super(dimensionOne, dimensionTwo);
    }

    @Override
    void area() {
        double result = dimensionOne * dimensionTwo;
        System.out.println("Rectangle area : " + result);
    }
}
