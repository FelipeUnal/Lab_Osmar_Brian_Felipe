package Display7;
import becker.robots.*;

public class Display7 {
    private final Robot joe;
    private final City unal;
    private Thing balon;

    public Display7(Robot joe, City unal, Thing balon) {
        this.joe = joe;
        this.unal = unal;
        this.balon = balon;
    }

    public Thing getBalon() {
        for(int i = 1; i<6; i++){
            for(int j = 1; j<10; j++){
                this.balon = new Thing (unal, i, j);
            }
        }
        return balon;
    }

    public Display7(){
        
        this.unal = new City(11,11);
        this.joe = new Robot(unal,6,1, Direction.EAST);
        
        for(int i=1;i<6;i++){
            Wall blockAve0 = new Wall(unal, i, 1, Direction.WEST);       
        }
        
        for(int i=1; i<10;i++){
            Wall blockAve11 = new Wall(unal, 1, i, Direction.NORTH);
        }
        
        for(int i=1;i<6;i++){
             Wall blockAve11 = new Wall(unal, i, 4, Direction.WEST);
        }
        
        for(int i=1; i<6;i++){
            Wall blockAve11 = new Wall(unal, i, 9, Direction.EAST);
        }
        
        for(int i=1;i<6;i++){
             Wall blockAve11 = new Wall(unal, i, 6, Direction.EAST);
        }
        
        for(int i=1;i<10;i++){
            if(((i == 2) || (i == 5))||(i==8)){
            } else {
                Wall blockAve11 = new Wall(unal, 5, i, Direction.SOUTH);
            }
        } 
        getBalon();
    }
    
    
    
    public void advance(){
        this.joe.move();
        
    }
    public void advanceLeft(){
        joe.turnLeft();
        
    }
    public void  Pick(){
        joe.pickThing();
    }

    void advanceRigth() {
       joe.turnLeft();
       joe.turnLeft();
       joe.turnLeft();
    }
    
    void Draw0(){
        if((joe.getAvenue()==2)&&(joe.getStreet()==5)){
            for(int i = 0; i<19; i++){
                if(joe.frontIsClear() == false){
                    joe.turnLeft();
                } 
                joe.move();
                if((joe.getAvenue() == 2)&&(joe.getStreet()==4)&&(joe.canPickThing()==true)){
                    joe.pickThing();
                    joe.move();
                }
                if((joe.getAvenue() == 2)&&(joe.getStreet()==3)&&(joe.canPickThing()==true)){
                    joe.pickThing();
                    joe.move();
                }
                if((joe.getAvenue() == 2)&&(joe.getStreet()==2)&&(joe.canPickThing()==true)){
                    joe.pickThing();
                    joe.move();
                }
            }
            advanceRigth();
            joe.move();
        }
        if((joe.getAvenue()==5)&&(joe.getStreet()==5)){
            for(int i = 0; i<19; i++){
                if(joe.frontIsClear() == false){
                    joe.turnLeft();
                } 
                joe.move();
                if((joe.getAvenue() == 5)&&(joe.getStreet()==4)&&(joe.canPickThing()==true)){
                    joe.pickThing();
                    joe.move();
                }
                if((joe.getAvenue() == 5)&&(joe.getStreet()==3)&&(joe.canPickThing()==true)){
                    joe.pickThing();
                    joe.move();
                }
                if((joe.getAvenue() == 5)&&(joe.getStreet()==2)&&(joe.canPickThing()==true)){
                    joe.pickThing();
                    joe.move();
                }
            }
            advanceRigth();
            joe.move();
        }
        if((joe.getAvenue()==8)&&(joe.getStreet()==5)){
            for(int i = 0; i<19; i++){
                if(joe.frontIsClear() == false){
                    joe.turnLeft();
                } 
                joe.move();
                if((joe.getAvenue() == 8)&&(joe.getStreet()==4)&&(joe.canPickThing()==true)){
                    joe.pickThing();
                    joe.move();
                }
                if((joe.getAvenue() == 8)&&(joe.getStreet()==3)&&(joe.canPickThing()==true)){
                    joe.pickThing();
                    joe.move();
                }
                if((joe.getAvenue() == 8)&&(joe.getStreet()==2)&&(joe.canPickThing()==true)){
                    joe.pickThing();
                    joe.move();
                }
            }
            advanceRigth();
            joe.move();
        }
    }
    void Draw1(){
            if((joe.getAvenue()==2)&&(joe.getStreet()==5)){
            for(int i = 0; i<19; i++){
                if(joe.frontIsClear() == false){
                    joe.turnLeft();
                } 
                joe.move();
                if((joe.getAvenue() == 2)&&(joe.getStreet()==4)&&(joe.canPickThing()==true)){
                    joe.pickThing();
                    joe.move();
                }
                if((joe.getAvenue() == 2)&&(joe.getStreet()==3)&&(joe.canPickThing()==true)){
                    joe.pickThing();
                    joe.move();
                }
                if((joe.getAvenue() == 2)&&(joe.getStreet()==2)&&(joe.canPickThing()==true)){
                    joe.pickThing();
                    joe.move();
                }
            }
            advanceRigth();
            joe.move();
        }
    }
}


