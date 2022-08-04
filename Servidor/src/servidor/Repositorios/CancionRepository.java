package servidor.Repositorios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import sop_corba.ControladorCancionIntPackage.CancionDTO;


public class CancionRepository implements CancionRepositoryInt
{  
    private final ArrayList<CancionDTO> listaCanciones;
    
    public CancionRepository()
    {
        this.listaCanciones= new ArrayList();
    }

   
    @Override
    public boolean registrarCancion(CancionDTO objCancion) {
        
        boolean bandera;        
        bandera= this.listaCanciones.add(objCancion);
        System.out.println("Archivo creado en el servidor");        
        return bandera;
    }

    @Override
    public List<CancionDTO> listarCanciones() {
        System.out.println("Listando canciones");
        return this.listaCanciones;
    }
       
}
