/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto_2;

/**
 *
 * @author Natalia-Pc
 */
public class Impuesto {
    
    private String Nombre;
    private double Costo;

    public Impuesto(String Nombre, double Costo) {
        this.Nombre = Nombre;
        this.Costo = Costo;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getCosto() {
        return Costo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }
    
    
}
