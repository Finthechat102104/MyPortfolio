package DecisionMaking;
import objectdraw.*;
import java.awt.*;

/**
 * A voting program
 */
public class DecisionMaking extends WindowController
{
    
    private double midX;
    private Text display;
    
    public void begin()
    {
        
        midX = canvas.getWidth() / 2;
        new Line(midX, 0, midX, canvas.getHeight(), canvas);
        display = new Text("Nothing clicked yet", 50, 50, canvas);
        
    }
    
    public void onMouseClick(Location point)
    {
        
        if(point.getX() < midX)
        {
            display.setText("Left Clicked");
            // left side
        } else {
            display.setText("Right Clicked");
            // right side
        }
        
    }
    
}
