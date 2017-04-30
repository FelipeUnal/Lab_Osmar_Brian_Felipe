package Punto_2;

public class Arriendo {
    private String Nombre;
    private String Ciudad;
    private String Direccion;
    private double Costo;
    private Servicio[] servicios;
    private Inventario invent;

    public Arriendo(String Nombre, String Ciudad, String Direccion, double Costo, Inventario invent) {
        this.Ciudad = Ciudad;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Costo = Costo;
        this.servicios = new Servicio[5];
        this.invent = invent;
    }
    
    public void AddService(int a, Servicio s){
        this.servicios[a] = s;
    }
    
    public void removeService(int a){
        this.servicios[a] = null;
    }

    public Servicio[] getServicios() {
        return servicios;
    }

    public void setServicios(Servicio[] servicios) {
        this.servicios = servicios;
    }

    public Inventario getInvent() {
        return invent;
    }

    public void setInvent(Inventario invent) {
        this.invent = invent;
    }
    
    

    public String getDireccion() {
        return Direccion;
    }

    public double getCosto() {
        return this.Costo;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    
    public void ListaServ(){
        System.out.println(" ");
        System.out.println("Lista de Servicios : " + this.Nombre+" - "+this.Ciudad);
        for (int i = 0; i < this.servicios.length; i++) {
            if(this.servicios[i]==null){
                System.out.println("- Un servicio ha sido retirado!");
            }
            System.out.println("- "+this.servicios[i].getNombre()+" : $ "+this.servicios[i].getCosto());
        }
        System.out.println("Total :  $ "+CostodeServ());
    }
    
    public double CostodeServ(){
        double total = 0;
        for (int i = 0; i < this.servicios.length; i++) {
            total+= this.servicios[i].getCosto();
        }
        return total;
    }
    
    public double ValorLocal(){
        return CostodeServ()+this.Costo+this.invent.ValorInvent();
    }
}
