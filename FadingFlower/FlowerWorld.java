import greenfoot.*;

/**
 * Write a description of class FlowerWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlowerWorld extends World
{
    private static final int ADD_FREQUENCY = 50;
    private int worldAge;
    /**
     * Constructor for objects of class FlowerWorld.
     * 
     */
    public FlowerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        worldAge = 0;
        populateFlowerBed();
    }
    
    public void act()
    {
        worldAge += 1;
        checkToAddFlower();
    }
    
    public void populateFlowerBed()
    {
        for (int i = 0; i < 8; i++)
        {
            int randomAge = Greenfoot.getRandomNumber (Flower.FLOWER_LIFE);
            addObject( new Flower(randomAge),
            Greenfoot.getRandomNumber(getWidth()), getHeight() - 30);
        }
    }
    
    public void checkToAddFlower()
    { 
          if (worldAge % ADD_FREQUENCY == 0)
          {  
              addObject(new Flower(),
              Greenfoot.getRandomNumber( getWidth()), getHeight()-30);
          }
    }
}