package javabasics.challenges;

public class DecimalComparatorChallenge {

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum){
        firstNum = firstNum * 1000;
        secondNum = secondNum * 1000;
        if(firstNum == secondNum)
            return true;
        else{
            return false;
        }
    }
}
