package co.edu.unicauca.distribuidos.core.controllers;

import co.edu.unicauca.distribuidos.core.ServidorDeDeclaracionApplication;
import co.edu.unicauca.distribuidos.core.models.Compra;
import static co.edu.unicauca.distribuidos.core.utilidades.UtilidadesConsola.leerCadena;
import co.edu.unicauca.distribuidos.core.utilidades.UtilidadesNSC;
import org.springframework.boot.SpringApplication;
import sop_corba.ControladorNotificacionesInt;
import sop_corba.ControladorNotificacionesIntPackage.NotificacionDTO;

public class NotificacionesController {

    private ControladorNotificacionesInt objRemoto;

    public NotificacionesController() {
        ObtenerOR();
    }

    public void ObtenerOR() {
        String[] vectorDatosLocalizarNS = new String[4];
        vectorDatosLocalizarNS[0] = "-ORBInitialHost";
        //System.out.println("Ingrese la dirección IP donde escucha el n_s");
        vectorDatosLocalizarNS[1] = "localhost";
        vectorDatosLocalizarNS[2] = "-ORBInitialPort";
        //System.out.println("Ingrese el puerto donde escucha el n_s");
        vectorDatosLocalizarNS[3] = "2021";

        objRemoto = UtilidadesNSC.obtenerObjRemoto(vectorDatosLocalizarNS, "ControladorNotificaciones");

    }

    public void Notificar(Compra compra) {
        NotificacionDTO notificacion = new NotificacionDTO();
        notificacion.Id = compra.getIdentifiacion();
        notificacion.LugarCompra = compra.getLugarCompra();
        notificacion.FechaHora = compra.getFechaHora().toString();
        notificacion.MedioPago = compra.getMedioPago();
        notificacion.NitEmpresa = compra.getNitEmpresa();
        notificacion.TipoIdentificacion = compra.getTipoIdentifiacion();
        notificacion.ValorCompra = compra.getValorCompra();
        objRemoto.registrarNotificacion(notificacion);
    }

}
