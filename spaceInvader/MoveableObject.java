import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoveableObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveableObject extends Actor
{
    protected int speed;

    void moveLeft()
    {
        setLocation( getX() - 5, getY() );
    }

    void moveRight()
    {
        setLocation( getX() + 5, getY() );
    }

    void moveUp()
    {
        setLocation( getX(), getY() - 5 );
    }

    void moveDown()
    {
        setLocation( getX(), getY() + 5 );
    }
    
    /**
     * Act - do whatever the MoveableObject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
