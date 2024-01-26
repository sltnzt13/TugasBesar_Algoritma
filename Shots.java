import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shots extends Actor
{
    public static int points = 0;
    /**
     * Act - do whatever the Shots wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        checkCollision();
        displayPoints();
    }
    
   private void checkCollision() {
        // Cek sentuhan dengan SpaceObject
        SpaceObject spaceObject = (SpaceObject) getOneIntersectingObject(SpaceObject.class);
        if (spaceObject != null) {
            // Sentuhan terdeteksi dengan SpaceObject
            handleCollision(spaceObject);
        }

        // Cek sentuhan dengan RockObject
        RockObject rockObject = (RockObject) getOneIntersectingObject(RockObject.class);
        if (rockObject != null) {
            // Sentuhan terdeteksi dengan RockObject
            handleCollision(rockObject);
        }
    }

    private void handleCollision(Actor object) {
        if (object instanceof SpaceObject) {
            // Sentuhan dengan SpaceObject
            getWorld().removeObject(object);
            points += 10;
            checkPoints();
        } else if (object instanceof RockObject) {
            // Sentuhan dengan RockObject
            getWorld().removeObject(object);
            points += 50;
            checkPoints();
        }
    }

    private void checkPoints() {
        if (points >= 100) {
            // Jika poin mencapai 100, pindahkan dunia ke angkasa
            Greenfoot.setWorld(new angkasa());
        }
        if (points >= 1000) {
            // Jika poin mencapai 1000, berhenti permainan dan tampilkan "tamat"
            getWorld().showText("Tamat", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
        }
    }
    
    private void displayPoints() {
        // Tampilkan poin di layar
        getWorld().showText("Points: " + points, 100, 50);
    }
}
