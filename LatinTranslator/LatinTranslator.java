import objectdraw.*;

/**
 * Write a description of class LatinTranslator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LatinTranslator extends WindowController
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class LatinTranslator
     */
    public LatinTranslator()
    {
        // initialise instance variables
        Text label = new Text("Translating strawberry:",0,0,canvas);
        Text response = new Text(Translate("strawberry"),0,20,canvas);
    }

    public String Translate(String word)
    {
        if(beginsWithVowel(word))
        { 
            return word +"way";
        } else {
            while(!beginsWithVowel(word))
            {
                word = word.substring(1) + word.substring(0,1);
            }
            return word +"ay";
        }
    }
    
    private boolean beginsWithVowel(String word)
    {
        char first = word.charAt(0);
        return first=='a' ||first=='e' ||first=='i' ||first=='o' ||first=='u';
    }
}
