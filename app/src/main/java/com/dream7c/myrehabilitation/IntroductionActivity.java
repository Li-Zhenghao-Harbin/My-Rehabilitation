package com.dream7c.myrehabilitation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class IntroductionActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        // initial
        setTitle(MainActivity.targetActivityTitle);
        TextView txIntroduction = findViewById(R.id.tx_introduction_content);
        txIntroduction.setText("RG is a rehabilitation game that players can move and rotate the accelerometers by their hands to control the game characters, which helps people who have had a stroke recover.");
        TextView txGoal = findViewById(R.id.tx_goal_content);
        txGoal.setText("1. Control the game character to get cards (randomly generated on the ground);\n\n2. Draw shapes in sequence according to the card to active it;\n\n3. Get enough game points or let the opponent player's health point to zero to win the game.");
        TextView txHowToPlay = findViewById(R.id.tx_howtoplay_content);
        txHowToPlay.setText("Player1\n\n\'A/D/W/S\' control game character to move toward four directions (left/right/up/down)\n\'E\' draw square\n\'R\' draw upper triangle\n\'T\' draw lower triangle\n\'Y\' clear the shapes\n\n" +
                "Player2\n\n\'J/L/I/K\' control game character to move toward four directions (left/right/up/down)\n\'O\' draw square\n\'P\' draw upper triangle\n\'[\' draw lower triangle\n\']\' clear the shapes\n");
    }
}
