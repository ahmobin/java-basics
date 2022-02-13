package javabasics.challenges;

public class TeenNumberCheckerChallenge {
    public static boolean hasTeen(int paramOne, int paramTwo, int paramThree){
        if((paramOne >= 13 && paramOne <= 19) || (paramTwo >= 13 && paramTwo <= 19) || (paramThree >= 13 && paramThree <= 19)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int param){
        if(param >= 13 && param <= 19){
            return true;
        }

        return false;
    }
}
