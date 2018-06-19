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
    int wktsTeamA = 0;
    int ballsTeamA = 0;
    int oversTeamA = 0;

    int scoreTeamB = 0;
    int wktsTeamB = 0;
    int ballsTeamB = 0;
    int oversTeamB = 0;

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
        overInc();
    }

    /**
     * Over increment for Team A.
     */
    public void overInc(){
        ballsTeamA += 1;
        if(ballsTeamA == 6){
            oversTeamA += 1;
            ballsTeamA = 0;
            displayOversForTeamA(oversTeamA);
        }

        displayBallsForTeamA(ballsTeamA);
    }

    /**
     * Displays Dot Balls for Team A.
     */
    public void DotBallsForTeamA(View view){
        overInc();
    }

    /**
     * Displays Wide Balls for Team A.
     */
    public void wideBallsForTeamA(View view){
        scoreTeamA += 1;
        displayRunsForTeamA(scoreTeamA);
    }

    /**
     * Displays No Balls for Team A.
     */
    public void noBallsForTeamA(View view){
        scoreTeamA += 1;
        displayRunsForTeamA(scoreTeamA);
    }

    /**
     * Displays 6 Runs for Team A.
     */
    public void SixRunsForTeamA(View view){
        scoreTeamA += 6;
        displayRunsForTeamA(scoreTeamA);
        overInc();
    }

    /**
     * Displays 4 Runs for Team A.
     */
    public void FourRunsForTeamA(View view){
        scoreTeamA += 4;
        displayRunsForTeamA(scoreTeamA);
        overInc();
    }

    /**
     * Displays 3 Runs for Team A.
     */
    public void ThreeRunsForTeamA(View view){
        scoreTeamA += 3;
        displayRunsForTeamA(scoreTeamA);
        overInc();
    }

    /**
     * Displays 2 Runs for Team A.
     */
    public void TwoRunsForTeamA(View view){
        scoreTeamA += 2;
        displayRunsForTeamA(scoreTeamA);
        overInc();
    }

    /**
     * Displays 1 Run for Team A.
     */
    public void OneRunForTeamA(View view){
        scoreTeamA += 1;
        displayRunsForTeamA(scoreTeamA);
        overInc();
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
     * Displays the calculated Overs for Team B.
     */
    public void displayOversForTeamB(int ball) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_over);
        scoreView.setText(String.valueOf(ball));
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
        overIncB();
    }

    /**
     * Over increment for Team B.
     */
    public void overIncB(){
        ballsTeamB += 1;
        if(ballsTeamB == 6){
            oversTeamB += 1;
            ballsTeamB = 0;
            displayOversForTeamB(oversTeamB);
        }

        displayBallsForTeamB(ballsTeamB);
    }

    /**
     * Displays Dot Balls for Team B.
     */
    public void DotBallsForTeamB(View view){
        overIncB();
    }

    /**
     * Displays Wide Balls for Team B.
     */
    public void wideBallsForTeamB(View view){
        scoreTeamB += 1;
        displayRunsForTeamB(scoreTeamB);
    }

    /**
     * Displays No Balls for Team B.
     */
    public void noBallsForTeamB(View view){
        scoreTeamB += 1;
        displayRunsForTeamB(scoreTeamB);
    }


    /**
     * Displays 6 Runs for Team B.
     */
    public void SixRunsForTeamB(View view){
        scoreTeamB += 6;
        displayRunsForTeamB(scoreTeamB);
        overIncB();
    }

    /**
     * Displays 4 Runs for Team B.
     */
    public void FourRunsForTeamB(View view){
        scoreTeamB += 4;
        displayRunsForTeamB(scoreTeamB);
        overIncB();
    }

    /**
     * Displays 3 Runs for Team B.
     */
    public void ThreeRunsForTeamB(View view){
        scoreTeamB += 3;
        displayRunsForTeamB(scoreTeamB);
        overIncB();
    }

    /**
     * Displays 2 Runs for Team B.
     */
    public void TwoRunsForTeamB(View view){
        scoreTeamB += 2;
        displayRunsForTeamB(scoreTeamB);
        overIncB();
    }

    /**
     * Displays 1 Run for Team B.
     */
    public void OneRunForTeamB(View view){
        scoreTeamB += 1;
        displayRunsForTeamB(scoreTeamB);
        overIncB();
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
        oversTeamA = 0;
        displayRunsForTeamA(scoreTeamA);
        displayWktsForTeamA(wktsTeamA);
        displayBallsForTeamA(ballsTeamA);
        displayOversForTeamA(oversTeamA);

        /**
         * Reset for Team B
         */

        scoreTeamB = 0;
        wktsTeamB = 0;
        ballsTeamB = 0;
        oversTeamB = 0;
        displayRunsForTeamB(scoreTeamB);
        displayWktsForTeamB(wktsTeamB);
        displayBallsForTeamB(ballsTeamB);
        displayOversForTeamB(oversTeamB);
    }
}
