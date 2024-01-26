import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RockObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RockObject extends Actor
{
    /**
     * Act - do whatever the RockObject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move (-5);

        if(isAtEdge())
        {
            setLocation(590,getY());
        }

    }

    public void kenaRockObject() {
        if (isTouching(RockObject.class)){
            removeTouching(RockObject.class);
        }
    }
}
