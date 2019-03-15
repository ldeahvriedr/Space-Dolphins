import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCounter extends Actor
{
    public void act(){
        int score = ((Space)getWorld()).score;
        setImage(new GreenfootImage("SCORE: " + score, 40, Color.WHITE, null));
    }    
}