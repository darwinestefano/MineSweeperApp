package com.example.minesweeper;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.Toast;


public class GameView {

    private static GameView instance;
    public static final int BOMB_NUMBER = 10;
    public static final int WIDTH = 10;
    public static final int HEIGHT = 10;

    private Context context;

    public static GameView getInstance() {
        if( instance == null ){
            instance = new GameView();
        }
        return instance;
    }

    private GameView(){ }

    public void createGrid(Context context){

        this.context = context;

        // create the grid and store it
        int[][] GeneratedGrid = Provider.provide(BOMB_NUMBER,WIDTH, HEIGHT);
        Board.print(GeneratedGrid,WIDTH,HEIGHT);

    }


}