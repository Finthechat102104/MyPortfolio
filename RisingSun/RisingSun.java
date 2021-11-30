package RisingSun;

import objectdraw.*;
import java.awt.*;

/**
 * Write a description of class RisingSun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RisingSun extends WindowController
{
    
    private FilledOval sun;   
    private Text instructions;
    private Location initialLocation = new Location(150,350);
    
    // instance variables - replace the example below with your own
   public void begin() 
   {
       sun = new FilledOval(initialLocation,100,100,canvas);
       Color myColor = new Color(0,200,255);
       sun.setColor(myColor);
       instructions = new Text("Please click on the mouse repeatedly", 20, 20, canvas);
   }
   
   public void onMouseClick(Location point)
   {
       sun.move(0,-10);
       instructions.hide();
   }

   public void onMouseExit(Location point)
   {
       sun.moveTo(initialLocation);
       instructions.show();
   }
}