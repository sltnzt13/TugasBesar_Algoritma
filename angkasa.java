import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class angkasa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class angkasa extends World
{
    private int skorRocket;
    private int nyawaRocket;
    /**
     * Constructor for objects of class angkasa.
     * 
     */
    public angkasa()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        rocket rocket = new rocket();
        addObject(rocket,63,309);
        SpaceObject spaceObject = new SpaceObject();
        addObject(spaceObject,590,19);
        spaceObject.setLocation(613,63);
        SpaceObject spaceObject2 = new SpaceObject();
        addObject(spaceObject2,698,142);
        SpaceObject spaceObject3 = new SpaceObject();
        addObject(spaceObject3,622,240);
        SpaceObject spaceObject4 = new SpaceObject();
        addObject(spaceObject4,720,352);
        SpaceObject spaceObject5 = new SpaceObject();
        addObject(spaceObject5,551,376);
        SpaceObject spaceObject6 = new SpaceObject();
        addObject(spaceObject6,693,464);
        SpaceObject spaceObject7 = new SpaceObject();
        addObject(spaceObject7,526,508);
        SpaceObject spaceObject8 = new SpaceObject();
        addObject(spaceObject8,720,554);
        SpaceObject spaceObject9 = new SpaceObject();
        addObject(spaceObject9,534,135);
        SpaceObject spaceObject10 = new SpaceObject();
        addObject(spaceObject10,752,256);
        spaceObject.setLocation(616,63);
        removeObject(spaceObject);
        removeObject(spaceObject9);
        removeObject(spaceObject2);
        removeObject(spaceObject3);
        removeObject(spaceObject10);
        removeObject(spaceObject4);
        removeObject(spaceObject5);
        removeObject(spaceObject6);
        removeObject(spaceObject8);
        removeObject(spaceObject7);
        RockObject rockObject = new RockObject();
        addObject(rockObject,658,84);
        RockObject rockObject2 = new RockObject();
        addObject(rockObject2,533,224);
        RockObject rockObject3 = new RockObject();
        addObject(rockObject3,656,286);
        RockObject rockObject4 = new RockObject();
        addObject(rockObject4,436,384);
        RockObject rockObject5 = new RockObject();
        addObject(rockObject5,619,462);
        RockObject rockObject6 = new RockObject();
        addObject(rockObject6,532,67);
        RockObject rockObject7 = new RockObject();
        addObject(rockObject7,748,383);
        RockObject rockObject8 = new RockObject();
        addObject(rockObject8,457,548);
        RockObject rockObject9 = new RockObject();
        addObject(rockObject9,730,525);
        RockObject rockObject10 = new RockObject();
        addObject(rockObject10,733,186);
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
