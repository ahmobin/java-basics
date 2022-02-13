package javabasics.methodOverloading;

public class IntEqualityPrinter {
    private static final String INVALID_NUMBER_MESSAGE = "Invalid Value";
    private static final String ALL_NUMBER_EQUAL_MESSAGE = "All numbers are equal";
    private static final String ALL_NUMBER_NOT_EQUAL_MESSAGE = "All numbers are different";
    private static final String NOT_EQUAL_OR_DIFFERENT = "Neither all are equal or different";

    public static void printEqual(int paramOne, int paramTwo, int paramThree){
        if(paramOne < 0 || paramTwo < 0 || paramThree < 0) {
            System.out.println(INVALID_NUMBER_MESSAGE);
        }
        else{
            if(paramOne == paramTwo && paramTwo == paramThree) {
                System.out.println(ALL_NUMBER_EQUAL_MESSAGE);
            }

            else if (paramOne != paramTwo && paramTwo != paramThree && paramThree != paramOne) {
                System.out.println(ALL_NUMBER_NOT_EQUAL_MESSAGE);
            }

            else{
                System.out.println(NOT_EQUAL_OR_DIFFERENT);
            }
        }
    }
}
