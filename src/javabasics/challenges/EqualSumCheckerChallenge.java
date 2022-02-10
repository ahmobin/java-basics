package javabasics.challenges;

public class EqualSumCheckerChallenge {
    public static boolean hasEqualSum(int firstParam, int secondParam, int thirdParam){
        int sumOfFirstAndSecondParams = firstParam + secondParam;
        return sumOfFirstAndSecondParams == thirdParam ? true : false;
    }
}
