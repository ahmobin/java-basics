package javabasics.loops;

public class EvenNumberChecker {
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }

        return false;
    }

    public static void evenNumbersOnRange(int number, int finishedNumber){
        while (number <= finishedNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even Number " + number);
        }
    }
}
