/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto_2;

import java.util.HashMap;

/**
 *
 * @author Grimma
 */
public class Inventario {
    private HashMap<String,Producto> productos;
    private Arriendo Arr; 
    

    public Inventario() {
        this.productos = new HashMap<>();
    }

    public Arriendo getArr() {
        return Arr;
    }

    public void setArr(Arriendo Arr) {
        this.Arr = Arr;
    }
    
     
    public void addProduct(Producto p){
        if(this.productos.containsKey(p.getNombre())){
            this.productos.getOrDefault(p.getNombre(), p).setCantidad(this.productos.getOrDefault(p.getNombre(), p).getCantidad()+p.getCantidad());
        }else{
            this.productos.put(p.getNombre(),p);
        }
        
    }
    
    public void BuscarProducto(Producto p){
        if(this.productos.containsKey(p.getNombre())){
            System.out.println("");
            System.out.println("- "+p.getNombre()+" : "+p.getPesoUni()+" Kg/L, "+p.getCantidad()+" unidades, "+p.ExistenciaTotal()+" Kg/L");
            System.out.println("");
        }else{
            System.out.println("- El producto que esta buscando no esta registrado.");
        }
    }
    
    public void ListadeProductos(){
        System.out.println("");
        System.out.println("Lista de productos : "+this.Arr.getNombre()+" - "+this.Arr.getCiudad());
        for(Producto p : this.productos.values()){
            System.out.println("- "+p.getNombre()+" : "+p.getPesoUni()+" Kg/L"+" - $ "+p.getPrecio());
            System.out.println("  "+p.getNombre()+" : "+p.ExistenciaTotal()+" Kg/L"+" - $ "+p.getValorTotal());
        }
        System.out.println("Total : $ "+ValorInvent());
    }
    
    public void UtilizarProductos(Producto p, double a){
        if(this.productos.containsKey(p.getNombre())){
            if(a>this.productos.getOrDefault(p.getNombre(), p).getCantidad()){
                System.out.println("");
                System.out.println("¡No hay tal cantidad existente!");
                System.out.println(" La cantidad existente es "+this.productos.getOrDefault(p.getNombre(), p).getCantidad()+" unidades de "+this.productos.getOrDefault(p.getNombre(), p).getPesoUni()+" Kg/L.");
                System.out.println("");
            }else if(a==this.productos.getOrDefault(p.getNombre(), p).getCantidad()){ 
                this.productos.getOrDefault(p.getNombre(), p).setCantidad(this.productos.getOrDefault(p.getNombre(), p).getCantidad()-a);
                System.out.println("");
                System.out.println("Salidas de productos :");
                System.out.println("- "+p.getNombre()+" : "+a+" unidades de "+p.getPesoUni()+" Kg/L.");
                System.out.println("Las existencias se han agotado.");
            }else{
                this.productos.getOrDefault(p.getNombre(), p).setCantidad(this.productos.getOrDefault(p.getNombre(), p).getCantidad()-a);
                System.out.println("");
                System.out.println("Salidas de productos :");
                System.out.println("- "+p.getNombre()+" : "+a+" unidades de "+p.getPesoUni()+" Kg/L.");
            }
        }else{
            this.productos.put(p.getNombre(), p);
            System.out.println("");
                System.out.println("¡No hay tal cantidad existente!");
                System.out.println(" La cantidad existente es "+this.productos.getOrDefault(p.getNombre(), p).getCantidad()+" unidades de "+this.productos.getOrDefault(p.getNombre(), p).getPesoUni()+" Kg/L.");
                System.out.println("");
        }
    }
    
    public double ValorInvent(){
        double valor = 0;
        for(Producto p : this.productos.values()){
            valor += p.getValorTotal();
        }
        return valor;
    }
}
