package BmiConverter;
import java.util.Scanner;

/**
 * Write a description of class BMI_Converter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BMI_Converter
{
    public static void main(String[] agrs) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your weight in pounds?\n");
        double weight = keyboard.nextDouble();
        System.out.print("What is your height in inches?\n");
        double height = keyboard.nextDouble();
        double result = (weight*703)/(height*height);
        System.out.printf("Your BMI is: %.2f\n", result);
        
    }
}