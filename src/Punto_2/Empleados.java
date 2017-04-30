package Punto_2;

import java.text.ParseException;
import java.util.TreeMap;
import java.text.SimpleDateFormat;
import java.util.Date;




public class Empleados {
    private TreeMap<String,Persona> empleado;

    public Empleados() {
        this.empleado = new TreeMap<>();
    }
    
    public void addEmpleado(Persona persona){
        this.empleado.put(persona.getID(),persona);
    }
    
    public void ListadeEmpleados(){
        System.out.println("");
        System.out.println("Lista de Empleado :");
        for(Persona p : this.empleado.values()){
            if(this.empleado.containsKey(p.getID())!=true){
                System.out.println("La persona no esta registrada como empleado");
            }else{
                System.out.println("- "+p.getNombre()+" - "+p.getID()+": "+p.getCargo().getNombre());
            }
        }
    }
    
    public void horarios() throws ParseException{
        System.out.println("");
        System.out.println("Horarios por Empleado :");
        //Investigamos como ingresar fechas y este es elmetodomas sencillo
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        for(Persona p : this.empleado.values()){
            Date Entrada = sdf.parse(p.GetHorarioPersonalEntrada());
            Date Salida = sdf.parse(p.GetHorarioPersonalSalida());
            System.out.println("- "+p.getCargo().getNombre()+": "+p.getNombre()+" "+p.GetHorarioPersonalEntrada()+" - "+p.GetHorarioPersonalSalida());
            System.out.println("  "+p.getCargo().getFechaIN()+" - "+p.getCargo().getFechaOUT());
        }
        //Igualmente aun no nos meteremos en el registro de horas, ya que no guardaremos un historial
    }
    
    public void FindeContrato() throws ParseException{
        Date a = new Date(); 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        for(Persona p : this.empleado.values()){
            Date Salida = sdf.parse(p.getCargo().getFechaOUT());
            if(Salida.after(a)==true){
                this.empleado.remove(p.getID(), p);
            }
        }
        
    }
    
    public double CostodeEmpleados(){
        double total = 0;
        for(Persona p : this.empleado.values()){
            total += p.getCargo().getSalario();
        }
        return total;
    
    }
}
