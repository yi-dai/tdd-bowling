import java.util.List;

public class BowlingGame {
    public int convert(List<Integer> bowling_throw_score) {
        int result = 0;
        int pre = 0;
        for (int i = 0; i < bowling_throw_score.size(); i ++){
            int now = bowling_throw_score.get(i);
            if (now == 10){
                result = result + now + bowling_throw_score.get(i+1) + bowling_throw_score.get(i+2);
                bowling_throw_score.add(i+1,0);
                continue;
            }
            if (i % 2 == 1){
                if (pre + now == 10) {
                    result = now + result + bowling_throw_score.get(i+1);
                } else{
                    result = now + result;
                }
            } else {
                pre = now;
                result = now + result;
            }
        }
        return result;
    }
}
