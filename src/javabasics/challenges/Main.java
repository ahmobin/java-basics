package javabasics.challenges;

public class Main {
    public static void main(String[] args){
        // speed converted challenge calling start -------
        long miles = SpeedConverterChallenge.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);
        SpeedConverterChallenge.printConversion(10.5);
        // speed converted challenge calling end -------

        // megabytes converter challenge start -------
        MegaBytesConverterChallenge.printMegaBytesAndKiloBytes(2500);
        // megabytes converter challenge end -------

        // barking dog challenge start -------
        boolean isBarking = BarkingDogChallenge.shouldWakeUp(true,-1);
        System.out.println(isBarking);
        // barking dog challenge end -------

        // leap  challenge start -------
        boolean isLeapYear = LeapYearChallenge.isLeapYear(2000);
        System.out.println(isLeapYear);
        // barking dog challenge end -------
    }
}
