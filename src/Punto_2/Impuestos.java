package Punto_2;
import java.util.ArrayList;

public class Impuestos {
    private ArrayList<Impuesto> impuesto;

    public Impuestos() {
        this.impuesto = new ArrayList<>();
    }
    
    public void añadir(Impuesto Impuesto){
        impuesto.add(Impuesto);
    }
    
    public void retirarImp(Impuesto Impuesto){
        impuesto.remove(Impuesto);
    }
    
    public void ListadeImpuetos(){
        System.out.println("");
        System.out.println("Lista de Impuestos :");
        for(Impuesto i : this.impuesto){
            System.out.println("- "+i.getNombre()+" : "+i.getCosto());
        }
    }
    
    public double CostoporImp(){
        double total = 0;
        for(Impuesto i : this.impuesto){
            total += i.getCosto();
        }
        return total;
    }
    
}
