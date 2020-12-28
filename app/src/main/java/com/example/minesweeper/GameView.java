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
    private Cell[][] MinesweeperGrid = new Cell[WIDTH][HEIGHT];

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

    public Cell getCellAt( int x , int y ){
        return MinesweeperGrid[x][y];
    }

    public void click( int x , int y ){
        if( x >= 0 && y >= 0 && x < WIDTH && y < HEIGHT && !getCellAt(x,y).isClicked() ){
            getCellAt(x,y).setClicked();

            if( getCellAt(x,y).getValue() == 0 ){
                for( int xt = -1 ; xt <= 1 ; xt++ ){
                    for( int yt = -1 ; yt <= 1 ; yt++){
                        if( xt != yt ){
                            click(x + xt , y + yt);
                        }
                    }
                }
            }

        }
    }
}