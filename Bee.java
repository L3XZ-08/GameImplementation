import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    private int health = 50;
    private int damageBee = 20;
    private int damageBull = 15;
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement();
        Bendo bendo = (Bendo)getOneIntersectingObject(Bendo.class);
        if (bendo != null)
        {
            bendo.takeDamage(damageBee);
        }
    }
    public void takeDamage(int damage)
    {
        health = health - damageBull;
        if (health <= 0)
        {
            getWorld().removeObject(this);
        }
    }
    public void movement()
    {
        move(-4);
    }
}
