package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Total Runs, Wicktes and Balls For Team A and B.
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int wktsTeamA = 0;
    int ballsTeamA = 0;
    int wktsTeamB = 0;
    int ballsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayRunsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayWktsForTeamA(int wkts) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wkt);
        scoreView.setText(String.valueOf(wkts));
    }

    /**
     * Displays the calculated Overs for Team A.
     */
    public void displayOversForTeamA(int ball) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_over);
        scoreView.setText(String.valueOf(ball));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayBallsForTeamA(int ball) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_ball);
        scoreView.setText(String.valueOf(ball));
    }

    /**
     * Displays Wicktes for Team A.
     */
    public void WktsForTeamA(View view){
        wktsTeamA += 1;
        displayWktsForTeamA(wktsTeamA);
    }

    /**
     * Displays Balls for Team A.
     */
    public void BallsForTeamA(View view){
        ballsTeamA += 1;
        displayBallsForTeamA(ballsTeamA);
    }

    /**
     * Displays 6 Runs for Team A.
     */
    public void SixRunsForTeamA(View view){
        scoreTeamA += 6;
        displayRunsForTeamA(scoreTeamA);
    }

    /**
     * Displays 4 Runs for Team A.
     */
    public void FourRunsForTeamA(View view){
        scoreTeamA += 4;
        displayRunsForTeamA(scoreTeamA);
    }

    /**
     * Displays 3 Runs for Team A.
     */
    public void ThreeRunsForTeamA(View view){
        scoreTeamA += 3;
        displayRunsForTeamA(scoreTeamA);
    }

    /**
     * Displays 2 Runs for Team A.
     */
    public void TwoRunsForTeamA(View view){
        scoreTeamA += 2;
        displayRunsForTeamA(scoreTeamA);
    }

    /**
     * Displays 1 Run for Team A.
     */
    public void OneRunForTeamA(View view){
        scoreTeamA += 1;
        displayRunsForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayRunsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given wicktes for Team B.
     */
    public void displayWktsForTeamB(int wkts) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wkt);
        scoreView.setText(String.valueOf(wkts));
    }

    /**
     * Displays the given balls for Team B.
     */
    public void displayBallsForTeamB(int ball) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_ball);
        scoreView.setText(String.valueOf(ball));
    }

    /**
     * Displays Wicktes for Team B.
     */
    public void WktsForTeamB(View view){
        wktsTeamB += 1;
        displayWktsForTeamB(wktsTeamB);
    }

    /**
     * Displays Balls for Team B.
     */
    public void BallsForTeamB(View view){
        ballsTeamB += 1;
        displayBallsForTeamB(ballsTeamB);
    }

    /**
     * Displays 6 Runs for Team B.
     */
    public void SixRunsForTeamB(View view){
        scoreTeamB += 6;
        displayRunsForTeamB(scoreTeamB);
    }

    /**
     * Displays 4 Runs for Team B.
     */
    public void FourRunsForTeamB(View view){
        scoreTeamB += 4;
        displayRunsForTeamB(scoreTeamB);
    }

    /**
     * Displays 3 Runs for Team B.
     */
    public void ThreeRunsForTeamB(View view){
        scoreTeamB += 3;
        displayRunsForTeamB(scoreTeamB);
    }

    /**
     * Displays 2 Runs for Team B.
     */
    public void TwoRunsForTeamB(View view){
        scoreTeamB += 2;
        displayRunsForTeamB(scoreTeamB);
    }

    /**
     * Displays 1 Run for Team B.
     */
    public void OneRunForTeamB(View view){
        scoreTeamB += 1;
        displayRunsForTeamB(scoreTeamB);
    }


    /**
     * Reset score of Team A and B.
     */
    public void resetButton(View view){
        /**
         * Reset for Team A
         */

        scoreTeamA = 0;
        wktsTeamA = 0;
        ballsTeamA = 0;
        displayRunsForTeamA(scoreTeamA);
        displayWktsForTeamA(wktsTeamA);
        displayBallsForTeamA(ballsTeamA);

        /**
         * Reset for Team B
         */

        scoreTeamB = 0;
        wktsTeamB = 0;
        ballsTeamB = 0;
        displayRunsForTeamB(scoreTeamB);
        displayWktsForTeamB(wktsTeamB);
        displayBallsForTeamB(ballsTeamB);
    }
}
