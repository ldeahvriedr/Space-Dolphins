import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Actor
{
    public Instructions(){
        setImage(new GreenfootImage("S   P   A   C   E     D   O   L   P   H   I   N   S \n ---------------------------------------------------------\n W - MOVE FORWARD \n S - MOVE BACKWARDS \n A - ROTATE LEFT \n D - ROTATE RIGHT \n CLICK ON DOLPHINS \n\n\n\n\n\n\n\n PRESS 'RUN' TO START", 50, Color.WHITE, null));
    }
    
    public void act() 
    {
        getWorld().removeObject(this);
    }    
}