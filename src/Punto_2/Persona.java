
package Punto_2;


public class Persona {
    
    private String Nombre;
    private String Apellido;
    private String ID;
    private Empleo Cargo;

    public Persona(String Nombre, String Apellido, String ID, Empleo Cargo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ID = ID;
        this.Cargo = Cargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getID() {
        return ID;
    }

    public Empleo getCargo() {
        return Cargo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setCargo(Empleo Cargo) {
        this.Cargo = Cargo;
    }
    
    public String GetHorarioPersonalEntrada(){
        return this.getCargo().getEntrada().GetHorario();
    }
    
    public String GetHorarioPersonalSalida(){
        return this.getCargo().getSalida().GetHorario();
    }
    
}
