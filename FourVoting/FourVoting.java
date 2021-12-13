package FourVoting;

import objectdraw.*;
import java.awt.*;

public class FourVoting extends WindowController {
    // coordinates of canvas, including x and y coords of middle
    private static final int A_BOUNDARY = 150;
    private static final int B_BOUNDARY = 300; 
    private static final int C_BOUNDARY = 450;
    private static final int TOP = 0;
    private static final int BOTTOM = 200;
    private static final int LEFT = 0;

    // x coordinates of A,C and B,D text messages
    private static final int TEXT_A_X = 20;
    private static final int TEXT_B_X = A_BOUNDARY + 20; 
    private static final int TEXT_C_X = B_BOUNDARY + 20; 
    private static final int TEXT_D_X = C_BOUNDARY + 20; 

    // y coordinates of A,B, C,D text messages
    private static final int DISPLAY_Y = 20;

    private int countA = 0;       // number of votes for A
    private int countB = 0;       // number of votes for B
    private int countC = 0;       // number of votes for C
    

    private Text infoA;           // display of votes for A
    private Text infoB;           // display of votes for B
    private Text infoC;           // display of votes for C
    private Text infoD;           // display of votes for D

    //if you run this command, instead of from the run controller button but by 
    // creating a new FourVotingSolution, it will open the window at the predetermined size.
   
    // Create displays with instructions on how to vote
    public void begin() {
        resize(600,250);
        infoA = new Text( countA + " votes for A.",  
            TEXT_A_X, DISPLAY_Y, canvas );
        infoB = new Text( countB + " votes for B.",  
            TEXT_B_X, DISPLAY_Y, canvas );
        infoC = new Text( countA + " votes for C.",  
            TEXT_C_X, DISPLAY_Y, canvas );
        infoD = new Text("There is no winner yet.",  
            TEXT_D_X, DISPLAY_Y, canvas );

        new Line( A_BOUNDARY, TOP, A_BOUNDARY, BOTTOM, canvas );
        new Line( B_BOUNDARY, TOP, B_BOUNDARY, BOTTOM, canvas );
        new Line( C_BOUNDARY, TOP, C_BOUNDARY, BOTTOM, canvas );
    }

    // Update votes and display vote counts
    public void onMouseClick( Location location ) 
    {
        if(location.getX() < A_BOUNDARY){
            countA++;
            updateVotes(infoA,countA, 'A');
        } else if (location.getX() < B_BOUNDARY){
            countB++;
            updateVotes(infoB,countB, 'B');
        }else if (location.getX() < C_BOUNDARY){
            countC++;
            updateVotes(infoC,countC, 'C');
        }
        
        if(countA > countB && countA > countC) {
            infoD.setText("The current winner is A.");
        } else if(countB > countC && countB > countA) {
            infoD.setText("The current winner is B.");
        } else if(countC > countA && countC > countB) {
            infoD.setText("The current winner is C.");
        }
        
        if(countA == countB && countB > countC) {
            infoD.setText("A and B are tied for first place!");
        } else if(countB == countC && countC > countA) {
            infoD.setText("B and C are tied for first place!");
        } else if(countC == countA && countA > countB) {
            infoD.setText("A and C are tied for first place!");
        }
        
        if(countA == countB && countB == countC) {
            infoD.setText("We have a three way tie!!!");
        }
        
    }
    
    public void updateVotes(Text textObj,int votes,char myChar)
    {
        textObj.setText(votes + " votes for" + myChar );
    }
}   