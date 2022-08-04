package cliente.vista;

import Models.Compra;
import java.util.Date;
import servicios.CompraServices;
import utilidades.UtilidadesConsola;

public class Menu {
    
    private Compra objCompra;
    private CompraServices objCompraServices;
    
    public Menu() {
    }
    
    public void ejecutarMenuPrincipal() {
        int opcion = 0;
        do {
            System.out.println("\t===Menu===");
            System.out.println("1. Registrar compra");
            System.out.println("2. Salir");
            
            opcion = UtilidadesConsola.leerEntero();
            
            switch (opcion) {
                case 1 ->
                    Opcion1();
                case 2 ->
                    System.out.println("Salir...");
                default ->
                    System.out.println("Opción incorrecta");
            }
            
        } while (opcion != 2);
    }
    
    private void Opcion1() {
        objCompraServices = new CompraServices();
        objCompra = new Compra();
        System.out.println("\nRegistrando un nuevo Compra");
        System.out.println("Ingrese el numero de identifiacion: ");
        objCompra.setIdentifiacion(UtilidadesConsola.leerCadena());
        System.out.println("Ingrese el tipo de identificacion: ");
        objCompra.setTipoIdentifiacion(UtilidadesConsola.leerCadena());
        System.out.println("Ingrese el valor de compra: ");
        objCompra.setValorCompra(UtilidadesConsola.leerDouble());
        System.out.println("Ingrese el lugar de compra: ");
        objCompra.setLugarCompra(UtilidadesConsola.leerCadena());
        objCompra.setFechaHora(new Date());
        System.out.println("Ingrese el medio de pago: ");
        objCompra.setMedioPago(UtilidadesConsola.leerCadena());
        System.out.println("Ingrese el nit de la empresa: ");
        objCompra.setNitEmpresa(UtilidadesConsola.leerCadena());
        
        if (objCompraServices.registrarCompra(objCompra) == null) {
            System.out.println("No se pudo registrar la compra...\n");
            return;
        }
        System.out.println("Compra registrada con exito.\n");
    }
    
}
