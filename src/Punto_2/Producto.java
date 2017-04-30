package Punto_2;


public class Producto {
    
    private String Nombre;
    private double Precio;
    private double PesoKg;
    private double Cantidad;

    public Producto(String Nombre, double Precio, double PesoKg, double Cantidad) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.PesoKg = PesoKg;
        this.Cantidad = Cantidad;
    }

    public void setPesoKg(double PesoKg) {
        this.PesoKg = PesoKg;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        if(Precio<0) Precio = 0;
        return Precio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    double getPesoUni() {
        if(PesoKg<0) PesoKg = 0;
        return this.PesoKg;
    }

    public double getCantidad() {
        if(Cantidad<0) Cantidad = 0;
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public double ExistenciaTotal(){
        return Cantidad*PesoKg;
    }
    
    public double getValorTotal(){
        return Cantidad*Precio;
    }

        
    
}
