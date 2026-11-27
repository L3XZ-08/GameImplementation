import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private int damageBull = 15;
    public Bullet()
    {
        GreenfootImage image = getImage();
        image.scale(5, 5);
    }

    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(20);
        Bee bee = (Bee)getOneIntersectingObject(Bee.class);
        if (bee != null)
        {
            bee.takeDamage(damageBull);
            getWorld().removeObject(this);
        }
    }
}

