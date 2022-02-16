package javabasics.loops;

public class SharedDigit {
    public static boolean hasSharedDigit(int digitOne, int digitTwo){
        if((digitOne < 10 || digitOne > 99) || (digitTwo < 10 || digitTwo > 99)){
            return false;
        }

        int numberOneLastDigit = digitOne % 10;
        digitOne -= numberOneLastDigit;
        System.out.println("digit one " + digitOne);
        int numberOneFirstDigit = digitOne / 10;
        System.out.println("number one first digit " + numberOneFirstDigit);


        return true;
    }
}
