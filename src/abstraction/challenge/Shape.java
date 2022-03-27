package abstraction.challenge;

public abstract class Shape {
    double dimensionOne;
    double dimensionTwo;

    Shape(double dimensionOne, double dimensionTwo){
        this.dimensionOne = dimensionOne;
        this.dimensionTwo = dimensionTwo;
    }

    abstract void area();
}
