package com.example.minesweeper;

public class Board {

    public static void print ( final int[][] grid, final int width, final int height){
        for(int x=0;x< width; x++){
            String txtPrint = " | ";
            for(int y=0; y<height;y++){
                txtPrint += String.valueOf(grid[x][y]).replace("-1", "B")+" | ";
            }
            System.out.println(txtPrint);
        }

    }
}
