
package Punto_2;

public class Gastos {

    private Impuestos impuestos;
    private Establecimientos arriendo;
    private Empleados empleados;

    public Gastos(Impuestos impuestos, Establecimientos arriendo, Empleados empleados){
        this.impuestos = impuestos;
        this.arriendo = arriendo;
        this.empleados = empleados;
    }
    
    
    
    public double CalcularGastos(){
        return this.arriendo.getCostoTotal()+this.impuestos.CostoporImp()+this.empleados.CostodeEmpleados();
    }
    
    public void GastosTotales(){
        System.out.println("");
        System.out.println("Gasto totales : $ "+CalcularGastos());
        System.out.println("");
    }

    @Override
    public String toString() {
        return "\nLista de Gastos :\n" + "- Impuestos : $ " + impuestos.CostoporImp() + "\n- Arriendo : $ " + arriendo.getCostoTotal() + "\n- Empleados : $ " + empleados.CostodeEmpleados()+"\n";
    }
    
    
}
