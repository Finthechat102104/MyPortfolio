package Euros_To_Dollars;
import java.util.Scanner;

/**
 * Write a description of class EurosToDolllars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EurosToDolllars
{
    public static void main(String[] args) {
        //Create a Scanner Object so I can read in from the 
        // command line.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many dollars do you want to convert?");
        double dollars = keyboard.nextDouble();
        System.out.print("What is the euros-per-dollar exchange rate?");
        double rate = keyboard.nextDouble();
        double result = dollars*rate;
        System.out.printf("%.2f dollars => %.2f ", dollars,result);
        
    }
}