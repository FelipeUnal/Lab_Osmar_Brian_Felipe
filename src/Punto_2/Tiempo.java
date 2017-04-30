/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto_2;





public class Tiempo {
    private String Horas;
    private String Minutos;

    public Tiempo() {
        this.Horas = getHoras();
        this.Minutos = getMinutos();
    }

    public String getHoras() {
        return Horas;
    }

    public void setHoras(String Horas) {
        if(Horas.length()!=2){ 
            System.out.println("Por favor ingrese 2 numeros del 00 al 24 ");
            return ;        
        }
        this.Horas = Horas;
    }

    public String getMinutos() {
        return Minutos;
    }

    public void setMinutos(String Minutos) {
        if(Minutos.length()!=2){ 
            System.out.println("Por favor ingrese 2 numeros del 00 al 24 ");
            return ;        
        }
        this.Minutos = Minutos;
    }
    
    public String GetHorario(){
        return Horas+":"+Minutos+":00";
    }
    
    
    
    
}
