package javabasics.loops;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int lastNumber = number % 10;
        int modNumber;
        while(number > 9)
        {
            modNumber = number % 10;
            number -= modNumber;
            number /= 10;
        }
        return number+lastNumber;
    }
}
