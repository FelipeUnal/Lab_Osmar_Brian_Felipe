
package Ordeeeen;


public class orden1{
    private int tamaño;
    private int ingrediente;
    private int pre_bebida;
    private String corteza;
    private String tipo_bebida;
    private String tam_bebida;
    private int factura;
    private int preingre; 

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(int ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getPre_bebida() {
        return pre_bebida;
    }

    public void setPre_bebida(int pre_bebida) {
        this.pre_bebida = pre_bebida;
    }

    public String getCorteza() {
        return corteza;
    }

    public void setCorteza(String corteza) {
        this.corteza = corteza;
    }

    public String getTipo_bebida() {
        return tipo_bebida;
    }

    public void setTipo_bebida(String tipo_bebida) {
        this.tipo_bebida = tipo_bebida;
    }

    public String getTam_bebida() {
        return tam_bebida;
    }

    public void setTam_bebida(String tam_bebida) {
        this.tam_bebida = tam_bebida;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public int getPreingre() {
        return preingre;
    }

    public void setPreingre(int preingre) {
        this.preingre = preingre;
    }
   
    public orden1(){
        this.corteza="";
        this.ingrediente=0;
        this.pre_bebida=0;
        this.tamaño=0;
        this.tipo_bebida="";
        this.tam_bebida="";
        this.factura=0;
        this.preingre=0;
}
    public orden1(int ingrediente, String corteza,int tamaño, String tipo_bebida, String tam_bebida,  int pre_bebida, int factura, int preingre){
        this.corteza=corteza;
        this.ingrediente=ingrediente;
        this.pre_bebida=pre_bebida;
        this.tamaño=tamaño;
        this.tipo_bebida=tipo_bebida;
        this.tam_bebida=tam_bebida;
        this.factura=factura;
        this.preingre=preingre;
    }

       
   
}