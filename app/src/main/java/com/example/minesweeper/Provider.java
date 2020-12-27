package com.example.minesweeper;


import java.util.Random;

public class Provider {

    //Provide standard GRID
    public static int [][] provide(int bomb, final int width, final int height){

        //Random Generate numbers
        Random r = new Random();

        //Create the Grid Size
        int [][] grid = new int [width][height];

        //Create the Grid based on  width and height
        for (int x=0; x<width; x++){
            grid[x] = new int [height];
        }

        while(bomb > 0) {
            int x = r.nextInt(width);
            int y = r.nextInt(height);

            //-1 is the bomb
            if(grid[x][y] != -1){
                grid[x][y] = -1;
                bomb--;
            }
        }

        //Calculate the grid neighbours
        grid = calculateNeighbour(grid,width,height);

        return grid;
    }

    //Calculate the neighbours
    private static int [][] calculateNeighbour( int [][] grid, final int width, final int height){
        for( int x = 0 ; x < width ; x++){
            for( int y = 0 ; y < height ; y++){
                grid[x][y] = getNeighbourNumber(grid,x,y,width,height);
            }
        }

        return grid;
    }

    //get number of neighbours
    private static int getNeighbourNumber(final int grid[][], final int x, final int y, final int width, final int height){
        if( grid[x][y] == -1 ){
            return -1;
        }

        int count = 0;

        if( isMineAt(grid,x - 1 ,y + 1,width,height)) count++; // top-left
        if( isMineAt(grid,x     ,y + 1,width,height)) count++; // top
        if( isMineAt(grid,x + 1 ,y + 1,width,height)) count++; // top-right
        if( isMineAt(grid,x - 1 ,y    ,width,height)) count++; // left
        if( isMineAt(grid,x + 1 ,y    ,width,height)) count++; // right
        if( isMineAt(grid,x - 1 ,y - 1,width,height)) count++; // bottom-left
        if( isMineAt(grid,x     ,y - 1,width,height)) count++; // bottom
        if( isMineAt(grid,x + 1 ,y - 1,width,height)) count++; // bottom-right

        return count;
    }

    //Mine start at x, y position
    private static boolean isMineAt(final int[][] grid, final int x, final int y, final int width, final int height){
        if( x >= 0 && y >= 0 && x < width && y < height ){
            if( grid[x][y] == -1 ){
                return true;
            }
        }
        return false;
    }
}
