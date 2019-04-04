package leavesc.hello.crazycat.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import leavesc.hello.crazycat.view.GameView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameView(this));
    }

}
