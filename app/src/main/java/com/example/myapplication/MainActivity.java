package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Integer team1 = 0;
    Integer team2 = 0;
    TextView team1score;
    TextView team2score;
    Button team1add3;
    Button team1add2;
    Button team1add1;
    Button team2add3;
    Button team2add2;
    Button team2add1;
    Button reset;

    public void initializeViews(){
        team1score = findViewById(R.id.Team1_score);
        team2score = findViewById(R.id.Team2_score);
        team1add3 = findViewById(R.id.Team1_add3);
        team1add2 = findViewById(R.id.Team1_add2);
        team1add1 = findViewById(R.id.Team1_add1);
        team2add3 = findViewById(R.id.Team2_add3);
        team2add2 = findViewById(R.id.Team2_add2);
        team2add1 = findViewById(R.id.Team2_add1);
        reset = findViewById(R.id.reset);
    }

    public void initializeListeners(){
        team1add3.setOnClickListener(this);
        team1add2.setOnClickListener(this);
        team1add1.setOnClickListener(this);
        team2add3.setOnClickListener(this);
        team2add2.setOnClickListener(this);
        team2add1.setOnClickListener(this);
        reset.setOnClickListener(this);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        initializeListeners();
    }


    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.Team1_add1) {
            team1++;
        }
        else if (view.getId() == R.id.Team1_add2) {
            team1 += 2;
        }
        else if (view.getId() == R.id.Team1_add3) {
            team1 += 3;
        }
        else if (view.getId() == R.id.Team2_add1) {
            team2++;
        }
        else if (view.getId() == R.id.Team2_add2) {
            team2 += 2;
        }
        else if (view.getId() == R.id.Team2_add3) {
            team2 += 3;
        }
        else if (view.getId() == R.id.reset) {
            team1 = 0;
            team2 = 0;
        }
        team1score.setText(team1.toString());
        team2score.setText(team2.toString());
    }

}


