import java.util.List;

public class BowlingGame {
    public int convert(List<Integer> bowling_throw_score) {
        int result = 0;
        int pre = 0;
        for (int i = 0; i < bowling_throw_score.size(); i ++){
            if (i % 2 == 1){
                if (pre + bowling_throw_score.get(i) == 10) {
                    result = bowling_throw_score.get(i) + result + bowling_throw_score.get(i + 1);
                } else{
                    result = bowling_throw_score.get(i) + result;
                }
            } else {
                pre = bowling_throw_score.get(i);
                result = bowling_throw_score.get(i) + result;
            }
                //result = bowling_throw_score.get(i) + result;
        }
        return result;
    }
}
