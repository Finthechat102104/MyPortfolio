package RockPaperScissors;

import objectdraw.*;
import java.awt.*;
import java.util.Random;

/**
 * Write a description of class RoShamBeau here.
 * 
 * @author (Mr. Ankiewicz) 
 * @version (11-28-16)
 */
public class RoShamBeauStartingPoint extends WindowController
{
    //Instance Variables
    private SimpleVisibleImage Rock;
    private SimpleVisibleImage Paper;
    private SimpleVisibleImage Scissors;
    private Random myRandom;
    
    private String compChoice;
    private String userChoice;
    private Text compText;
    private Text userText;
    private Text winnerText;
         
    public void begin()
    {
        Rock = new SimpleVisibleImage("Rock.png",0,0,canvas);
        Rock.setSize(200,200);
        Paper = new SimpleVisibleImage("Paper.png",0,200,canvas);
        Paper.setSize(200,200);
        Scissors = new SimpleVisibleImage("Scissors.png",0,400,canvas);
        Scissors.setSize(200,200);
        resize(500,700);
        myRandom = new Random();
        userText = new Text("",0,600,canvas);
        compText = new Text("",200,600,canvas);
        winnerText = new Text("Winner is...",200,350,canvas);
    }
    
    public void onMouseClick(Location p)
    {
        //Create random choice for computer
        int compRand = myRandom.nextInt(3);
        if(compRand == 0) {
            compChoice = "rock";
        } else if(compRand==1){
            compChoice = "paper";
        } else {
            compChoice = "scissors";
        }
        //display computer choice
        compText.setText("Computer choice is " + compChoice);
        //figure out choice from user
        if( Rock.contains(p) ) {
            userChoice = "rock";
        } else if( Paper.contains(p) ){
            userChoice = "paper";
        } else if( Scissors.contains(p) ){
            userChoice = "scissors";
        }  // ends if(Rock.contains...
        userText.setText("User Choice is " + userChoice);
        //determine a winner
            if(compChoice == "rock") 
            {
            
            if(userChoice == "scissors") {
                    winnerText.setText("The computer is the winner!");
                } else if(userChoice == "paper") {
                    winnerText.setText("The player is the winner!");
                } else if(compChoice == userChoice) {
                winnerText.setText("It's a draw!");
            }
                
            } else if(compChoice == "paper") {
                
            if(userChoice == "rock") {
                    winnerText.setText("The computer is the winner!");
                } else if(userChoice == "scissors") {
                    winnerText.setText("The player is the winner!");
                } else if(compChoice == userChoice) {
                winnerText.setText("It's a draw!");
            }
                
            } else if(compChoice == "scissors") {
                
            if(userChoice == "paper") {
                winnerText.setText("The computer is the winner!");
            } else if(userChoice == "rock") {
                winnerText.setText("The player is the winner!");
            } else if(compChoice == userChoice) {
                winnerText.setText("It's a draw!");
            }
            
        }
    }
}