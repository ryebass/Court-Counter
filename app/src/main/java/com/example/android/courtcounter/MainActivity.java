package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add1PointA(View v)
    {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void add2PointsA(View v)
    {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void add3PointsA(View v)
    {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void add3PointsB(View v)
    {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void add2PointsB(View v)
    {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void add1PointB(View v)
    {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View v)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
