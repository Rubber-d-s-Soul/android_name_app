package com.example.daisuke.name_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MyResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_result);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(MainActivity.EXTRA_MYNAME);
        TextView nameLabel = (TextView) findViewById(R.id.namelable);
        nameLabel.setText(myName + "の点数は…");

        Random randomGenerator = new Random();
        int score = randomGenerator.nextInt(101);
        TextView scoreLabel = (TextView) findViewById(R.id.scorelable);
        scoreLabel.setText(String.valueOf(score) + "点!");
    }


}
