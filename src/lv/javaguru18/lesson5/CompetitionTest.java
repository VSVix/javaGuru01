package lv.javaguru18.lesson5;

/**
 * Created by Vix on 3/8/2018.
 */
public class CompetitionTest {
    private static final int[][] SCORE_TABLE =  new int [][]{
            {5,1,2,4},
            {4,2,2,5},
            {5,3,1,3}
    };

    public static void main(String[] args) {

        shouldReturnTheMostDifficultCompetition(new Competition());
        shouldSumAllScoresForPlayer(new Competition());
        shouldReturnCompetitionWinner(new Competition());

    }

    private static void shouldReturnCompetitionWinner(Competition competition) {
        System.out.println("TESTING -> Should Return Competition Winner");
        boolean isOK = 1 == competition.findWinner(SCORE_TABLE);
        printTestResult(isOK);
    }


    private static void shouldSumAllScoresForPlayer(Competition competition) {
        System.out.println("TESTING -> Should Sum All Scores For Player");
        boolean isOK = 12 == competition.countPlayerTotalScore(SCORE_TABLE[0]);
        printTestResult(isOK);
    }

    private static void shouldReturnTheMostDifficultCompetition(Competition competition) {
        System.out.println("TESTING -> Should Find The Most Difficult Competition");
        boolean isOK = 2 == competition.findMostDifficultCompetition(SCORE_TABLE);
        printTestResult(isOK);
    }

    private static void printTestResult( boolean isTestPassed) {
        System.out.println(isTestPassed ? "PASSED" : "FAILED");
        System.out.println("--------------------------------------------------------------------");
    }
}
