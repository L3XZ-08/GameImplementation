import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{
    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public SplashScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage splash = new GreenfootImage("SplashScreen Image.png");
        setBackground(splash);
        GreenfootImage bg = getBackground();
        bg.setColor(Color.WHITE);
        bg.setFont(new Font("Arial",true, false, 28));
        bg.drawString("PRESS ENTER TO START", 250, 550);
    }

    public void  act()

    {
        // Start game when ENTER is pressed
        if ("enter".equals(Greenfoot.getKey()))
        {
            Greenfoot.setWorld(new Level1());
        }
    }
}


