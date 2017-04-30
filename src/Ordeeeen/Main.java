package Ordeeeen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String [] args) throws IOException{
        orden1 orden1= new orden1(0,"",0,"","",0,0,0);
        orden2 orden2= new orden2("",0,"",0,"","",0,0);
        System.out.println("Bievenidos");
        System.out.println("Presione 1 se desea una pizza al gusto");
        System.out.println("Presione 2 si desea una pizza prefabriacada");
        int z;
        java.util.Scanner leer = new java.util.Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        z=leer.nextInt();
        if(z==1){ 
            int a,a1,b,b1,b2,c,c1,c2,d,d1,d2,e,e1,e2,y;
            System.out.println("En seguida prepararemos una pizza a tu gusto");
            System.out.println("El promedio en gramos por porcion pizza es de 350,ofrecemos 5 ingredientes");
            System.out.println("Escribe el promedio de cada uno");
            System.out.println("Cantidad de pollo(25 pesos el gramo)");
            orden1.setIngrediente(a=leer.nextInt());
            a1=a*25;
            System.out.println("Llevas "+ orden1.getIngrediente() + " gramos");
       
            
            System.out.println("Cantidad de carne(30 pesos el gramo)");
            b=leer.nextInt();
            b2=a+b;
            orden1.setIngrediente(b2);
            b1=b*30;
            System.out.println("Llevas "+ orden1.getIngrediente() + " gramos");
            
                   
            System.out.println("Cantidad de maiz(15 pesos el gramo)");
            c=leer.nextInt();
            c2=b2+c;
            orden1.setIngrediente(c2);
            c1=c*15;
            System.out.println("Llevas "+ orden1.getIngrediente() + " gramos");
            
            
            System.out.println("Cantidad de salchicha(12 pesos el gramo)");
            d=leer.nextInt();
            d2=c2+d;
            orden1.setIngrediente(d2);
            d1=d*12;
            System.out.println("Llevas "+ orden1.getIngrediente() + " gramos");
            
            System.out.println("Cantidad de champiñon(15 pesos el gramo)");
            e=leer.nextInt();
            e2=d2+e;
            orden1.setIngrediente(e2);
            e1=e*15;
            System.out.println("Llevas "+ orden1.getIngrediente() + " gramos");
            
            int TotalPizza= (a1+b1+c1+d1+e1);
            
            
            System.out.println("¿De que tamañao desea la  pizza ?");
            
            System.out.println("1.  6 Pulgadas");
            System.out.println("2.  9 Pulgadas");
            System.out.println("3.  12 Pulgadas");
            z=leer.nextInt();
               switch(z){
                   case 1:{
                       int tamaño= 6;
                        int preciofinal= TotalPizza*tamaño; 
                        orden1.setTamaño(tamaño);
                       orden1.setPreingre(preciofinal);
                            break;
                   }
                        case 2:{
                       int tamaño= 9;
                            int preciofinal= TotalPizza*tamaño; 
                            orden1.setTamaño(tamaño);
                       orden1.setPreingre(preciofinal);
                       
                            break;
                        }
                   case 3:{
                   int tamaño= 12;
                   orden1.setTamaño(tamaño);
                            int preciofinal= TotalPizza*tamaño; 
                       orden1.setPreingre(preciofinal);
                   
                            break;
             }
                    default:
                        {
                            System.out.println("Opcion invalida");  
                             break;
                        }
                        }
        
            
            
            
            System.out.println("¿Que tipo de corteza  quiere?");
            System.out.println("1.Grande");
            System.out.println("2.Pequeña");
            z=leer.nextInt();
            if(z==1){
                String corteza= "Grande";
                orden1.setCorteza(corteza);
            }else if(z==2){
                String corteza= "Pequeña";
                orden1.setCorteza(corteza);
            }else{
                 System.out.println("opcion invalida");
                 String corteza= "No especificada";
                 orden1.setCorteza(corteza);
            }
            
            System.out.println("¿Que tipo de bebida desea ?");
            System.out.println("1.Limonada: ");
            System.out.println("2.Cocacola: ");
            z=leer.nextInt();
            switch (z){
                case 1:
                    String Texto="Limonada";
                    orden1.setTipo_bebida(Texto);
                    System.out.println("De que tamaño desea la bebida?");
                    System.out.println("1.Grande");
                    System.out.println("2.pequeña");
                    y=leer.nextInt();
                    switch (y){
                        case 1:{
                            String TEXTO="Grande";
                            orden1.setTam_bebida(TEXTO);
                            int precio=6000;
                            orden1.setPre_bebida(precio);
                            break;
                            }
                        case 2:{
                            String TEXTO="Pequeña";
                            orden1.setTam_bebida(TEXTO);
                            int precio=4000;
                            orden1.setPre_bebida(precio);
                            break;
                        }
                        default:
                        {
                            System.out.println("Opcion invalida");
                             break;
                        }
                        
                    }
                    break;
                case 2:
                    String Texto1="CocaCola";
                    orden1.setTipo_bebida(Texto1);
                    System.out.println("De que tamaño desea la bebida?");
                    System.out.println("1.Grande");
                    System.out.println("2.pequeña");
                    y=leer.nextInt();
                    switch (y){
                        case 1:{
                            String texto="Grande";
                            orden1.setTam_bebida(texto);
                            int precio=5000;
                            orden1.setPre_bebida(precio);
                            break;
                        }
                        case 2:{
                            String texto="Pequeña";
                            orden1.setTam_bebida(texto);
                            int precio=3000;
                            orden1.setPre_bebida(precio);
                            break;
                        }
                        default:{
                             System.out.println("Opcion invalida");
                             break;
                        }
            }
                   break; 
                        
                    }                     
            int factura =((orden1.getPre_bebida()+orden1.getPreingre()));
            orden1.setFactura((int) factura);
            System.out.println("");
             System.out.println("");
            System.out.println("Factura");
             System.out.println("");
            System.out.println("La cuenta es: ");
             System.out.println("Porciones de pizza de: " +orden1.getIngrediente() +" gramos");
             System.out.println("Tipo de corteza: "+ orden1.getCorteza());
             System.out.println("Tamaño de la pizza: "+orden1.getTamaño()+" Pulgadas");
             System.out.println("Bebida: " + orden1.getTipo_bebida()+" "+orden1.getTam_bebida());
             System.out.println("Total: "+orden1.getFactura()+" pesos");
             System.out.println("Gracias por su compra");
        }
        else if(z==2){
            int a,b,c,d,e,f,g;         
            System.out.println("Todos los conjuntos tienen el mismo precio: $4000 por el tamano");
            System.out.println("Presione el numero del conjunto que quiere");
            System.out.println("1.Hawaiana");
            System.out.println("2.Pollo");
            System.out.println("3.Mexicana");
            System.out.println("4.Criolla");
            System.out.println("5.Napolitana");
            System.out.println("6.Vegetariana");
            a=leer.nextInt(); 
            orden2.setPre_pizza(4000);
            switch (a) {
                case 1:
                    {
                        String sTexto = "Hawaiana";
                        orden2.setConjunto(sTexto);
                        break;
                    }
                case 2:
                    {
                        String sTexto = "Pollo";
                        orden2.setConjunto(sTexto);
                        break;
                    }
                case 3:
                    {
                        String sTexto = "Mexicana";
                        orden2.setConjunto(sTexto);
                        break;
                    }
                case 4:
                    {
                        String sTexto = "Criolla";
                        orden2.setConjunto(sTexto);
                        break;
                    }
                case 5:
                    {
                        String sTexto = "Napolitana";
                        orden2.setConjunto(sTexto);
                        break;
                    }
                case 6:
                    {
                        String sTexto = "Vegetariana";
                        orden2.setConjunto(sTexto);
                        break;
                    }
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
                       
            System.out.println("¿Que tipo de corteza  quiere?");
            System.out.println("1.Grande");
            System.out.println("2.Pequeña");
            b=leer.nextInt();
            switch (b) {
                case 1:
                    {
                        String corteza="Grande";
                        orden2.setCorteza(corteza);
                        break;
                    }
                case 2:
                    {
                         String corteza="Pequeña";
                        orden2.setCorteza(corteza);                     
                        break;
                    }
                default:
                    System.out.println("Opcion invalida");
                    String corteza="No especificada";
                        orden2.setCorteza(corteza);   
                    break;
            }
            
            System.out.println("¿De que tamañao desea la  pizza ?");
            
            System.out.println("1.  6 Pulgadas");
            System.out.println("2.  9 Pulgadas");
            System.out.println("3.  12 Pulgadas");
            
            c=leer.nextInt();
            
            switch (c) {
                case 1:
                    {
                        int tp = 6;
                        orden2.setTamaño(tp);
                        break;
                    }
                case 2:
                    {
                       int tp = 9;
                        orden2.setTamaño(tp);
                        break;
                    }
                case 3:
                    {
                        int tp = 12;
                        orden2.setTamaño(tp);
                        break;
                    }
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            
            
             System.out.println("¿Que tipo de bebida desea ?");
             System.out.println("1.Limonada: ");
             System.out.println("2.Cocacola: ");
             d=leer.nextInt();
            switch (d) {
                case 1:
                    {
                        String sTexto = "Limonada";
                        orden2.setTipo_bebida(sTexto);
                        System.out.println("¿De que tamaño desea la bebida?");
                        System.out.println("1.Grande");
                        System.out.println("2.Pequena");
                        e=leer.nextInt();
                        switch(e){
                            case 1:
                            {
                                int j=6000;
                                String tam="Grande";
                                orden2.setTam_bebida(tam);
                                orden2.setPre_bebida(j);
                                break;
                            }
                            case 2:
                            {
                                int j=4000;
                                String tam="Pequena";
                                orden2.setTam_bebida(tam);
                                orden2.setPre_bebida(j);
                                break;
                            }
                            default:
                            System.out.println("Opcion invalida");
                            break;
                        }
                        break;
                    }
                case 2:
                    {
                        String sTexto = "Cocacola";
                        orden2.setTipo_bebida(sTexto);
                        System.out.println("¿De que tamaño desea la bebida?");
                        System.out.println("1.Grande");
                        System.out.println("2.Pequena");
                        e=leer.nextInt();
                       switch (e) {
                 case 1:
                            {
                                int k=5000;
                                String tam="Grande";
                                orden2.setTam_bebida(tam);
                                orden2.setPre_bebida(k);
                                break;
                            }
                            case 2:
                            {
                                int k=3000;
                                String tam="Pequena";
                                orden2.setTam_bebida(tam);
                                orden2.setPre_bebida(k);
                                break;
                            }
                            default:
                    System.out.println("Opcion invalida");
                    break;
            }
                    }
                default:
                    System.out.println("Opcion invalida");              
                    break;
            }
            
           int factura;                  
            factura = ((orden2.getPre_pizza()*orden2.getTamaño())+(orden2.getPre_bebida()));
            orden2.setFactura((int) factura);
            
            
            System.out.println("");
            System.out.println("");
            System.out.println("Factura");
            System.out.println("");
            System.out.println("La cuenta es: ");
            System.out.println("Pizza: " + orden2.getConjunto());
            System.out.println("Tipo de corteza: "+ orden2.getCorteza());
            System.out.println("Tamaño de la pizza: "+orden2.getTamaño()+" Pulgadas");
            System.out.println("Bebida: " + orden2.getTipo_bebida()+" "+orden2.getTam_bebida());
            System.out.println("Total: "+orden2.getFactura()+" pesos");
            System.out.println("Gracias por su compra");
                    }
          
    }
     

}