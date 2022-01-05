package MorseCode;
import objectdraw.*;
import java.awt.*;

public class MorseCode extends WindowController
{
    
    // Location where code entered is displayed
    private static final Location DISPLAY_POS = new Location( 30, 30);
    
    // Minimum time (in milliseconds) for a dash
    private static final double DASH_TIME = 200;
    
    // String to hold sequence entered so far
    private String currentCode = "";
    private final String[] patternArray = 
    {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", 
    "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", 
    ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", 
    ".-.-.-", "--..--", "..--..", "-.-.--", ".----.", ".-..-.", "-.--.", "-.--.-", ".-...", "---...", 
    "-.-.-.", "-..-.", "..--.-", "-...-", ".-.-.", "-....-", "...-..-", ".--.-."};
    private final String[] charArray = 
    {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
    "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?", "!", "'", "\"", 
    "(", ")", "&", ":", ";", "/", "_", "=", "+", "-", "$", "@"};
    // Text used to display sequence on canvas
    private Text patternDisplay;
    private Text charDisplay;
    private Text nextLetterText;
    private Text nextWordText;
    private Text currentLetter;
    
    // Time when mouse was last depressed
    private double pressTime;
    
    // Next letter button
    private FramedRect nextLetter,nextWord;
    
    // Create display
    public void begin()
    {
        patternDisplay = new Text("Code = ", DISPLAY_POS, canvas);
        charDisplay = new Text("", 30, 50, canvas);
        nextLetter = new FramedRect(80, 300, 80, 45, canvas);
        nextLetterText = new Text(("Next Letter"),0,0,canvas);                
        double x = nextLetter.getX() + nextLetter.getWidth()/2 - nextLetterText.getWidth()/2;
        double y = nextLetter.getY() + nextLetter.getHeight()/2 - nextLetterText.getHeight()/2;
        nextLetterText.moveTo(x,y);
        nextWord = new FramedRect(200, 300, 80, 45, canvas);
        nextWordText = new Text(("Next Word"),0,0,canvas);                
        double a = nextWord.getX() + nextWord.getWidth()/2 - nextWordText.getWidth()/2;
        double b = nextWord.getY() + nextWord.getHeight()/2 - nextWordText.getHeight()/2;
        nextWordText.moveTo(a,b);
        
    }
    
    public void onMousePress (Location point)
    {
        pressTime = System.currentTimeMillis();
        if(nextWord.contains(point))
        {
             charDisplay.setText(charDisplay.getText() + " ");
        }
        
    }

    
    public void onMouseRelease(Location point)
    {
        if(System.currentTimeMillis() - pressTime > DASH_TIME)
            {
                currentCode = currentCode + "-";
            }
        else
            {
                currentCode = currentCode + ".";
            }
        patternDisplay.setText("Code = " + currentCode);
        
        //for loop over pattern arry
        for (int i=0; i<patternArray.length; i++)
        {
            if(currentCode.equals(patternArray[i]))
            {
                charDisplay.setText(charArray[i]);
            }
            
        }
        
    }

}