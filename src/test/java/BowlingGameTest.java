import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    @Test
    void no_strike_or_spare_frame(){
        //given
        List<Integer> bowling_throw_score = new ArrayList<Integer>();
        Collections.addAll(bowling_throw_score, 2, 5, 3, 6, 4, 5, 1, 7, 2, 5, 5, 3, 4, 3, 6, 3, 3, 3, 2, 5);
        //int[] bowling_throw_score = {2, 5, 3, 6, 4, 5, 1, 7, 2, 5, 5, 3, 4, 3, 6, 3, 3, 3, 2, 5};
        int expect = 77;
        //when
        BowlingGame bowlingGame = new BowlingGame();
        int final_score = bowlingGame.convert(bowling_throw_score);
        //then
        assertEquals(expect,final_score);
    }

    @Test
    void some_spare_frame_in_top_nine_frame(){
        //given
        List<Integer> bowling_throw_score = new ArrayList<Integer>();
        Collections.addAll(bowling_throw_score, 2, 5, 4, 6, 4, 5, 1, 9, 2, 5, 5, 3, 4, 3, 6, 3, 3, 3, 2, 5);
        //int[] bowling_throw_score = {2, 5, 3, 6, 4, 5, 1, 7, 2, 5, 5, 3, 4, 3, 6, 3, 3, 3, 2, 5};
        int expect = 86;
        //when
        BowlingGame bowlingGame = new BowlingGame();
        int final_score = bowlingGame.convert(bowling_throw_score);
        //then
        assertEquals(expect,final_score);
    }

    @Test
    void some_strike_frame_in_top_nine_frame(){
        //given
        List<Integer> bowling_throw_score = new ArrayList<Integer>();
        Collections.addAll(bowling_throw_score, 2, 5, 4, 6, 4, 5, 1, 9, 2, 5, 5, 3, 4, 3, 6, 3, 10, 2, 5);
        //int[] bowling_throw_score = {2, 5, 3, 6, 4, 5, 1, 7, 2, 5, 5, 3, 4, 3, 6, 3, 3, 3, 2, 5};
        int expect = 97;
        //when
        BowlingGame bowlingGame = new BowlingGame();
        int final_score = bowlingGame.convert(bowling_throw_score);
        //then
        assertEquals(expect,final_score);
    }

    //@Test
    void spare_frame_in_last_frame(){
        //given
        List<Integer> bowling_throw_score = new ArrayList<Integer>();
        Collections.addAll(bowling_throw_score, 2, 5, 4, 6, 4, 5, 1, 9, 2, 5, 5, 3, 4, 3, 6, 3, 3, 3, 2, 5);
        //int[] bowling_throw_score = {2, 5, 3, 6, 4, 5, 1, 7, 2, 5, 5, 3, 4, 3, 6, 3, 3, 3, 2, 5};
        int expect = 86;
        //when
        BowlingGame bowlingGame = new BowlingGame();
        int final_score = bowlingGame.convert(bowling_throw_score);
        //then
        assertEquals(expect,final_score);
    }
}
