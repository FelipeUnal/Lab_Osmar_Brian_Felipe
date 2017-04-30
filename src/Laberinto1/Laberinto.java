package Laberinto1;

 import becker.robots.*;
 import java.awt.Color;
 public class Laberinto {
    public Robot Bender;
    public City Planet;
    public Thing Entrega;
    private boolean frontIsclear;
    public Laberinto(){
        this.Planet = new City(11,11);
        this.Bender = new Robot(Planet, 0,0,Direction.SOUTH);
        this.Entrega = new Thing(Planet,10,8);
        for(int i=0;i<10;i++){
              Wall muro = new Wall(Planet, i, 0, Direction.WEST);
        }
        for(int i=0;i<10;i++){
              Wall muro = new Wall(Planet, 0, i, Direction.NORTH);
        } 
        for(int i=0;i<9;i++){
              Wall muro = new Wall(Planet, 9, i, Direction.SOUTH);
        } 
        for(int i=0;i<10;i++){
              Wall muro = new Wall(Planet, i, 9, Direction.EAST);
        } 
        for(int i=1;i<=9;i++){
            if(i==3||i==6){
                
            }else{
              Wall muro = new Wall(Planet, i, 1, Direction.WEST);
            }
        } 
        for(int i=0;i<=9;i++){
            if(i==2||i==9){
                
            }else{
              Wall muro = new Wall(Planet, i, 2, Direction.WEST);
            }
        } 
        for(int i=0;i<=9;i++){
            if(i==6||i==4){
                
            }else{
              Wall muro = new Wall(Planet, i, 3, Direction.WEST);
            }
        } 
        for(int i=0;i<9;i++){
            if(i==1||i==7){
                
            }else{
              Wall muro = new Wall(Planet, i, 4, Direction.WEST);
            }
        } 
        for(int i=0;i<=9;i++){
            if(i==0||i==5){
                
            }else{
              Wall muro = new Wall(Planet, i, 5, Direction.WEST);
            }
        } 
        for(int i=0;i<9;i++){
            if(i==2||i==5){
                
            }else{
              Wall muro = new Wall(Planet, i, 6, Direction.WEST);
            }
        }
          for(int i=0;i<=9;i++){
            if(i==9||i==2){
                
            }else{
              Wall muro = new Wall(Planet, i, 7, Direction.WEST);
            }
        } 
           for(int i=0;i<=9;i++){
            if(i==0||i==4){
                
            }else{
              Wall muro = new Wall(Planet, i, 8, Direction.WEST);
            }
        } 
           for(int i=0;i<=9;i++){
            if(i==8||i==1){
                
            }else{
              Wall muro = new Wall(Planet, i, 9, Direction.WEST);
            }
        }
          
              Wall muro = new Wall(Planet, 0, 1, Direction.SOUTH);
              Wall muro0 = new Wall(Planet, 2, 1, Direction.SOUTH);
              Wall muro1 = new Wall(Planet, 3, 1, Direction.SOUTH);
              Wall muro2 = new Wall(Planet, 5, 2, Direction.SOUTH);
              Wall muro3 = new Wall(Planet, 6, 3, Direction.SOUTH);
              Wall muro4 = new Wall(Planet, 1, 4, Direction.SOUTH);
              Wall muro5 = new Wall(Planet, 1, 7, Direction.SOUTH);
              Wall muro6 = new Wall(Planet, 8, 6, Direction.SOUTH);
              Wall muro7 = new Wall(Planet, 5, 5, Direction.SOUTH);
              Wall muro8 = new Wall(Planet, 4, 5, Direction.SOUTH);
              Wall muro9 = new Wall(Planet, 4, 8, Direction.SOUTH);
              Wall muro10 = new Wall(Planet, 1, 7, Direction.SOUTH);
              Wall muro11 = new Wall(Planet, 1, 7, Direction.SOUTH);
          
                       
    }
    public void Izquierda(){
       Bender.turnLeft(); 
    }
   public void Apagar(){
       
   }
    public void Derecha(){
         Izquierda();
         Izquierda();
         Izquierda();
    }
    public void Comando(){
        Avanzar();  
    }
    public void Avanzar(){
        if(Bender.canPickThing()){
            Bender.pickThing();
            Apagar();
        }else{
            if(Bender.frontIsClear()){
            this.Bender.move();
            DerechaLibre();
        }else{
            DerechaLibre();
        }
        }
        
    }
  
   public void DerechaLibre(){
    Derecha();
    
    if(Bender.frontIsClear()){
        Avanzar();
    }else{
        Izquierda();
        if(Bender.frontIsClear()){
        Avanzar();
        }else{
            Derecha();
            if(Bender.frontIsClear()){
                Avanzar();
            }else{
                Derecha();
                Derecha();
                Avanzar();
            }
        }
    }    
   }
}
    
