package servidor.controladores;


import sop_corba.ControladorNotificacionesIntPOA;
import sop_corba.ControladorNotificacionesIntPackage.NotificacionDTO;

public class ControladorNotificacionesImp extends ControladorNotificacionesIntPOA {

    @Override
    public void registrarNotificacion(NotificacionDTO objNotificacion) {
        System.out.println("-------Nueva notificacion---------");
        System.out.println("Id: "+objNotificacion.Id);
        System.out.println("Tipo de Identificacion: "+objNotificacion.TipoIdentificacion);
        System.out.printf("ValorCompra: %,.2f",objNotificacion.ValorCompra);
        System.out.println("\nLugar de Compra: "+objNotificacion.LugarCompra);
        System.out.println("Fecha y Hora de Compra: "+objNotificacion.FechaHora);
        System.out.println("Medio de pago: "+objNotificacion.MedioPago);
        System.out.println("Nit de Empresa: "+objNotificacion.NitEmpresa);
    }
}
