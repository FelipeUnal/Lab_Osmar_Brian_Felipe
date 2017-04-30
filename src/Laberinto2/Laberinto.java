package Laberinto2;
import becker.robots.*;


public class Laberinto{
    private City laberinto;
    private Wall pared;
    private Thing llegada;
    private Robot robot;
    
    public Laberinto(){
        this.laberinto = new City(13,13);
        for (int i=1; i<=10; i++){
            this.pared = new Wall(laberinto,i,1,Direction.WEST);
        }
        for (int j=1; j<=10; j++){
            this.pared = new Wall(laberinto,10,j,Direction.SOUTH);
        }
        for (int i=2; i<=10; i++){
            this.pared = new Wall(laberinto,i,10,Direction.EAST);
        }
        this.pared = new Wall(laberinto,10,10,Direction.NORTH);
        
        this.pared = new Wall(laberinto,10,1,Direction.NORTH);
        this.pared = new Wall(laberinto,10,2,Direction.NORTH);
        
        this.pared = new Wall(laberinto,10,4,Direction.NORTH);
        this.pared = new Wall(laberinto,10,5,Direction.NORTH);
        this.pared = new Wall(laberinto,10,6,Direction.NORTH);
        this.pared = new Wall(laberinto,10,7,Direction.NORTH);
        
        for (int j=5; j<=9; j++){
            this.pared = new Wall(laberinto,2,j,Direction.NORTH);
        }
        
        for (int j=1; j<=4; j++){
            this.pared = new Wall(laberinto,3,j,Direction.NORTH);
        }
        
        this.llegada = new Thing(laberinto,2,11);
        
        this.robot = new Robot(laberinto,10,1,Direction.EAST);  
    }
    
    public void izquierda(){
        this.robot.turnLeft();
    }
    
    public void derecha(){
        for(int i=0; i<3; i++){
            this.robot.turnLeft();
        }
    }

    public void Apagar(){
    }

    public void Empezar(){
        Avanzar();  
    }
    
    public void Avanzar(){       
        if(this.robot.canPickThing()){
            this.robot.pickThing();
            Apagar();
        }else{
            if(this.robot.frontIsClear()){
            this.robot.move();
            Libre();
        }else{
            Libre();
        }
        }
    }
  
    public void Libre(){
        boolean fr = this.robot.frontIsClear();
        derecha();
        decision();
        decision_2();
        decision_3();     
   }
    
    public void decision(){
        boolean fr = this.robot.frontIsClear();
        if(fr){
            Avanzar();
        }
        else{
            izquierda();
        }
    }
    
    public void decision_2(){
        boolean fr = this.robot.frontIsClear();
        if(fr){
            Avanzar();
        }
        else{
            derecha();
        }
    }
    
    public void decision_3(){
        boolean fr = this.robot.frontIsClear();
        if(fr){
            Avanzar();
        }
        else{
            izquierda();
            izquierda();
            Avanzar();
        }
    }
            
}
