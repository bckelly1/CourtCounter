package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamPointsA = 0;
    int teamPointsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayMessage(int points) {
        TextView priceTextView = (TextView) findViewById(R.id.points1_text_field);
        priceTextView.setText(""+points);
    }

    public void addTwoPoints(View view) {
        teamPointsA = teamPointsA + 2;
        displayMessage(teamPointsA);
    }

    public void addThreePoints(View view) {
        teamPointsA = teamPointsA + 3;
        displayMessage(teamPointsA);
    }

    public void freeThrow(View view) {
        teamPointsA = teamPointsA + 1;
        displayMessage(teamPointsA);
    }

    private void displayMessageB(int points) {
        TextView priceTextView = (TextView) findViewById(R.id.points2_text_field);
        priceTextView.setText(""+points);
    }

    public void addTwoPointsB(View view) {
        teamPointsB = teamPointsB + 2;
        displayMessageB(teamPointsB);
    }

    public void addThreePointsB(View view) {
        teamPointsB = teamPointsB + 3;
        displayMessageB(teamPointsB);
    }

    public void freeThrowB(View view) {
        teamPointsB = teamPointsB + 1;
        displayMessageB(teamPointsB);
    }


    public void reset(View view) {
        teamPointsA = 0;
        teamPointsB = 0;
        displayMessage(teamPointsA);
        displayMessageB(teamPointsB);
    }
}
