package leavesc.hello.game2048.listen;

/**
 * 回调函数
 * Created by ZY on 2016/7/18.
 */
public interface ScoreChangeListen {

    void OnNowScoreChange(int Score);

    void OnHighestScoreChange(int Score);

}
