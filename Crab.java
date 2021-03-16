import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        turnAtEdge();
        move();
        eatWorm();
        randomTurn();
    }
    /*
     * Turns the crab 17 degrees to the right if it is
     * touching the edge.
     */
    public void turnAtEdge()
    {
        if (isAtEdge ())
        {
            turn(17);   
        }   
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
        }
    }
    /*
     * Turns the crab randomly left or right up to 45 degrees 10% of 
     * the time.
     */
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(91)-45);
        }
    }
}

