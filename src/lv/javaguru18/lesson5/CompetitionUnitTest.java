package lv.javaguru18.lesson5;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Vix on 3/8/2018.
 */
public class CompetitionUnitTest {
    int[][] scoreTable;
    Competition competition;

    @Before
    public void setUp(){
        competition = new Competition() ;
           scoreTable =  new int [][]{
                {5,1,2,4},
                {4,2,2,5},
                {5,3,1,3}
        };
    }

    @Test
    public void shouldReturnCompetitionWinner(){
        assertEquals(2, competition.findMostDifficultCompetition(scoreTable));
    }

    @Test
    public void shouldSumAllScoresForPlayer() throws Exception {
        assertEquals(12, competition.countPlayerTotalScore(scoreTable[0]));
    }
}