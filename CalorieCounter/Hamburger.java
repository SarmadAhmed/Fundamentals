import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hamburger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hamburger extends GenericFoodItem
{
    /**
     * Act - do whatever the Hamburger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         super.act();
          if (inLeftHalf)
        {
            turn(10);
        }    
    }    
    public Hamburger()
    {
        super();
        caloriesForItem = 354;
    }
}
