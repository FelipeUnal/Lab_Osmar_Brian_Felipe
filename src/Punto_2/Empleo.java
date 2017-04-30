package Punto_2;




public class Empleo {
    
    private String Nombre;
    private double Salario;
    private Tiempo Entrada;
    private Tiempo Salida;
    private String FechaIN;
    private String FechaOUT;

    public Empleo(String Nombre, double Salario, String FechaIn, String FechaOut) {
        this.Nombre = Nombre;
        this.Salario = Salario;
        this.Entrada = new Tiempo();
        this.Salida =  new Tiempo();
        this.FechaIN = FechaIn;
        this.FechaOUT = FechaOut;
    }

    public void setFechaIN(String FechaIN) {
        this.FechaIN = FechaIN;
    }

    public void setFechaOUT(String FechaOUT) {
        this.FechaOUT = FechaOUT;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getSalario() {
        return Salario;
    }

    public Tiempo getEntrada() {
        return Entrada;
    }

    public Tiempo getSalida() {
        return Salida;
    }

    public String getFechaIN() {
        return FechaIN;
    }

    public String getFechaOUT() {
        return FechaOUT;
    }
    
    
}
