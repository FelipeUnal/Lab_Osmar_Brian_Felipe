package Ordeeeen;
public class orden2 {

    public int getTamaño() {
        return tamaño;
    }

    public int getFactura() {
        return factura;
    }

    public String getCorteza() {
        return corteza;
    }

    public String getTipo_bebida() {
        return tipo_bebida;
    }

    public String getConjunto() {
        return conjunto;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public void setCorteza(String corteza) {
        this.corteza = corteza;
    }

    public void setTipo_bebida(String tipo_bebida) {
        this.tipo_bebida = tipo_bebida;
    }

    public void setConjunto(String conjunto) {
        this.conjunto = conjunto;
    }
     public String getTam_bebida() {
        return tam_bebida;
    }

    public void setTam_bebida(String tam_bebida) {
        this.tam_bebida = tam_bebida;
    }

    public int getPre_pizza() {
        return pre_pizza;
    }
    
    public void setPre_pizza(int pre_pizza) {
        this.pre_pizza = pre_pizza;
    }
    
    public int getPre_bebida() {
        return pre_bebida;
    }

    public void setPre_bebida(int pre_bebida) {
        this.pre_bebida = pre_bebida;
    }
   
    private int tamaño;
    private int factura;
    private String corteza;
    private String tipo_bebida;
    private String conjunto;
    private String tam_bebida;
    private int pre_pizza;
    private int pre_bebida;


    
     public orden2(){
        this.pre_pizza=0;
        this.corteza="";
        this.pre_bebida=0;
        this.conjunto="";
        this.factura=0;
        this.tamaño=0;
        this.tipo_bebida="";
        this.tam_bebida="";
     
    
}
     public orden2(String conjunto,int pre_pizza,String corteza,int tamaño, String tipo_bebida, String tam_bebida ,int pre_bebida,  int factura){
        this.corteza=corteza;
        this.pre_pizza=0;
        this.pre_bebida=0;
        this.conjunto=conjunto;
        this.factura=factura;
        this.tamaño=0;
        this.tipo_bebida=tipo_bebida;
        this.tam_bebida="";
    }
  
}
