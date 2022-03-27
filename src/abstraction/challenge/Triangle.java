package abstraction.challenge;

public class Triangle extends Shape{
    Triangle(double dimensionOne, double dimensionTwo){
        super(dimensionOne, dimensionTwo);
    }

    @Override
    void area() {
        double result = 0.5 * dimensionOne * dimensionTwo;
        System.out.println("Triangle area : " + result);
    }
}
