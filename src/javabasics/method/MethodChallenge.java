package javabasics.method;

public class MethodChallenge {
    public static void main(String[] arg){

        int scorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("John Doe", scorePosition);

        scorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", scorePosition);

        scorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", scorePosition);

        scorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Alias", scorePosition);

    }


    //create method called displayHighScorePosition with params -> player name and position in high score table
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " manage to get into position " + position + " on the high score table");
    }

    //create method called calculateHighScorePosition with a param -> playerScore
    // it should return an int
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore > 1000){
            return 1;
        }else if(playerScore > 500 && playerScore < 1000){
            return 2;
        }else if(playerScore > 100 && playerScore < 500){
            return 3;
        }else{
            return 4;
        }
    }
}
