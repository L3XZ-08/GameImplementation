import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.*;
/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    private final static int IMAGE_COUNT= 8;

    private static GreenfootImage[] images;

    private int imageNo = 0;
    
    private int increment=1;
    
    public Explosion()
    {
        setImage(images[0]);
    }
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    setImage(images[imageNo]);

    imageNo += increment;
    if (imageNo >= IMAGE_COUNT) {
            increment = -increment;
            imageNo += increment;
     }
        
    if (imageNo < 0) {
            getWorld().removeObject(this);
    }
    }
    }

