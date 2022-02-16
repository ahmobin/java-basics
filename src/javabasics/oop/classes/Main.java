package javabasics.oop.classes;

public class Main {
    public static void main(String[] args){
        Car porsche = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model name is " + porsche.getModel());

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getSubtractionResult());
        System.out.println(calculator.getMultiplicationResult());
        System.out.println(calculator.getDivisionResult());
    }
}
