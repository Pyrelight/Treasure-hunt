import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private final static int OOPS = 10;
    private final static int CM = 5;
    public MyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 60, 1, false); 
        addObject(new Startline(), getWidth() / 2, getHeight() / 2);
        addObject(new Robot(), getWidth() /2, getHeight() /2);
        String str = Greenfoot.ask("Distance? (+/-)");
        int distance = Integer.parseInt(str);
        addObject(new Treasure(), getWidth() / 2 - distance * CM, getHeight() / 2);
    }
}
