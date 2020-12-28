# MineSweeperApp
Introduction
In this assignment you will be tasked with building a custom view that will render and implement the rules
of minesweeper. Assuming you are not already familiar with minesweeper, the premise of the game is
simple. You are given a two-dimensional grid representing a minefield. However, all of the cells are
covered so you cannot see what is underneath. To sweep the minefield you must uncover cells one after
the other until all non-mined cells are uncovered. Non-mined cells will include a number indicating how
many adjacent cells contain a mine relative to that cell. If there are no adjacent mines a number will not
be displayed.
Players should be able to use a combination of a logical reasoning and a little bit of guesswork to
determine what cells contain mines. If a cell contains a mine they should be able to mark it as such. Any
time a player clicks on a marked cell (usually by accident) it will not uncover. Unless the user explicitly
unmarks it.
You will be tasked with building a fully working game of minesweeper running on a 10x10 board with 20
mines. Players should be able to reset the game, switch between marking and uncovering modes and have
some information displayed to them about how many mines they have marked and how many mines
there are in total.

Milestones:
Please make sure that you complete milestones properly before moving onto the next one. The
percentage in brackets indicates the maximum score you can achieve if you pass that milestone.


  1) Define the shell of a custom view class and generate a layout for the main activity consisting of
the custom view, two buttons, and two textviews.


  2) Draw the initial state of the game board with all cells covered. Black should be used as the fill
colour and white lines should separate the cells


  3) Implement the basic touch behaviour that will uncover a cell. When a cell is uncovered it should
change from a black colour to a grey colour.


  4) Implement methods to place 20 mines randomly in the minefield and render the mines when a
cell is uncovered. A cell containing a mine should have a red background with a black M in the
foreground.


  5) Modify the touch behaviour to stop accepting input when a mine is uncovered. It should only
reenable input when the user has clicked the reset button.


  6) The other button should switch between displaying “uncover mode” or “marking mode” each
time it is clicked. In uncover mode each touch should result in a cell being uncovered. In marking
mode each time a covered cell is touched, it should change to yellow to denote it is marked or
back to black, to denote it is unmarked. Use the two text fields to denote the total number of
mines and the number of mines marked. In uncover mode, touching a marked cell should do
nothing.
