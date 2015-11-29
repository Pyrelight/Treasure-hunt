import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * Left ( - ) ------------------------(0)------------------------ ( + ) Right

     */
    
    public void act() 
    {
        int left_max = -1;
        int right_max = 1;
        int cur_pos = 0;
        
        
        
        while(true){      
            while(cur_pos != right_max){
                // Move right and check for intersections at each step
                move(1);
                cur_pos += 1;
                if (getOneIntersectingObject(Treasure.class) != null) {
                     System.out.println("x coordinate" + getX());
                    }
            }
 
            // assign left_max to be negative double right_max
            left_max = right_max * -2;
 
            while(cur_pos != left_max){
                // Move right and check for intersections at each step
                
                cur_pos -= 1;
                if (getOneIntersectingObject(Treasure.class) != null) {
                     System.out.println("x coordinate" + getX());
                    }
            }
 
            // assign right_max to be positive double left_max
            right_max = left_max * 2;
        }
      
       }    
    }
 
