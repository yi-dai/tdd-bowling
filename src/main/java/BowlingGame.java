import java.util.List;

public class BowlingGame {
    public int convert(List<Integer> bowling_throw_score) {
        int result = 0;
        if(bowling_throw_score.size() == 20){
            for (int i = 0; i < bowling_throw_score.size(); i ++){
                result = bowling_throw_score.get(i) + result;
            }
        }
        return result;
    }
}
