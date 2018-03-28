package lv.javaguru18.lesson5;

/**
 * Created by Vix on 3/8/2018.
 */
public class Competition {
    public int findWinner(int[][] scoreTable) {
        int winner = -1;
        int biggestScore = 0;
        for (int i=0; i<scoreTable.length; i++){
            int currentPlayerScore = countPlayerTotalScore(scoreTable[i]);
            if (biggestScore < currentPlayerScore){
                winner = i;
                biggestScore = currentPlayerScore;
            }
        }
        return winner;
    }

    public int countPlayerTotalScore(int[] scoreTable) {
        int playerTotalScore = 0;
        for (int i=0; i<scoreTable.length; i++) {
            playerTotalScore+= scoreTable[i];
        }
        return playerTotalScore;
    }

    public int findMostDifficultCompetition(int[][] scoreTable) {
        int difficultCompetition = 0;
        int competitionScore = 100000;
        for (int i=0; i<scoreTable[0].length; i++){
            int currentCompetitionScore = sumOfColumn(scoreTable,i);
            if (competitionScore > currentCompetitionScore){
                difficultCompetition = i;
                competitionScore = currentCompetitionScore;
            }
        }
        return difficultCompetition;
    }

    private int sumOfColumn(int[][] scoreTable, int competition) {
        int sumOfColumn = 0;
        for (int i=0; i < scoreTable.length; i++) {
            sumOfColumn += scoreTable[i][competition];
        }
        return sumOfColumn;
    }
}
