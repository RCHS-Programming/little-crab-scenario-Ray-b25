import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turnAtEdge();
        move();
        eatCrab();
        randomTurn();
    }
    /*
     * Turns the lobster 17 degrees to the right if it is
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
     * Moves the lobster 5 constantly.
     */
    public void move()
    {
         move(5);
    }
    /*
     *Check whether lobster is touching a crab. If it is, eat the crab.
     *If not, do nothing. 
     */
    public void eatCrab()
    {
        if(isTouching(Crab.class))
        {
            removeTouching(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
    /*
     * Turns the lobster randomly left or right up to 45 degrees 10% of 
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
