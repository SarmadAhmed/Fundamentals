import greenfoot.*;

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    
    int age;
    public static final int FLOWER_LIFE = 200;
    public Flower()
    {
        age = 0;
        selectFlowerImage();
    }
    
    public Flower( int startingAge)
    {
        age = startingAge;
        selectFlowerImage();
    }
    
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        age +=1;
        if (age % 30 == 0)
        {
            fade();
        }    
        checkToRemoveObject();
    }
    
    public void fade()
    {
        GreenfootImage myImageAssistant = getImage();
        int previousTransparency = myImageAssistant.getTransparency();
        int newTransparency = (int)(((double )previousTransparency * .8));
        myImageAssistant.setTransparency(newTransparency);
    }
   
    public void checkToRemoveObject()
    {
        if (age == FLOWER_LIFE)
        {
           World myWorldAssistant = getWorld();
           myWorldAssistant.removeObject(this);
        }
    }
    
    public void selectFlowerImage()
    {
        int choice = Greenfoot.getRandomNumber(3);
        if (choice == 0)
        {setImage("flower2.png");
        }
        else if (choice == 1)
        { setImage("sunflower.png");
        }
        else if (choice == 2)
        {setImage("tulip.png");
        }
        else 
        { setImage ("ant3.png");
        }
    }
}
       

