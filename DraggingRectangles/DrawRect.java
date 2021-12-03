package DraggingRectangles;
import objectdraw.*;
import java.awt.*;

 public class DrawRect extends WindowController 
{
    private Location firstPoint;
    private FramedRect oldRect,newRect;
    private Text myText;
    private Text mouseText;
     
    public void begin(){
        mouseText = new Text("X:      y:       ",0,0,canvas);
       //don't forget to take width of textbox into account.
        double x = canvas.getWidth()/2 - mouseText.getWidth()/2;
        double y = canvas.getHeight() - mouseText.getHeight();
        
        //now I will move the text box so its centered
        mouseText.moveTo(x,y);                      
    }
    
    public void onMousePress(Location pressPoint) 
    {
        firstPoint = pressPoint;
        oldRect = new FramedRect(pressPoint,pressPoint,canvas);
        myText = new Text(" ",0,0,canvas);
    }
    
    public void onMouseMove(Location p)
    {
        mouseText.setText("X:" + p.getX() + " Y:" + p.getY());
        //don't forget to take width of textbox into account.
        double x = canvas.getWidth()/2 - mouseText.getWidth()/2;
        double y = canvas.getHeight() - mouseText.getHeight();
        
        //now I will move the text box so its centered
        mouseText.moveTo(x,y);    
        mouseText.setText("X:" + p.getX() + " Y:" + p.getY());
        mouseText.addToCanvas(canvas);
    }
    
    public void onMouseDrag(Location p)
    {
        oldRect.hide();
        newRect = new FramedRect(firstPoint,p,canvas);
        oldRect = newRect;
        myText.hide();
        myText = new Text("w:" + oldRect.getWidth() + " h:" + oldRect.getHeight(),0,0,canvas);
        mouseText.setText("X:" + p.getX() + " Y:" + p.getY());                
        double x = oldRect.getX() + oldRect.getWidth()/2 - myText.getWidth()/2;
        double y = oldRect.getY() + oldRect.getHeight()/2 - myText.getHeight()/2;
        myText.moveTo(x,y);
    }
    
    public void onMouseRelease(Location releasePoint)
    {
        
    }
    
    public void onMouseExit(Location p)
    {
        this.canvas.clear();
    }
    
}