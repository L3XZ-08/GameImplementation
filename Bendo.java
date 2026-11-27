import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bendo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bendo extends Actor
{   
    private int gunReloadTime;              
    private int reloadDelayCount;          
    private int shotsFired; 
    private int health = 100;
    private int damageBee = 20;
    public Bendo()
    {
        GreenfootImage image = getImage();
        image.scale(50, 50);
        gunReloadTime = 5;
        reloadDelayCount = 0;
        shotsFired = 0;
    }       

    /**
     * Act - do whatever the Bendo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        aim();
        shoot();
    }

    public void move()
    {
        if (Greenfoot.isKeyDown("W") )
        {
            move(4);
        }
        if (Greenfoot.isKeyDown("S"))
        {
            move(-3);
        }   
    }

    public void aim()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null)
        {
            turnTowards(mouse.getX(), mouse.getY());
        }
    }

    public void shoot()
    {
        if (Greenfoot.mouseClicked(null))
        {
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet, this.getX(), this.getY());
            bullet.setRotation(getRotation());
        }
    }
    public void takeDamage(int damageBee)
    {
        health = health - damageBee;
        if (health <= 0)
        {
            getWorld().removeObject(this);
        }
    }
} 

