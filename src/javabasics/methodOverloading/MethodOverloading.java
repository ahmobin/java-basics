package javabasics.methodOverloading;

public class MethodOverloading {
    public static void main(String[] args){
        System.out.println("Method Overloading: Method overloading means: the same name of multiple method with same or different types & number of parameters");

        System.out.println(OverloadingChallenge.getDurationString(65,45));
        System.out.println(OverloadingChallenge.getDurationString(3945));
    }
}