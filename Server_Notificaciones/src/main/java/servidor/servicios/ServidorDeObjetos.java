package servidor.servicios;
import servidor.controladores.ControladorNotificacionesImp;
import static servidor.utilidades.UtilidadesConsola.leerCadena;
import servidor.utilidades.UtilidadesRegistroS;

public class ServidorDeObjetos {
    public static void main(String args[]){
        try {
            //PIDIENDO DATOS
            /* 
            String[] vectorDatosLocalizarNS = new String[4];//almacena la información para localizar el ns
            vectorDatosLocalizarNS[0] = "-ORBInitialHost";
            System.out.println("Ingrese la dirección IP donde escucha el n_s");
            vectorDatosLocalizarNS[1] = leerCadena();
            vectorDatosLocalizarNS[2] = "-ORBInitialPort";
            System.out.println("Ingrese el puerto donde escucha el n_s");
            vectorDatosLocalizarNS[3] = leerCadena();
            */
            
            //IP: LOCALHOST, PUERTO: 2021
            String[] vectorDatosLocalizarNS = new String[4];//almacena la información para localizar el ns
            vectorDatosLocalizarNS[0] = "-ORBInitialHost";
            vectorDatosLocalizarNS[1] = "localhost";
            vectorDatosLocalizarNS[2] = "-ORBInitialPort";
            vectorDatosLocalizarNS[3] = "2021";
            
            ControladorNotificacionesImp objRemotoControladorNotificaciones = new ControladorNotificacionesImp();

            UtilidadesRegistroS.inicializarNameServices(vectorDatosLocalizarNS, objRemotoControladorNotificaciones,"ControladorNotificaciones");
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace(System.out);
        }
    }
}
