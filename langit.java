import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class langit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class langit extends World
{
  private int skorRocket;
  private int nyawaRocket;
    /**
     * Constructor for objects of class langit.
     * 
     */
    public langit()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * Th at is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        rocket rocket = new rocket();
        addObject(rocket,48,216);
        SpaceObject spaceObject = new SpaceObject();
        addObject(spaceObject,727,44);
        SpaceObject spaceObject2 = new SpaceObject();
        addObject(spaceObject2,740,119);
        SpaceObject spaceObject3 = new SpaceObject();
        addObject(spaceObject3,639,102);
        SpaceObject spaceObject4 = new SpaceObject();
        addObject(spaceObject4,738,309);
        SpaceObject spaceObject5 = new SpaceObject();
        addObject(spaceObject5,770,404);
        SpaceObject spaceObject6 = new SpaceObject();
        addObject(spaceObject6,665,374);
        SpaceObject spaceObject7 = new SpaceObject();
        addObject(spaceObject7,664,262);
        SpaceObject spaceObject8 = new SpaceObject();
        addObject(spaceObject8,754,210);
        SpaceObject spaceObject9 = new SpaceObject();
        addObject(spaceObject9,720,491);
        SpaceObject spaceObject10 = new SpaceObject();
        addObject(spaceObject10,619,538);
    }
    
    public int getSkorRocket() {
        return skorRocket;
    }
    
    public int getNyawaRocket() {
        return nyawaRocket;
    }
    
    public void updSkor(int x){
        skorRocket+=x;
    }
    
    public void updNyawa(){
        nyawaRocket--;
    }
}
