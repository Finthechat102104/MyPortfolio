package RockPaperScissors;

import objectdraw.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
/**
 * Write a description of class SimpleVisibleImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleVisibleImage
{
    // instance variables - replace the example below with your own
    private BufferedImage myImage;
    private VisibleImage myVisibleImage;
    private File file;
    private String filename;

    /**
     * Constructor for objects of class SimpleVisibleImage
     */
    public SimpleVisibleImage(String filename, Location l, DrawingCanvas canvas)
    {
        // initialise instance variables
        this.filename = filename;
        this.file = new File(filename);
        try { 
            myImage = ImageIO.read(file); }
        catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not open file: " + file);
        }
        if (myImage == null) {
            throw new RuntimeException("Invalid image file: " + file);
        }
        myVisibleImage = new VisibleImage(myImage,l,canvas);
    }
    
    public SimpleVisibleImage(String filename,double x,double y,DrawingCanvas canvas)
    {
        this(filename,new Location(x,y),canvas);
    }
    
    public Location getLocation()
    {
        return myVisibleImage.getLocation();
    }
    
    public void setSize(double width, double height)
    {
        myVisibleImage.setSize(width,height);
    }

    public double getX()
    {
        return myVisibleImage.getX();
    }
    
    public double getY()
    {
        return myVisibleImage.getY();
    }
    
    public boolean contains(Location l)
    {
        return myVisibleImage.contains(l);
    }
    
    public void move(double x,double y)
    {
        myVisibleImage.move(x,y);
    }

    public void show()
    {
        myVisibleImage.show();
    }
    
    public void hide()
    {
        myVisibleImage.hide();
    }

    public boolean isHidden()
    {
        return myVisibleImage.isHidden();
    }
}
