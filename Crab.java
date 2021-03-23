import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private  int  wormsEaten; 
    public Crab()
    {
    image1 = new GreenfootImage("crab.png"); 
    image2 = new GreenfootImage("crab2.png");
    setImage(image1);
    wormsEaten  =  0;
    }
    public void act()
    {
        crabAnimation();
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
            wormsEaten  =  wormsEaten  +  1;
            
            getWorld().showText("Score: " + wormsEaten, 50, 500);
            
            if(wormsEaten  == 10)
            {
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
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
            turn (-5);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn (5);
        }
    }
    /*
     * Change the crab's amimation to the other image constantly
     */
    public void crabAnimation()
    {
         if(getImage() == image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }
}

