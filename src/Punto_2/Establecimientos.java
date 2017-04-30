/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto_2;

import java.util.TreeMap;

/**
 *
 * @author Grimma
 */
public class Establecimientos {
    private TreeMap<String,Arriendo> sedes;

    public Establecimientos() {
        this.sedes = new TreeMap<>();
    }
    
    public void addProduct(Arriendo a){
        this.sedes.put(a.getDireccion(),a);
        
    }
    
    public void removeArriendo(Arriendo a){
        this.sedes.remove(a.getDireccion());
    }
    
    public void ListadeProductos(){
        System.out.println("");
        System.out.println("Lista de establecimientos :");
        for(Arriendo a : this.sedes.values()){
            System.out.println("- "+a.getDireccion()+" : "+a.getCosto());
        }
    }
    
    public double getCostoTotal(){
        double valor = 0;
        for(Arriendo a : this.sedes.values()){
            valor += a.ValorLocal();
        }
        return valor;
    }
    
    
}
