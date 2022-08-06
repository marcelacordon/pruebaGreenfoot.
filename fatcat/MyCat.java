import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (Marcela Cordon) 
 * @version (25/07/2022)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    { 
        if (isHungry()==true){
            eat();
        }
        if (isSleepy()==true){
            sleep(3);
            shoutHooray();   
        }else{
            shoutHooray();  
        }
        if (isBored()==true){
            dance();
        }
        if (isAlone()==true){
            sleep(5);
        }
        if (hasCompany()==true){
            shoutHooray();
        }
        
    }
}
