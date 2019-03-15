import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Dolphin extends Actor
{
    public void act() 
    {
        Actor rocketCheck = getOneObjectAtOffset(0, 0, Rocket.class);
        
        if(rocketCheck == null){
            Rocket rocket = (Rocket)getWorld().getObjects(Rocket.class).get(0);
        
            turnTowards(rocket.getX(), rocket.getY());
            move(3);
        }
        else{
            hitRocket();
        }
        
        if(Greenfoot.mouseClicked(this)){
            ((Space)getWorld()).changeNumOfDols();
            ((Space)getWorld()).changeScore();
            getWorld().removeObject(this);
        }
    }
    
    public void hitRocket(){
        GameOver gameover = new GameOver();
        getWorld().addObject(gameover, 500, 400);
        
        ((Space)getWorld()).removeRocket();
        ((Space)getWorld()).removeDolphins();
        Greenfoot.stop();
    }
}