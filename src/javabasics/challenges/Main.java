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

        // decimal comparator challenge start -------
        boolean areNumbersThreeDecimalPlaced = DecimalComparatorChallenge.areEqualByThreeDecimalPlaces(-3, 3.176);
        System.out.println(areNumbersThreeDecimalPlaced);
        // decimal comparator challenge end -------

        // decimal comparator challenge start -------
        boolean isEqualFirstSecondParamsSumWithThirdParam = EqualSumCheckerChallenge.hasEqualSum(1,-1,0);
        System.out.println(isEqualFirstSecondParamsSumWithThirdParam);
        // decimal comparator challenge end -------
    }
}
