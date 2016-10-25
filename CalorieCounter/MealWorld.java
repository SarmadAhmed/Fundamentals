import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color; // need for color 
import java.util.Date; // need for
import java.text.DateFormat; // date and 
import java.text.*; // time 
/**
 * Write a description of class MealWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MealWorld extends World
{
   
    private int totalCalories;
    /**
     * Constructor for objects of class MealWorld.
     * 
     */
    public MealWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        printNameAndTime();
        prepareWorldWindow();
        totalCalories = 0;
        addObject ( new Hamburger(), 30, 100);
        addObject ( new Apple(), 30, 200);
        addObject ( new Bread(), 30, 300);
    }
    
    public void printNameAndTime()
     {DateFormat dateFormat = new SimpleDateFormat ("yyyy/MM/dd HH;mm;ss");
      //get current date time and Date()
      Date date = new Date();
      showText ("Sarmad Ahmed" + dateFormat.format(date), getWidth() / 3 , 15 );
    }
    
     public void prepareWorldWindow()
     {
      // need a GreenFoot Image object to do the work 
     GreenfootImage myImageHelper = getBackground();
     // remember the previous drawing color 
     Color previousColor = myImageHelper.getColor();

     // make the drawing color red 
     myImageHelper.setColor(Color.RED);
     // draw center line
      myImageHelper.fillRect(getWidth()/2,0,10,getHeight());
     // left half description 
     myImageHelper.drawString("BUFFET", getWidth()/4, getHeight() -30);
     // could also be used for tight
     showText ("MY PLATE", getWidth()*3 / 4 , getHeight() - 30);
   
     myImageHelper.setColor(previousColor);
    } 
    private void showTotalCalories()
    { 
       showText ("Total Calories" + totalCalories, getWidth() - 150, 30);
    }
    public void adjustTotalCalories (int amount)
    {
        totalCalories = totalCalories + amount;
        showTotalCalories();   // display the updated value
    
    
    }
}
