import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Space extends World
{
    int wave = 0;
    int numOfDols = 0;
    int score = 0;
    
    public Space()
    {    
        super(1000, 800, 1); 
        addObject(new Rocket(), 500, 400);
        addObject(new WaveCounter(), 75, 20);
        addObject(new ScoreCounter(), 900, 20);
        addObject(new Instructions(), 500, 400);
    }
    
    public void act(){
        if(numOfDols == 0){
            wave += 1;
            
            for(int i=0; i<wave; i++){
                int rand = Greenfoot.getRandomNumber(4);
                    
                if(rand == 0){
                    addObject(new Dolphin(), Greenfoot.getRandomNumber(1000), 0);
                }
                else if(rand == 1){
                    addObject(new Dolphin(), 1000, Greenfoot.getRandomNumber(800));
                }
                else if(rand == 2){
                    addObject(new Dolphin(), Greenfoot.getRandomNumber(1000), 800);
                }
                else if (rand == 3){
                    addObject(new Dolphin(), 0, Greenfoot.getRandomNumber(800));
                }
                
                numOfDols += 1;
            }
        }
    }
    
    public void changeNumOfDols(){
        numOfDols -= 1;
    }
    
    public void changeScore(){
        score += 1;
    }
    
    public void removeRocket(){
       removeObjects(getObjects(Rocket.class));
    }
    
    public void removeDolphins(){
        removeObjects(getObjects(Dolphin.class));
    }
}