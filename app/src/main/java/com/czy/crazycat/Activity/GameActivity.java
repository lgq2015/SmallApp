package com.czy.crazycat.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.czy.crazycat.View.GameView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameView(this));
    }

}
