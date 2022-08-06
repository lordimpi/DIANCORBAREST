package co.edu.unicauca.distribuidos.core.utilidades;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import sop_corba.ControladorNotificacionesInt;
import sop_corba.ControladorNotificacionesIntHelper;

public class UtilidadesNSC {

    public static ControladorNotificacionesInt obtenerObjRemoto(String[] vectorDatosNS, String idObjetoRemoto) {

        ControladorNotificacionesInt ref = null;
        try {
            ORB orb = ORB.init(vectorDatosNS, null);

            // se obtiene un link al name service
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // *** Resuelve la referencia del objeto en el N_S ***            
            ref = ControladorNotificacionesIntHelper.narrow(ncRef.resolve_str(idObjetoRemoto));
        } catch (Exception e) {
            System.out.println("Error al localizar el objeto remoto");
        }

        return ref;
    }

}
