package javabasics.methodOverloading;

public class Main {
    public static void main(String[] args){
        System.out.println("Method Overloading: Method overloading means: the same name of multiple method with same or different types & number of parameters");
        System.out.println(OverloadingChallenge.getDurationString(65,45));
        System.out.println(OverloadingChallenge.getDurationString(3945));

        System.out.println(AreaCalculator.area(-1.0,4.0));

        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }
}
