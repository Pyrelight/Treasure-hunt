import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class path here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class path extends World
{

    /**
     * Constructor for objects of class path.
     * 
     */
    public path()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 60, 1); 
        addObject(new Startline(),getWidth() / 2, getHeight() / 2);
        addObject(new Robot(),getWidth() / 2, getHeight() / 2);        
    }
}
