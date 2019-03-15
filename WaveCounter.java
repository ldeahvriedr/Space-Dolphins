import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WaveCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaveCounter extends Actor
{
    public void act(){
        int wave = ((Space)getWorld()).wave;
        setImage(new GreenfootImage("WAVE: " + wave, 40, Color.WHITE, null));
    }    
}