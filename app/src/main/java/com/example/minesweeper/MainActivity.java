package com.example.minesweeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Create btn
    private Button resetBtn, coverBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get a game view and display it
        GameView.getInstance().createGrid(this);

        //Reset game and generate a new instance of Grid
        resetBtn = findViewById(R.id.reset);
        resetBtn.setOnClickListener((v) -> {
            GameView.getInstance().createGrid(this);
        });

        //Uncover Mine Sweeper game
        coverBtn = findViewById(R.id.uncover);
        coverBtn.setTag(1);
        coverBtn.setText("UNCOVER MODE");
        coverBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                final int status =(Integer) v.getTag();
                if(status == 1) {
                    //mPlayer.start();
                    coverBtn.setText("MARKING MODE");
                    v.setTag(0); //pause
                } else {
                    coverBtn.setText("UNCOVER MODE");
                    v.setTag(1); //pause
                }
            }
        });
    }

}