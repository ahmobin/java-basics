package javabasics.methodOverloading;

public class MinutesToYearsDaysCalculator {
    private static final String INVALID_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes){
        if(minutes < 0)
            System.out.println(INVALID_MESSAGE);

        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long remainingDays = days % 365;
        System.out.println("XX min = " + years + " y and " + remainingDays + " d");
    }
}
