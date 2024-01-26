    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class SpaceObject here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class SpaceObject extends Actor
    {
        /**
         * Act - do whatever the SpaceObject wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act()
        {
            // Add your action code here.
            move (-5);
            World  w = getWorld();
            if(isAtEdge())
            {
               //w.removeObject(this);
               setLocation(590,getY());
            }
        }
        
        public void kenaSpaceObject() {
            if (isTouching(SpaceObject.class)){
                removeTouching(SpaceObject.class);
            }
        }
    }
