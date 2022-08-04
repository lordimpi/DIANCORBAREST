package co.edu.unicauca.distribuidos.core.repositories;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import co.edu.unicauca.distribuidos.core.models.Compra;

@Service
public class CompraRepository {
    private ArrayList<Compra> listaCompras;

    public CompraRepository(ArrayList<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public Compra RegistrarCompra(Compra nuevaCompra){
        System.out.println("Invocando a RegistrarCompra");
        listaCompras.add(nuevaCompra);
        if (SumaComprasEnAño(nuevaCompra)) {
            
        }
        return nuevaCompra;
    }

    private boolean SumaComprasEnAño(Compra compra){
        return false;
    }
}
