package TextBoxMiddleOfCanvas;

import objectdraw.*;

/**
 * Write a description of class TextBoxMiddleOfCanvas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBoxMiddleOfCanvas extends WindowController
{
    public void begin()
    {
        //new Text("",0,0,canvas);
        Text myText = new Text("w:" + canvas.getWidth(),0,0,canvas);
        
        //don't forget to take width of textbox into account.
        double x = canvas.getWidth()/2 - myText.getWidth()/2;
        double y = canvas.getHeight()/2 - myText.getHeight()/2;
        
        //now I will move the text box so its centered
        myText.moveTo(x,y);
    }
}
