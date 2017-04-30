
package Punto_2;

import java.text.ParseException;



public class ALoPaisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        
        
        Empleo ae = new Empleo("Chef",1500000,"27,06,2016","27,06,2017");
        ae.getEntrada().setHoras("06");
        ae.getEntrada().setMinutos("00");
        ae.getSalida().setHoras("14");
        ae.getSalida().setMinutos("00");
                
        Persona ap = new Persona("Fabian","Giraldo","1234567890",ae);
        
        Servicio[] service = new Servicio[5];
        service[0] = new Servicio("Electricidad",300000.0);
        service[1] = new Servicio("Agua",300000.0);
        service[2] = new Servicio("Gas",100000.0);
        service[3] = new Servicio("Comunicaciones",150000.0);
        service[4] = new Servicio("Seguridad",1000000.0);
        
        
        Producto a = new Producto("Tomate",500,0.025,11);
        Producto b = new Producto("Tomate",500,0.025,10);
        Producto c = new Producto("Agua",2000,6,6);
        
        Empleados em = new Empleados();
        
        Inventario i = new Inventario();
        
        
        Arriendo arr = new Arriendo("A lo Paisa # 1","Bogota","Carrera 15 A #15-25",500000,i);
        arr.AddService(0, service[0]);
        arr.AddService(1, service[1]);
        arr.AddService(2, service[2]);
        arr.AddService(3, service[3]);
        arr.AddService(4, service[4]);
        
        
        Impuestos imp = new Impuestos();
        Establecimientos est = new Establecimientos();
        
       
        
        
        est.addProduct(arr);
        
        Gastos g = new Gastos(imp,est,em);
        
        em.addEmpleado(ap);
        em.ListadeEmpleados();
        
        i.setArr(arr);
        i.addProduct(a);
        i.addProduct(b);
        i.addProduct(c);
        i.UtilizarProductos(c, 1);
        
        i.ListadeProductos();
        arr.ListaServ();
        em.horarios();
        System.out.println(g.toString());
        g.GastosTotales();
        
        
    }

}
