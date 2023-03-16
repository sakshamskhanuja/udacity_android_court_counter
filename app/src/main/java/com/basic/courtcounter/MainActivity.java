package com.basic.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Stores the score of teams A and B.
    private int teamScoreA = 0, teamScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Method gets invoked when the "+3 POINTS" button under Team A is clicked.
     */
    public void addThreeForTeamA(View view) {
        teamScoreA += 3;
        updateScoreTeamA();
    }

    /**
     * Method gets invoked when the "+2 POINTS" button under Team A is clicked.
     */
    public void addTwoForTeamA(View view) {
        teamScoreA += 2;
        updateScoreTeamA();
    }

    /**
     * Method gets invoked when the "FREE THROW" button under Team A is clicked.
     */
    public void addOneForTeamA(View view) {
        teamScoreA++;
        updateScoreTeamA();
    }

    /**
     * Method gets invoked when the "+3 POINTS" button under Team B is clicked.
     */
    public void addThreeForTeamB(View view) {
        teamScoreB += 3;
        updateScoreTeamB();
    }

    /**
     * Method gets invoked when the "+2 POINTS" button under Team B is clicked.
     */
    public void addTwoForTeamB(View view) {
        teamScoreB += 2;
        updateScoreTeamB();
    }

    /**
     * Method gets invoked when the "FREE THROW" button under Team B is clicked.
     */
    public void addOneForTeamB(View view) {
        teamScoreB++;
        updateScoreTeamB();
    }

    /**
     * Method gets invoked when the "RESET" button is clicked.
     */
    public void resetScore(View view) {
        teamScoreA = teamScoreB = 0;
        updateScoreTeamA();
        updateScoreTeamB();
    }

    /**
     * Method updates the score of Team A.
     */
    private void updateScoreTeamA() {
        TextView teamAScoreTextView = findViewById(R.id.team_a_score);
        teamAScoreTextView.setText(String.valueOf(teamScoreA));
    }

    /**
     * Method updates the score of Team B.
     */
    private void updateScoreTeamB() {
        TextView teamAScoreTextView = findViewById(R.id.team_b_score);
        teamAScoreTextView.setText(String.valueOf(teamScoreB));
    }
}