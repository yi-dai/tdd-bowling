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
        Collections.addAll(bowling_throw_score, 2, 6, 4, 6, 4, 5, 1, 9, 10, 5, 3, 4, 3, 6, 3, 10, 2, 5);
        int expect = 117;
        //when
        BowlingGame bowlingGame = new BowlingGame();
        int final_score = bowlingGame.convert(bowling_throw_score);
        //then
        assertEquals(expect,final_score);
    }

    @Test
    void continue_strike_frame_in_top_nine_frame(){
        //given
        List<Integer> bowling_throw_score = new ArrayList<Integer>();
        Collections.addAll(bowling_throw_score, 2, 5, 4, 6, 4, 5, 1, 9, 10, 10, 4, 3, 6, 3, 10, 2, 5);
        int expect = 131;
        //when
        BowlingGame bowlingGame = new BowlingGame();
        int final_score = bowlingGame.convert(bowling_throw_score);
        //then
        assertEquals(expect,final_score);
    }

    @Test
    void spare_frame_in_last_frame(){
        //given
        List<Integer> bowling_throw_score = new ArrayList<Integer>();
        Collections.addAll(bowling_throw_score, 2, 5, 4, 6, 4, 5, 1, 9, 2, 5, 5, 3, 4, 3, 6, 3, 3, 3, 2, 8, 4);
        int expect = 93;
        //when
        BowlingGame bowlingGame = new BowlingGame();
        int final_score = bowlingGame.convert(bowling_throw_score);
        //then
        assertEquals(expect,final_score);
    }

    @Test
    void strike_frame_in_last_frame(){
        //given
        List<Integer> bowling_throw_score = new ArrayList<Integer>();
        Collections.addAll(bowling_throw_score, 2, 5, 4, 6, 4, 5, 1, 9, 2, 5, 5, 3, 4, 3, 6, 3, 3, 3, 10, 7, 2);
        int expect = 98;
        //when
        BowlingGame bowlingGame = new BowlingGame();
        int final_score = bowlingGame.convert(bowling_throw_score);
        //then
        assertEquals(expect,final_score);
    }

}
