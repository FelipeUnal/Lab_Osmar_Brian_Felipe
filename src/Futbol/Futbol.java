package Futbol;
import becker.robots.*;
public class Futbol {
    private final Robot joe;
    private final City unal;
    private final Thing balon;
    public Futbol(){
        this.unal = new City(10,10);
        this.balon = new Thing(this.unal, 5, 5);
        this.joe = new Robot(unal,9,9, Direction.WEST);
        for(int i=0;i<6;i++){
            Wall blockAve0 = new Wall(unal, i, 0, Direction.WEST);       
        }   
        for(int i=0; i<15;i++){
            Wall blockAve11 = new Wall(unal, 0, i, Direction.NORTH);
        }
        for(int i=0;i<6;i++){
             Wall blockAve11 = new Wall(unal, i, 5, Direction.WEST);
        }
        for(int i=0; i<6;i++){
            Wall blockAve11 = new Wall(unal, i, 9, Direction.EAST);
        }
        for(int i=0;i<6;i++){
             Wall blockAve11 = new Wall(unal, i, 14, Direction.EAST);
        }
        for(int i=0;i<14;i++){
            if(((i == 2) || (i == 7))||(i==12)){
            } else {
                Wall blockAve11 = new Wall(unal, 5, i, Direction.SOUTH);
            }
        }

    
           
    }
    public void advance(){
        this.joe.move();
        
    }
    public void advanceLeft(){
        joe.turnLeft();
        
    }

    void advanceRigth() {
      joe.turnLeft();
      joe.turnLeft();
      joe.turnLeft();
      
      
    }
    
}

