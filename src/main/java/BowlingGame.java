import java.util.List;

public class BowlingGame {
    public int convert(List<Integer> bowling_throw_score) {
        int result = 0;
        int pre = 0;
        int frames = 0;
        boolean pair = false;
        int i;
        for (i = 0; i < bowling_throw_score.size(); i ++){
            if (frames == 9){
                break;
            }
            int now = bowling_throw_score.get(i);
            if (now == 10){
                frames += 1;
                result = result + now + bowling_throw_score.get(i+1) + bowling_throw_score.get(i+2);
                continue;
            }
            if (pair){
                pair = false;
                frames += 1;
                if (pre + now == 10) {
                    result = now + result + bowling_throw_score.get(i+1);
                } else{
                    result = now + result;
                }
            } else {
                pair = true;
                pre = now;
                result = now + result;
            }
        }
        if (bowling_throw_score.get(i) == 10 || bowling_throw_score.get(i) + bowling_throw_score.get(i+1) == 10){
            result += bowling_throw_score.get(i) + bowling_throw_score.get(i+1) + bowling_throw_score.get(i+2);
        } else {
            result += bowling_throw_score.get(i) + bowling_throw_score.get(i+1);
        }
        return result;
    }
}
