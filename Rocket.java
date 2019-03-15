import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rocket extends Actor
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("s")){  
            move(-4);
        }
        if(Greenfoot.isKeyDown("w")){
            move(4);
        }
        if(Greenfoot.isKeyDown("a")){
            turn(-4);
        }
        if(Greenfoot.isKeyDown("d")){
            turn(4);
        }
    }
}