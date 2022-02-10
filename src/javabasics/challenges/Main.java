package javabasics.challenges;

public class Main {
    public static void main(String[] args){
        // speed converted challenge calling start -------
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);
        SpeedConverter.printConversion(10.5);
        // speed converted challenge calling end -------

        // megabytes converter challenge start -------
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        // megabytes converter challenge end -------
    }
}
