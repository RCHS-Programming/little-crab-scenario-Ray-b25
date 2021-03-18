import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        move();
        eatWorm(); 
        arrowKeyTurn();
        
    }
    /*
     * Moves the crab 5 constantly.
     */
    public void move()
    {
         move(5);
    }
    /*
     *Check whether crab is touching a worm. If it is, eat the worm.
     *If not, do nothing. 
     */
    public void eatWorm()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
    /*
     * Check whether an arrow key is being pressed. If it is, 
     * turn the crab in that direction.
     */
    public void arrowKeyTurn()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn (-10);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn (10);
        }
    }
}

