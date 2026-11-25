import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World

{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        showTextWithBigBlackFont("Welcome to Level 1!" , 400,50);

        prepare();
    }

    public void showTextWithBigBlackFont(String message,int x, int y){
        GreenfootImage bg = getBackground();
        Font font = new Font(30);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message,x,y);

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bendo bendo = new Bendo();
        addObject(bendo,263,271);
        bendo.setLocation(377,277);
        Bee bee = new Bee();
        addObject(bee,587,168);
        Bee bee2 = new Bee();
        addObject(bee2,635,302);
        Bee bee3 = new Bee();
        addObject(bee3,474,406);
        Bee bee4 = new Bee();
        addObject(bee4,229,398);
        Bee bee5 = new Bee();
        addObject(bee5,136,245);
        Bee bee6 = new Bee();
        addObject(bee6,201,107);
        Bee bee7 = new Bee();
        addObject(bee7,389,120);
        bee6.setLocation(222,135);
    }
}

